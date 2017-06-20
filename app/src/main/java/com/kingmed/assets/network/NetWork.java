package com.kingmed.assets.network;


import com.kingmed.assets.network.api.NewsApi;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class NetWork {
    private static NewsApi newsApi;
    private static OkHttpClient okHttpClient = new OkHttpClient();


    public static NewsApi getNewsApi() {
        if (newsApi == null) {
            synchronized (NewsApi.class) {
                if (newsApi == null) {
                    Retrofit retrofit = new Retrofit.Builder()
                            .client(okHttpClient)
                            .baseUrl("http://v.juhe.cn/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .build();
                    newsApi = retrofit.create(NewsApi.class);
                }
            }
        }
        return newsApi;
    }
}
