package com.recyclerview.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Arman on 05-07-2016.
 */
public class RecylerAdapter extends RecyclerView.Adapter<RecylerAdapter.ViewHolder> {
    ArrayList<String> arrayList;
    int[] picsArray;
    public RecylerAdapter(ArrayList<String> arrayList, int[] picsArray) {
        this.arrayList = arrayList;
        this.picsArray=picsArray;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_child,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.info.setText(arrayList.get(position));
        holder.imageview.setImageResource(picsArray[position]);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView info;
        ImageView imageview;
        public ViewHolder(View itemView)
        {
            super(itemView);
            info = (TextView)itemView.findViewById(R.id.info_text);
            imageview = (ImageView)itemView.findViewById(R.id.imageview);
            itemView.setOnClickListener(this);
           // imageview.setIm

        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(),cardact.class);
            intent.putExtra("key",info.getText().toString());
            view.getContext().startActivity(intent);
        }
    }
}
