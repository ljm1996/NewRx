package com.example.administrator.newrx;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2017/8/2.
 */

public interface Imgapi {
    @GET("1208-2?page=1&rows=50&showapi_appid=13414&showapi_test_draft=false&type=3&showapi_sign=a27b4b68b58c4019b185c7814ae98dce")
    Call<meinvImg> getAndroidInfo();

    @GET("1208-2?page=1&rows=50&showapi_appid=13414&showapi_test_draft=false&type=3&showapi_sign=a27b4b68b58c4019b185c7814ae98dce")
    Observable<meinvImg> getrxMinrepairPlanModlelIndex();

}
