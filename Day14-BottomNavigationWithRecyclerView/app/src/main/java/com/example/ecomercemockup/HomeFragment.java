package com.example.ecomercemockup;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private ArrayList<Product> productArrayList;
    private RecyclerView mainActivityProductRV;
    private ProductAdapter productAdapter;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        productArrayList = new ArrayList<Product>();
        productArrayList.add(new Product("Women's Long Sleeve Tops, Women's Short Sleeve Shirts, Short Sleeve Blouses", 2035, R.drawable.product7));
        productArrayList.add(new Product("Lands' End is a classic American", 750, R.drawable.product2));
        productArrayList.add(new Product("Young male fashion model in casual clothes carrying leather jacket", 7090, R.drawable.product4));
        productArrayList.add(new Product("Business Casual plus size, business casual plus size", 1265, R.drawable.product5));
//        productArrayList.add(new Product("Cloth", 3005, R.drawable.product6));


        mainActivityProductRV = view.findViewById(R.id.mainActivityProductRV);
        productAdapter = new ProductAdapter(getContext(), productArrayList);
        mainActivityProductRV.setLayoutManager(new GridLayoutManager(getContext(), 2));
        mainActivityProductRV.setAdapter(productAdapter);
        return view;
    }

}
