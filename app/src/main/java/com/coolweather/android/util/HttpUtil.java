package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();//创建OkHttp实例
        Request request = new Request.Builder().url(address).build();//发起请求前先创建一个对像
        client.newCall(request).enqueue(callback);//OkHttpClient的newCall方法创建Call对象
    }
}
