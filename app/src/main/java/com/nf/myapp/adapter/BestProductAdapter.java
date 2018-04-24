package com.nf.myapp.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nf.myapp.R;
import com.nf.myapp.models.Product;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class BestProductAdapter extends BaseAdapter{

    List<Product> productList=new ArrayList<>();
    Context context;

    public BestProductAdapter(Context context,List<Product> product)
    {
        productList=product;
        this.context=context;
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {


        LayoutInflater inflater=LayoutInflater.from(context);
        view=inflater.inflate(R.layout.product_layout,null);

        Product product=productList.get(position);

        ImageView imageView=view.findViewById(R.id.image_app);
        TextView textView=view.findViewById(R.id.txt_title);

        textView.setText(product.getTitle());

        Picasso.with(context).load(product.getIcon()).into(imageView);

        return view;


    }
}

