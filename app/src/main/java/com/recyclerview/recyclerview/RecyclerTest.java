package com.recyclerview.recyclerview;

import android.media.Image;
import android.support.annotation.IntDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerTest extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_test);
        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

        int[] picsArray = {
                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,
                R.drawable.g,
                R.drawable.h,
                R.drawable.i,
                R.drawable.j,
                R.drawable.k,
                R.drawable.l,
                R.drawable.m,
                /*R.drawable.n,
                R.drawable.o,
                R.drawable.p,
                R.drawable.q,
                R.drawable.r,
                R.drawable.s,
                R.drawable.t,
                R.drawable.u,*/
        };

        ArrayList<String> arrayList =  new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        arrayList.add("8");
        arrayList.add("9");
        arrayList.add("10");
        arrayList.add("11");
        arrayList.add("12");
        arrayList.add("13");
        /*arrayList.add("14");arrayList.add("15");arrayList.add("16");arrayList.add("17");arrayList.add("18");
        arrayList.add("19");arrayList.add("20");arrayList.add("21");arrayList.add("22");*/




        recyclerView.setAdapter(new RecylerAdapter(arrayList,picsArray));
    }
}
