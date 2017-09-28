package com.roque.paginasamarillasapp.activities;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.roque.paginasamarillasapp.R;

/**
 * Created by ROQUE on 24/09/2017.
 */

public class CustomListview extends ArrayAdapter<String> {

    private String[] data;
    private String[] des;
    private Integer[] imgId;
    private Activity context;

    public CustomListview(Activity context, String[] data, String[] des, Integer[] imgId) {
        super(context, R.layout.list_item, data);

        this.context=context;
        this.data=data;
        this.des=des;
        this.imgId=imgId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r=convertView;
        ViewHolder viewHolder=null;
        if(r==null){
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.list_item,null,true);
            viewHolder=new ViewHolder(r);
            r.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder)r.getTag();
        }
        viewHolder.ivw.setImageResource(imgId[position]);
        viewHolder.tvw1.setText(data[position]);
        viewHolder.tvw2.setText(des[position]);

        return r;
    }

    class ViewHolder{
        TextView tvw1;
        TextView tvw2;
        ImageView ivw;
        ViewHolder(View v){
            tvw1 = (TextView)v.findViewById(R.id.txtTitulo);
            tvw2 = (TextView)v.findViewById(R.id.txtDescripcion);
            ivw = (ImageView)v.findViewById(R.id.imageView);
        }
    }
}
