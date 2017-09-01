package com.example.administrator.newrx;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    private TextView tv_result;
    private  ImageView imageView ;
    private ListView listview;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RxTest();
    }
    public Imgapi getapiService(String baseUrl) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://route.showapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        Imgapi api = retrofit.create(Imgapi.class);
        return api;
    }


    private void  RxTest(){

        Imgapi apiService = getapiService("https://route.showapi.com/");
        Observable<meinvImg> observable = apiService.getrxMinrepairPlanModlelIndex();
        observable.subscribeOn(Schedulers.io

                ()).unsubscribeOn(Schedulers.io

                ()).observeOn(Schedulers.io

                ())
                .subscribe(
                        new Subscriber<meinvImg>() {
                            @Override
                            public void onCompleted() {

                            }

                            @Override
                            public void onError(Throwable e) {

                            }

                            @Override
                            public void onNext(meinvImg meinvImg) {
                                ArrayList<dataEntity> arrayList = new ArrayList<dataEntity>();
                                for (int i=0;i<meinvImg.getShowapi_res_body().getData().size();i++)
                                {
                                    dataEntity dataEntity = new dataEntity();
                                    dataEntity.setTitle(meinvImg.getShowapi_res_body().getData().get(i).getTitle
                                            ());
                                    dataEntity.setImgurl(meinvImg.getShowapi_res_body().getData().get
                                            (i).getImgurl());
                                    arrayList.add(dataEntity);
                                    Log.d("result", "getImgurl="+meinvImg.getShowapi_res_body().getData().get
                                            (i).getImgurl()+"\n");
                                }
                            }
                        }

                );
    }

    private void initView() {
        tv_result = (TextView) findViewById(R.id.tv_result);
        imageView = (ImageView) findViewById(R.id.imageView);
        listview = (ListView) findViewById(R.id.listview);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://route.showapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Imgapi api = retrofit.create(Imgapi.class);
        Call<meinvImg> call = api.getAndroidInfo();
        call.enqueue(new Callback<meinvImg>() {
            @Override
            public void onResponse(Call<meinvImg> call, Response<meinvImg> response) {
                try {
                    List<meinvImg.ShowapiResBodyBean.DataBean> result = response.body().getShowapi_res_body
                            ().getData();
                    String des = null;

                    for (meinvImg.ShowapiResBodyBean.DataBean ResultBean : result) {
                        //   Log.e("result",ResultBean.getImgurl());
                        des += ResultBean.getImgurl() + "\n";
                    }
                    ArrayList<dataEntity> arrayList = new ArrayList<dataEntity>();
                    for (int i = 0; i < response.body().getShowapi_res_body().getData().size(); i++) {
                        dataEntity dataEntity = new dataEntity();
                        dataEntity.setTitle(response.body().getShowapi_res_body().getData().get(i).getTitle());
                        dataEntity.setImgurl(response.body().getShowapi_res_body().getData().get(i).getImgurl());
                        arrayList.add(dataEntity);
                        Log.e("result", "getImgurl=" + response.body().getShowapi_res_body().getData().get
                                (i).getImgurl() + "\n");
                    }

//                   Imgadapte imgadapte=new Imgadapte(MainActivity.this,arrayList,R.layout.list_item);
//                    listview.setAdapter(imgadapte);
                    tv_result.setText(des);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<meinvImg> call, Throwable t) {

            }
        });
    }
}
