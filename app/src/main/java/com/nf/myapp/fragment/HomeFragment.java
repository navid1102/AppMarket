package com.nf.myapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.nf.myapp.R;
import com.nf.myapp.adapter.BestProductAdapter;
import com.nf.myapp.adapter.ProductAdapter;
import com.nf.myapp.dataProvider.DataManager;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    GridView gridView;

    DataManager dataManager=new DataManager();

    @BindView(R.id.recycler)
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       View view=inflater.inflate(R.layout.fragment_home,container,false);

        ButterKnife.bind(this,view);

        gridView=(GridView)view. findViewById(R.id.gridview_best);

        DataManager dataManager=new DataManager();

        BestProductAdapter adapter=new BestProductAdapter(getActivity(),dataManager.getBestProduct());
        gridView.setAdapter(adapter);




        ProductAdapter productAdapter=new ProductAdapter(getActivity(),dataManager.getNewProduct());

        recyclerView.setAdapter(productAdapter);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);


        return view;

}}
