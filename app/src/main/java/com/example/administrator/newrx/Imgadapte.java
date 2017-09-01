package com.example.administrator.newrx;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import retrofit2.Callback;


/**
 * Created by Administrator on 2017/8/3.
 */

public class Imgadapte extends BaseAdapter {
    private ArrayList<dataEntity>   dataList;
    private Context context;
    private int resource;
    private LayoutInflater mInflater;


    //构造函数:要理解(这里构造方法的意义非常强大,你也可以传一个数据集合的参数,可以根据需要来传参数)
    public Imgadapte(Context context, ArrayList<dataEntity> dataList,
                     int resource) {
        this.context=context;
        this.dataList=dataList;
        this.resource = resource;

    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    class viewHolde
    {
        ImageView imageView;
        TextView contentTextView;


    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       viewHolde viewholder=null;
       if(convertView==null){
           viewholder=new viewHolde();
           convertView = mInflater.inflate(R.layout.list_item, null);
           viewholder.imageView = (ImageView) convertView.findViewById(R.id.img);
           viewholder.contentTextView = (TextView)convertView.findViewById(R.id.content);
           viewholder.imageView.setImageResource(R.mipmap.ic_launcher);
           viewholder.contentTextView.setText("Hello");
           convertView.setTag(viewholder);
       }else {
            viewholder=(viewHolde)convertView.getTag();
            viewholder.imageView.setImageResource(R.mipmap.ic_launcher);
            viewholder.contentTextView.setText("Hello");
       }
        return convertView;
    }
}
