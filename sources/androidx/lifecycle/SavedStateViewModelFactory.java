package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateViewModelFactory extends ViewModelProvider.KeyedFactory {
    private static final Class<?>[] ANDROID_VIEWMODEL_SIGNATURE = {Application.class, SavedStateHandle.class};
    private static final Class<?>[] VIEWMODEL_SIGNATURE = {SavedStateHandle.class};
    private final Application mApplication;
    private final Bundle mDefaultArgs;
    private final ViewModelProvider.Factory mFactory;
    private final Lifecycle mLifecycle;
    private final SavedStateRegistry mSavedStateRegistry;

    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner owner) {
        this(application, owner, null);
    }

    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner owner, Bundle defaultArgs) {
        ViewModelProvider.Factory newInstanceFactory;
        this.mSavedStateRegistry = owner.getSavedStateRegistry();
        this.mLifecycle = owner.getLifecycle();
        this.mDefaultArgs = defaultArgs;
        this.mApplication = application;
        if (application != null) {
            newInstanceFactory = ViewModelProvider.AndroidViewModelFactory.getInstance(application);
        } else {
            newInstanceFactory = ViewModelProvider.NewInstanceFactory.getInstance();
        }
        this.mFactory = newInstanceFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: InvocationTargetException -> 0x0046, InstantiationException -> 0x0048, IllegalAccessException -> 0x004a, TryCatch #2 {IllegalAccessException -> 0x004a, InstantiationException -> 0x0048, InvocationTargetException -> 0x0046, blocks: (B:13:0x0030, B:15:0x0034, B:23:0x005a, B:22:0x004c), top: B:31:0x0030 }] */
    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.String r7, java.lang.Class<T> r8) {
        /*
            r6 = this;
            java.lang.Class<androidx.lifecycle.AndroidViewModel> r0 = androidx.lifecycle.AndroidViewModel.class
            boolean r0 = r0.isAssignableFrom(r8)
            if (r0 == 0) goto L13
            android.app.Application r1 = r6.mApplication
            if (r1 == 0) goto L13
            java.lang.Class<?>[] r1 = androidx.lifecycle.SavedStateViewModelFactory.ANDROID_VIEWMODEL_SIGNATURE
            java.lang.reflect.Constructor r1 = findMatchingConstructor(r8, r1)
            goto L19
        L13:
            java.lang.Class<?>[] r1 = androidx.lifecycle.SavedStateViewModelFactory.VIEWMODEL_SIGNATURE
            java.lang.reflect.Constructor r1 = findMatchingConstructor(r8, r1)
        L19:
            if (r1 != 0) goto L22
            androidx.lifecycle.ViewModelProvider$Factory r7 = r6.mFactory
            androidx.lifecycle.ViewModel r7 = r7.create(r8)
            return r7
        L22:
            androidx.savedstate.SavedStateRegistry r2 = r6.mSavedStateRegistry
            androidx.lifecycle.Lifecycle r3 = r6.mLifecycle
            android.os.Bundle r4 = r6.mDefaultArgs
            androidx.lifecycle.SavedStateHandleController r7 = androidx.lifecycle.SavedStateHandleController.create(r2, r3, r7, r4)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4c
            android.app.Application r0 = r6.mApplication     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L4a
            if (r0 == 0) goto L4c
            androidx.lifecycle.SavedStateHandle r4 = r7.getHandle()     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L4a
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L4a
            r5[r2] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L4a
            r5[r3] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L4a
            java.lang.Object r0 = r1.newInstance(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L4a
            androidx.lifecycle.ViewModel r0 = (androidx.lifecycle.ViewModel) r0     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L4a
            goto L5a
        L46:
            r7 = move-exception
            goto L60
        L48:
            r7 = move-exception
            goto L78
        L4a:
            r7 = move-exception
            goto L91
        L4c:
            androidx.lifecycle.SavedStateHandle r0 = r7.getHandle()     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L4a
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L4a
            r3[r2] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L4a
            java.lang.Object r0 = r1.newInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L4a
            androidx.lifecycle.ViewModel r0 = (androidx.lifecycle.ViewModel) r0     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L4a
        L5a:
            java.lang.String r1 = "androidx.lifecycle.savedstate.vm.tag"
            r0.setTagIfAbsent(r1, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L46 java.lang.InstantiationException -> L48 java.lang.IllegalAccessException -> L4a
            return r0
        L60:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "An exception happened in constructor of "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.Throwable r7 = r7.getCause()
            r0.<init>(r8, r7)
            throw r0
        L78:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "A "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = " cannot be instantiated."
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8, r7)
            throw r0
        L91:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to access "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.SavedStateViewModelFactory.create(java.lang.String, java.lang.Class):androidx.lifecycle.ViewModel");
    }

    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory, androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) create(canonicalName, cls);
    }

    private static <T> Constructor<T> findMatchingConstructor(Class<T> cls, Class<?>[] clsArr) {
        for (Object obj : cls.getConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    void onRequery(ViewModel viewModel) {
        SavedStateHandleController.attachHandleIfNeeded(viewModel, this.mSavedStateRegistry, this.mLifecycle);
    }
}
