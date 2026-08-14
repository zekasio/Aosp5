LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := aos_hook
LOCAL_SRC_FILES := aos_hook.cpp net_client.cpp
LOCAL_CPPFLAGS := -std=c++17 -fvisibility=default -fPIC -O3
LOCAL_LDLIBS := -llog -ldl

include $(BUILD_SHARED_LIBRARY)
