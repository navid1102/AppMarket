package com.nf.myapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nf.myapp.R;

import java.util.zip.Inflater;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by KarAmad-user on 4/22/2018.
 */

public class NewViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.txt_title)TextView textView;
    @BindView(R.id.image_app) ImageView imageView;


    public NewViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
