package com.facebook.ads.redexgen.X;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.Layout;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MS {
    public static byte[] A00;
    public static final int A01;
    public static final int A02;
    public static final ConcurrentHashMap<Integer, Integer> A03;
    public static final AtomicInteger A04;

    public static String A0D(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A00 = new byte[]{-8, -26, -13, -8, -78, -8, -22, -9, -18, -21, -78, -14, -22, -23, -18, -6, -14};
    }

    static {
        A0E();
        A02 = C2U.A01(-1, 0);
        A01 = C2U.A01(ViewCompat.MEASURED_STATE_MASK, 115);
        A04 = new AtomicInteger(1);
        A03 = new ConcurrentHashMap<>();
    }

    public static int A00() {
        int newValue;
        int i;
        do {
            newValue = A04.get();
            i = newValue + 1;
            if (i > 16777215) {
                i = 1;
            }
        } while (!A04.compareAndSet(newValue, i));
        return newValue;
    }

    public static int A01(int i) {
        return (int) TypedValue.applyDimension(2, i, Lr.A01);
    }

    public static int A02(int i) {
        if (A0a(i)) {
            return C2U.A02(i, -1, 0.4f);
        }
        return C2U.A02(i, ViewCompat.MEASURED_STATE_MASK, 0.2f);
    }

    public static int A03(TextView textView) {
        Layout layout;
        int lines;
        if (textView == null || textView.getLayout() == null || (lines = (layout = textView.getLayout()).getLineCount()) <= 0) {
            return 0;
        }
        double ellipsisCount = layout.getEllipsisCount(lines - 1);
        double charsInFirstLine = ((double) textView.getText().length()) - ellipsisCount;
        double ellipsisCount2 = Math.ceil(ellipsisCount / charsInFirstLine);
        return (int) ellipsisCount2;
    }

    public static int A04(TextView textView, int lines) {
        int lineHeightTitle = A03(textView);
        int i = 0;
        int lineHeight = textView.getLineHeight();
        while (lines > lineHeight && i < lineHeightTitle) {
            i++;
            lines -= lineHeight;
        }
        return i;
    }

    public static Drawable A05(int i, int i2) {
        return A08(i, A02(i), i2);
    }

    public static Drawable A06(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(i2);
        return gradientDrawable;
    }

    public static Drawable A07(int i, int i2) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, i2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    public static Drawable A08(int i, int i2, int i3) {
        return A09(i, i2, i, i3);
    }

    public static Drawable A09(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new RippleDrawable(ColorStateList.valueOf(i2), A06(i, i4), A07(i3, i4));
        }
        return A0A(i, i2, i4);
    }

    public static StateListDrawable A0A(int i, int i2, int i3) {
        return A0B(new int[][]{new int[]{R.attr.state_pressed}, new int[0]}, new int[]{i2, i}, i3);
    }

    public static StateListDrawable A0B(int[][] iArr, int[] iArr2, int i) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(iArr2[i2]);
            gradientDrawable.setCornerRadius(i);
            stateListDrawable.addState(iArr[i2], gradientDrawable);
        }
        return stateListDrawable;
    }

    @Nullable
    public static TextView A0C(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                return (TextView) childAt;
            }
            if (childAt instanceof ViewGroup) {
                A0C((ViewGroup) childAt);
            }
        }
        return null;
    }

    public static void A0F(int i, View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i / 3);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration((i / 3) * 2);
        scaleAnimation2.setInterpolator(new BounceInterpolator());
        scaleAnimation.setAnimationListener(new C0833Tl(view, scaleAnimation2));
        view.startAnimation(scaleAnimation);
    }

    public static void A0G(int i, View view) {
        Integer num = A03.get(Integer.valueOf(i));
        if (num != null) {
            view.setId(num.intValue());
        } else {
            A0K(view);
        }
    }

    public static void A0H(@Nullable View view) {
        A0N(view, 8);
    }

    public static void A0I(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            A0T((ViewGroup) parent);
        }
    }

    public static void A0J(@Nullable View view) {
        ViewGroup viewGroup;
        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
            viewGroup.removeView(view);
        }
    }

    public static void A0K(@Nullable View view) {
        if (view == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            view.setId(View.generateViewId());
        } else {
            view.setId(A00());
        }
    }

    public static void A0L(@Nullable View view) {
        A0N(view, 0);
    }

    public static void A0M(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(new ColorDrawable(i));
        } else {
            view.setBackgroundDrawable(new ColorDrawable(i));
        }
    }

    public static void A0N(@Nullable View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public static void A0O(View view, int i, int i2) {
        A0S(view, A08(i, A02(i), i2));
    }

    public static void A0P(View view, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A02, A01});
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setStroke(i2, i3);
        A0S(view, gradientDrawable);
    }

    public static void A0Q(View view, int i, int i2, int i3) {
        A0S(view, A09(i, A02(i), i2, i3));
    }

    public static void A0R(View view, Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A02, A01});
        gradientDrawable.setCornerRadius(0.0f);
        A0S(view, gradientDrawable);
    }

    public static void A0S(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void A0T(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT > 19) {
            A0U(viewGroup, 200);
        }
    }

    public static void A0U(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT > 19) {
            A0W(viewGroup, new AutoTransition(), i);
        }
    }

    public static void A0V(ViewGroup viewGroup, Transition transition) {
        if (Build.VERSION.SDK_INT > 19) {
            A0W(viewGroup, transition, 200);
        }
    }

    @TargetApi(19)
    public static void A0W(ViewGroup viewGroup, Transition transition, int i) {
        transition.setDuration(i);
        transition.setInterpolator(new AccelerateDecelerateInterpolator());
        TransitionManager.beginDelayedTransition(viewGroup, transition);
    }

    public static void A0X(TextView textView, boolean z, int i) {
        Typeface typefaceCreate;
        if (!z) {
            typefaceCreate = Typeface.create(Typeface.SANS_SERIF, 0);
        } else {
            typefaceCreate = Build.VERSION.SDK_INT >= 21 ? Typeface.create(A0D(0, 17, 46), 0) : Typeface.create(Typeface.SANS_SERIF, 1);
        }
        textView.setTypeface(typefaceCreate);
        textView.setTextSize(2, i);
    }

    public static void A0Y(@Nullable Toast toast, String str, int i, int i2, int i3) {
        if (toast == null) {
            return;
        }
        toast.setGravity(i, i2, i3);
        TextView toastTextView = A0C((ViewGroup) toast.getView());
        if (toastTextView != null) {
            toastTextView.setText(str);
            toastTextView.setGravity(17);
        }
    }

    public static void A0Z(View... viewArr) {
        for (View view : viewArr) {
            A0J(view);
        }
    }

    public static boolean A0a(int i) {
        return C2U.A00(i) < 0.5d;
    }
}
