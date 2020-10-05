package com.inceptionteam.Android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.inceptionteam.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private  ArrayList<ExampleItems>mExampleList;
    public  static  class ExampleViewHolder extends RecyclerView.ViewHolder
    {
public ImageView mImageView;
public TextView   mTextView1;
public TextView   mTextView2;


        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView=itemView.findViewById(R.id.imageView);
            mTextView1=itemView.findViewById(R.id.textView);
            mTextView1=itemView.findViewById(R.id.textView2);
        }
    }
    public ExampleAdapter(ArrayList<ExampleItems>exampleList){
        mExampleList=exampleList;

    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.exampleitem,parent,false);
        ExampleViewHolder evh=new ExampleViewHolder(v);
        return  evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
   ExampleItems currentItem =mExampleList.get(position);
    holder.mImageView.setImageResource(currentItem.getImageRrsource());
    holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }



}
