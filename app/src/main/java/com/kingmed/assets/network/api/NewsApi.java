package com.kingmed.assets.network.api;


import com.kingmed.assets.bean.UserInfo;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by ssy on 2017/6/6.
 */

public interface NewsApi {

    @GET("toutiao/index" )
    Observable<UserInfo> getNews(@Query("type") String type, @Query("key") String appKey);

}
