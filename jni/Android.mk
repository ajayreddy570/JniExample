LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := TestJni
LOCAL_SRC_FILES := jMainActivity.c
LOCAL_LDLIBS := -llog 
include $(BUILD_SHARED_LIBRARY)
