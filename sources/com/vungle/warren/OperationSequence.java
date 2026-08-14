package com.vungle.warren;

import com.vungle.warren.AdLoader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
class OperationSequence {
    private final PriorityQueue<Entry> queue = new PriorityQueue<>(11, new Comparator<Entry>() { // from class: com.vungle.warren.OperationSequence.1
        @Override // java.util.Comparator
        public int compare(Entry entry, Entry entry2) {
            int iCompareTo = Integer.valueOf(entry.operation.priority).compareTo(Integer.valueOf(entry2.operation.priority));
            return iCompareTo == 0 ? Integer.valueOf(entry.order).compareTo(Integer.valueOf(entry2.order)) : iCompareTo;
        }
    });

    OperationSequence() {
    }

    static class Entry {
        private static final AtomicInteger seq = new AtomicInteger();
        AdLoader.Operation operation;
        private final int order = seq.incrementAndGet();

        Entry(AdLoader.Operation operation) {
            this.operation = operation;
        }
    }

    Entry remove(AdRequest adRequest) {
        Entry next;
        Iterator<Entry> it = this.queue.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.operation.request.equals(adRequest)) {
                break;
            }
        }
        this.queue.remove(next);
        return next;
    }

    boolean offer(Entry entry) {
        return this.queue.offer(entry);
    }

    Entry poll() {
        return this.queue.poll();
    }

    List<Entry> removeAll() {
        ArrayList arrayList = new ArrayList();
        while (!this.queue.isEmpty()) {
            Entry entryPoll = this.queue.poll();
            if (entryPoll != null) {
                arrayList.add(entryPoll);
            }
        }
        return arrayList;
    }
}
