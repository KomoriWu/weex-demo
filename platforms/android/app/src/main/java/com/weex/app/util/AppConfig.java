package com.weex.app.util;

import android.content.Context;


/**
 * Created by budao on 2016/10/12.
 */
public class AppConfig {
  private static final String TAG = "AppConfig";
  private static AppPreferences sPreferences = new AppPreferences();

  public static void init(Context context) {
    loadAppSetting(context);
  }

  public static String getLaunchUrl() {
//    if (isLaunchLocally()) {
//      return "file://assets/RecycleList.js";
//    }
    return "http://10.168.12.146:8081/dist/index.js";
  }

  public static Boolean isLaunchLocally() {
    return sPreferences.getBoolean("launch_locally", false);
  }

  private static void loadAppSetting(Context context) {
    AppConfigXmlParser parser = new AppConfigXmlParser();
    parser.parse(context);
    sPreferences = parser.getPreferences();
  }
}
