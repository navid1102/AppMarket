package com.nf.myapp.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.nf.myapp.R;
import com.nf.myapp.models.Product;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by KarAmad-user on 4/21/2018.
 */

public class ProductAdapter extends RecyclerView.Adapter<NewViewHolder> {


    Context context;
    LayoutInflater inflater;
    List<Product> productList=new ArrayList<>();


    public ProductAdapter(Context context,List<Product> products) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        productList=products;


    }


    @Override
    public NewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.product_layout, null);

        return new  NewViewHolder(view);
    }



    @Override
    public void onBindViewHolder(NewViewHolder holder, int position) {

        Product product=productList.get(position);
        Typeface typeface=Typeface.createFromAsset(context.getAssets(),"fonts/BYekan.ttf");
        holder.textView.setTypeface(typeface);

        holder.textView.setText(product.getTitle());

        Picasso.with(context).load(product.getIcon()).error(R.mipmap.ic_launcher_round).placeholder(R.mipmap.ic_launcher_round)
                .into(holder.imageView);




    }

    @Override
    public int getItemCount() {
        return productList.size();
    }




}