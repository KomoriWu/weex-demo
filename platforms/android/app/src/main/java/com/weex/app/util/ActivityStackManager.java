package com.weex.app.util;

import android.app.Activity;

import java.util.Stack;

/**
 * 作者: KomoriWu
 * 日期: 2019/3/25 14:26
 * 作用:
 */

public class ActivityStackManager {
    //接收activity的Stack
    private static Stack<Activity> activityStack = null;
    private static ActivityStackManager activityStackManager;

    private ActivityStackManager() {
    }

    public static ActivityStackManager getInstance() {
        if (activityStackManager == null) {
            synchronized (ActivityStackManager.class) {
                if (activityStackManager == null) {
                    activityStackManager = new ActivityStackManager();
                }
            }
        }
        return activityStackManager;
    }

    //将activity移出栈
    public void popActivity(Activity activity) {
        if (activity != null) {
            activityStack.remove(activity);
        }
    }

    //结束指定activity
    public void endActivity(Activity activity) {
        if (activity != null) {
            activity.finish();
            activityStack.remove(activity);
        }
    }

    //获得当前的activity(即最上层)
    public Activity currentActivity() {
        Activity activity = null;
        if (!activityStack.empty())
            activity = activityStack.lastElement();
        return activity;
    }

    //将activity推入栈内
    public void pushActivity(Activity activity) {
        if (activityStack == null) {
            activityStack = new Stack<>();
        }
        activityStack.add(activity);
    }

    //弹出除cls外的所有activity
    public void popAllActivityExceptOne(Class<? extends Activity> cls) {
        while (true) {
            Activity activity = currentActivity();
            if (activity == null) {
                break;
            }
            if (activity.getClass().equals(cls)) {
                break;
            }
            popActivity(activity);
        }
    }

    //结束除cls之外的结束其它activity
    public void finishAllActivityExceptOne(Class<? extends Activity> cls) {
        for (int i = 0; i < activityStack.size(); i++) {
            Activity activity = activityStack.get(i);
            if (!activity.getClass().equals(cls)) {
                endActivity(activity);
            }
        }
    }

    public boolean isEmptyActivity() {
        return activityStack == null || activityStack.size() == 0;
    }

    //结束所有activity
    public void finishAllActivity() {
        while (!activityStack.empty()) {
            Activity activity = currentActivity();
            endActivity(activity);
        }
    }
}
