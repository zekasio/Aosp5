package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FC extends AbstractC1122bx {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"K3xavpXOVVnTPS8V8FmisIpuez1NdmFn", "QjoCrUVtXYT15qNhmppxWCsnlOvXMRWn", "HVYav4KnfeU3lAWSFDiSVAYelCZD7hW1", "SKhwmHHGUoQzTLK2kw5WKB1efbL3jYLm", "aZpNXGptJoOcjVlsPlgA0RFw1bcc4fI1", "y8DDj9eTKGlZyxtiH83YwnquX80t2qUq", "Eqht3urb", "PkOCx2w9GPXTa0iGANdHxOJetOGxrMw0"};
    public ArrayList<AbstractC02244l> A0A = new ArrayList<>();
    public ArrayList<AbstractC02244l> A07 = new ArrayList<>();
    public ArrayList<AnonymousClass41> A09 = new ArrayList<>();
    public ArrayList<AnonymousClass40> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AbstractC02244l>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<AnonymousClass41>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<AnonymousClass40>> A03 = new ArrayList<>();
    public ArrayList<AbstractC02244l> A00 = new ArrayList<>();
    public ArrayList<AbstractC02244l> A04 = new ArrayList<>();
    public ArrayList<AbstractC02244l> A06 = new ArrayList<>();
    public ArrayList<AbstractC02244l> A02 = new ArrayList<>();

    private void A01(AnonymousClass40 anonymousClass40) {
        if (anonymousClass40.A05 != null) {
            A07(anonymousClass40, anonymousClass40.A05);
        }
        if (anonymousClass40.A04 != null) {
            A07(anonymousClass40, anonymousClass40.A04);
        }
    }

    private void A03(final AbstractC02244l abstractC02244l) {
        final View view = abstractC02244l.A0H;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A06.add(abstractC02244l);
        viewPropertyAnimatorAnimate.setDuration(A07()).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3v
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                view.setAlpha(1.0f);
                this.A02.A0P(abstractC02244l);
                this.A02.A06.remove(abstractC02244l);
                this.A02.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    private void A04(AbstractC02244l abstractC02244l) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        abstractC02244l.A0H.animate().setInterpolator(A0B);
        A0K(abstractC02244l);
    }

    private final void A05(List<AbstractC02244l> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A06(List<AnonymousClass40> list, AbstractC02244l abstractC02244l) {
        for (int size = list.size() - 1; size >= 0; size--) {
            AnonymousClass40 anonymousClass40 = list.get(size);
            if (A07(anonymousClass40, abstractC02244l) && anonymousClass40.A05 == null && anonymousClass40.A04 == null) {
                list.remove(anonymousClass40);
            }
        }
    }

    private boolean A07(AnonymousClass40 anonymousClass40, AbstractC02244l abstractC02244l) {
        boolean z = false;
        if (anonymousClass40.A04 == abstractC02244l) {
            anonymousClass40.A04 = null;
        } else if (anonymousClass40.A05 == abstractC02244l) {
            anonymousClass40.A05 = null;
            z = true;
        } else {
            return false;
        }
        abstractC02244l.A0H.setAlpha(1.0f);
        abstractC02244l.A0H.setTranslationX(0.0f);
        abstractC02244l.A0H.setTranslationY(0.0f);
        A0Q(abstractC02244l, z);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final void A0I() {
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            AnonymousClass41 anonymousClass41 = this.A09.get(size);
            View view = anonymousClass41.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0O(anonymousClass41.A04);
            this.A09.remove(size);
        }
        for (int size2 = this.A0A.size() - 1; size2 >= 0; size2--) {
            A0P(this.A0A.get(size2));
            this.A0A.remove(size2);
        }
        for (int size3 = this.A07.size() - 1; size3 >= 0; size3--) {
            AbstractC02244l abstractC02244l = this.A07.get(size3);
            abstractC02244l.A0H.setAlpha(1.0f);
            A0N(abstractC02244l);
            this.A07.remove(size3);
        }
        for (int size4 = this.A08.size() - 1; size4 >= 0; size4--) {
            A01(this.A08.get(size4));
        }
        this.A08.clear();
        if (!A0L()) {
            return;
        }
        int listCount = this.A05.size();
        for (int i = listCount - 1; i >= 0; i--) {
            ArrayList<AnonymousClass41> arrayList = this.A05.get(i);
            int listCount2 = arrayList.size();
            for (int i2 = listCount2 - 1; i2 >= 0; i2--) {
                AnonymousClass41 moveInfo = arrayList.get(i2);
                View view2 = moveInfo.A04.A0H;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                A0O(moveInfo.A04);
                arrayList.remove(i2);
                if (arrayList.isEmpty()) {
                    this.A05.remove(arrayList);
                }
            }
        }
        for (int size5 = this.A01.size() - 1; size5 >= 0; size5--) {
            ArrayList<AbstractC02244l> arrayList2 = this.A01.get(size5);
            int i3 = arrayList2.size();
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                AbstractC02244l item = arrayList2.get(i4);
                item.A0H.setAlpha(1.0f);
                A0N(item);
                arrayList2.remove(i4);
                if (arrayList2.isEmpty()) {
                    this.A01.remove(arrayList2);
                }
            }
        }
        for (int size6 = this.A03.size() - 1; size6 >= 0; size6--) {
            ArrayList<AnonymousClass40> arrayList3 = this.A03.get(size6);
            int j = arrayList3.size();
            for (int i5 = j - 1; i5 >= 0; i5--) {
                A01(arrayList3.get(i5));
                if (arrayList3.isEmpty()) {
                    this.A03.remove(arrayList3);
                }
            }
        }
        A05(this.A06);
        A05(this.A04);
        A05(this.A00);
        A05(this.A02);
        A0A();
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    @Override // com.facebook.ads.redexgen.X.C4P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J() {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FC.A0J():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        r5 = r5 - 1;
     */
    @Override // com.facebook.ads.redexgen.X.C4P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(com.facebook.ads.redexgen.X.AbstractC02244l r10) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FC.A0K(com.facebook.ads.redexgen.X.4l):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    @Override // com.facebook.ads.redexgen.X.C4P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0L() {
        /*
            r4 = this;
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.40> r0 = r4.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.41> r0 = r4.A09
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A0A
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A04
            boolean r3 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FC.A0C
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La5
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FC.A0C
            java.lang.String r1 = "HATKbuX1ioRbKjbJza4uRkbMkwnilInw"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "55W5G9gSwoJRpeM2nuMk9rdzPBhIsXI5"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A00
            boolean r3 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FC.A0C
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La2
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FC.A0C
            java.lang.String r1 = "PBqWGImhwZdo7IXQpaNFK9QlBHxMp4wk"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto Lb8
        L73:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.41>> r0 = r4.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.4l>> r0 = r4.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.40>> r3 = r4.A03
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.FC.A0C
            r0 = 7
            r1 = r1[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            r0 = 119(0x77, float:1.67E-43)
            if (r1 == r0) goto Lab
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        La2:
            if (r3 == 0) goto Lb8
            goto L73
        La5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lab:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.FC.A0C
            java.lang.String r1 = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK"
            r0 = 7
            r2[r0] = r1
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lba
        Lb8:
            r0 = 1
        Lb9:
            return r0
        Lba:
            r0 = 0
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FC.A0L():boolean");
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0M(@NonNull AbstractC02244l abstractC02244l, @NonNull List<Object> list) {
        return !list.isEmpty() || super.A0M(abstractC02244l, list);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1122bx
    public final boolean A0R(AbstractC02244l abstractC02244l) {
        A04(abstractC02244l);
        abstractC02244l.A0H.setAlpha(0.0f);
        this.A07.add(abstractC02244l);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1122bx
    public final boolean A0S(AbstractC02244l abstractC02244l) {
        A04(abstractC02244l);
        this.A0A.add(abstractC02244l);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1122bx
    public final boolean A0T(AbstractC02244l abstractC02244l, int i, int i2, int i3, int i4) {
        View view = abstractC02244l.A0H;
        int deltaY = i + ((int) abstractC02244l.A0H.getTranslationX());
        int fromX = (int) abstractC02244l.A0H.getTranslationY();
        int i5 = i2 + fromX;
        A04(abstractC02244l);
        int fromY = i3 - deltaY;
        int i6 = i4 - i5;
        if (fromY == 0 && i6 == 0) {
            A0O(abstractC02244l);
            return false;
        }
        if (fromY != 0) {
            int deltaX = -fromY;
            view.setTranslationX(deltaX);
        }
        if (i6 != 0) {
            int deltaX2 = -i6;
            view.setTranslationY(deltaX2);
        }
        this.A09.add(new AnonymousClass41(abstractC02244l, deltaY, i5, i3, i4));
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1122bx
    public final boolean A0U(AbstractC02244l abstractC02244l, AbstractC02244l abstractC02244l2, int deltaX, int deltaY, int i, int i2) {
        if (abstractC02244l == abstractC02244l2) {
            return A0T(abstractC02244l, deltaX, deltaY, i, i2);
        }
        float translationX = abstractC02244l.A0H.getTranslationX();
        float translationY = abstractC02244l.A0H.getTranslationY();
        float alpha = abstractC02244l.A0H.getAlpha();
        A04(abstractC02244l);
        int i3 = (int) ((i - deltaX) - translationX);
        int i4 = (int) ((i2 - deltaY) - translationY);
        abstractC02244l.A0H.setTranslationX(translationX);
        abstractC02244l.A0H.setTranslationY(translationY);
        abstractC02244l.A0H.setAlpha(alpha);
        if (abstractC02244l2 != null) {
            A04(abstractC02244l2);
            abstractC02244l2.A0H.setTranslationX(-i3);
            abstractC02244l2.A0H.setTranslationY(-i4);
            abstractC02244l2.A0H.setAlpha(0.0f);
        }
        this.A08.add(new AnonymousClass40(abstractC02244l, abstractC02244l2, deltaX, deltaY, i, i2));
        return true;
    }

    public final void A0V() {
        if (!A0L()) {
            A0A();
        }
    }

    public final void A0W(final AnonymousClass40 anonymousClass40) {
        final View view;
        AbstractC02244l abstractC02244l = anonymousClass40.A05;
        if (abstractC02244l == null) {
            view = null;
        } else {
            view = abstractC02244l.A0H;
        }
        AbstractC02244l abstractC02244l2 = anonymousClass40.A04;
        final View view2 = abstractC02244l2 != null ? abstractC02244l2.A0H : null;
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(A05());
            this.A02.add(anonymousClass40.A05);
            duration.translationX(anonymousClass40.A02 - anonymousClass40.A00);
            duration.translationY(anonymousClass40.A03 - anonymousClass40.A01);
            ViewPropertyAnimator oldViewAnim = duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3y
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    this.A03.A0Q(anonymousClass40.A05, true);
                    this.A03.A02.remove(anonymousClass40.A05);
                    this.A03.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            });
            oldViewAnim.start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.A02.add(anonymousClass40.A04);
            ViewPropertyAnimator newViewAnimation = viewPropertyAnimatorAnimate.translationX(0.0f);
            newViewAnimation.translationY(0.0f).setDuration(A05()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3z
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorAnimate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    this.A03.A0Q(anonymousClass40.A04, false);
                    this.A03.A02.remove(anonymousClass40.A04);
                    this.A03.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
    }

    public final void A0X(final AbstractC02244l abstractC02244l) {
        final View view = abstractC02244l.A0H;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A00.add(abstractC02244l);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(A04()).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3w
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                this.A02.A0N(abstractC02244l);
                this.A02.A00.remove(abstractC02244l);
                this.A02.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    public final void A0Y(final AbstractC02244l abstractC02244l, int i, int i2, int i3, int deltaX) {
        final View view = abstractC02244l.A0H;
        final int i4 = i3 - i;
        final int deltaX2 = deltaX - i2;
        if (i4 != 0) {
            view.animate().translationX(0.0f);
        }
        if (deltaX2 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A04.add(abstractC02244l);
        ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.setDuration(A06());
        animation.setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3x
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (i4 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (deltaX2 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                this.A04.A0O(abstractC02244l);
                this.A04.A04.remove(abstractC02244l);
                this.A04.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }
}
