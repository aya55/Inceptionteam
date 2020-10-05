package com.inceptionteam.Android;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inceptionteam.R;

import java.util.ArrayList;

public class AndroidFragment extends Fragment {
    private RecyclerView recyclerView;
     private  RecyclerView.Adapter mAdapter;
  private    RecyclerView.LayoutManager mLayoutManager;

    public AndroidFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_android, container, false);

        }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        ArrayList<ExampleItems> exampleList=new ArrayList<>();
        exampleList.add(new ExampleItems(R.drawable.ic_android,"Name","Number"));
        exampleList.add(new ExampleItems(R.drawable.ic_android,"Name","Number"));
        exampleList.add(new ExampleItems(R.drawable.ic_android,"Name","Number"));
        exampleList.add(new ExampleItems(R.drawable.ic_android,"Name","Number"));
        exampleList.add(new ExampleItems(R.drawable.ic_android,"Name","Number"));
        recyclerView= recyclerView.findViewById(R.id.recyclarview);
        recyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(getContext());
        mAdapter=new ExampleAdapter(exampleList);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
        super.onViewCreated(view, savedInstanceState);

    }
}