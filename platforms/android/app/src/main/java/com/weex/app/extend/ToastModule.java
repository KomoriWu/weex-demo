package com.weex.app.extend;

import android.util.Log;
import android.widget.Toast;

import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;

public class ToastModule extends WXModule {
    public static final String TAG = ToastModule.class.getSimpleName();

    //run ui thread
    @JSMethod(uiThread = true)
    public void showToast(String msg) {
        Toast.makeText(mWXSDKInstance.getContext(), msg, Toast.LENGTH_SHORT).show();
    }


    /*****jscallback*****/
    @JSMethod(uiThread = true)
    public void showToast(String str, JSCallback callback) {
        Toast.makeText(mWXSDKInstance.getContext(), str, Toast.LENGTH_SHORT).show();
        callback.invokeAndKeepAlive("android 返回的数据");
        //callback.invoke(map);
    }

    @JSMethod
    public void log(String str) {
        Log.e(TAG, str);
    }
}