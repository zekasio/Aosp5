package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class AppCompatTextClassifierHelper {
    private TextClassifier mTextClassifier;
    private TextView mTextView;

    AppCompatTextClassifierHelper(TextView textView) {
        this.mTextView = (TextView) Preconditions.checkNotNull(textView);
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        this.mTextClassifier = textClassifier;
    }

    public TextClassifier getTextClassifier() {
        TextClassifier textClassifier = this.mTextClassifier;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManagerM2m = SearchView$$ExternalSyntheticApiModelOutline0.m2m(this.mTextView.getContext().getSystemService(SearchView$$ExternalSyntheticApiModelOutline0.m5m()));
        if (textClassificationManagerM2m != null) {
            return textClassificationManagerM2m.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
