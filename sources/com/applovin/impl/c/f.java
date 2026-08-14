package com.applovin.impl.c;

import cz.msebera.android.httpclient.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
public enum f {
    UNSPECIFIED(-1),
    RESOURCE_REJECTED(1),
    API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED(2),
    FAILED_TO_LOAD_RESOURCE(3),
    XML_PARSING(100),
    GENERAL_WRAPPER_ERROR(HttpStatus.SC_MULTIPLE_CHOICES),
    TIMED_OUT(HttpStatus.SC_MOVED_PERMANENTLY),
    WRAPPER_LIMIT_REACHED(HttpStatus.SC_MOVED_TEMPORARILY),
    NO_WRAPPER_RESPONSE(HttpStatus.SC_SEE_OTHER),
    GENERAL_LINEAR_ERROR(HttpStatus.SC_BAD_REQUEST),
    NO_MEDIA_FILE_PROVIDED(HttpStatus.SC_UNAUTHORIZED),
    MEDIA_FILE_TIMEOUT(HttpStatus.SC_PAYMENT_REQUIRED),
    MEDIA_FILE_ERROR(HttpStatus.SC_METHOD_NOT_ALLOWED),
    GENERAL_COMPANION_AD_ERROR(600),
    UNABLE_TO_FETCH_COMPANION_AD_RESOURCE(603),
    CAN_NOT_FIND_COMPANION_AD_RESOURCE(604);

    private final int q;

    f(int i) {
        this.q = i;
    }

    public int a() {
        return this.q;
    }
}
