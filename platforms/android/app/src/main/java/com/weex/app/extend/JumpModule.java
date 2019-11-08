package com.weex.app.extend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.weex.app.WXPageActivity;
import com.weex.app.util.ActivityStackManager;

import java.io.Serializable;
import java.util.Map;

/**
 * author: wuzhen
 * date: 2019/11/8 9:39
 * description：跳转
 */

public class JumpModule extends WXModule {
    public static final String TAG = JumpModule.class.getSimpleName();

    //run ui thread
    @JSMethod(uiThread = true)
    public void jump(String name) {
        Activity activity = ActivityStackManager.getInstance().currentActivity();
        Intent intent = new Intent(activity, WXPageActivity.class);
        intent.putExtra("name", name);
        activity.startActivity(intent);
    }

}