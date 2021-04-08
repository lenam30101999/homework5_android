package com.example.tablayoutandrecyclerview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Fragment1 extends Fragment {

    RecyclerView recyclerView;
    ArrayList<SanPham> listSanPham;
    SanPhamAdapter sanPhamAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = getView().findViewById(R.id.recyclerview);
        listSanPham = new ArrayList<>();
        sanPhamAdapter = new SanPhamAdapter(requireContext(), listSanPham);
        sanPhamAdapter.setData(getAll());
        LinearLayoutManager manager = new LinearLayoutManager(requireContext());
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(sanPhamAdapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    private ArrayList<SanPham> getAll(){
        ArrayList<SanPham> sanPhams = new ArrayList<>();
        sanPhams.add(new SanPham("Iphone XR", 9500000, R.drawable.iphonexr));
        sanPhams.add(new SanPham("Iphone Xs Max", 11900000, R.drawable.xsmax));
        sanPhams.add(new SanPham("Iphone 11", 12000000, R.drawable.ip11));
        sanPhams.add(new SanPham("Iphone 11 Pro", 18000000, R.drawable.iphone11pro));
        sanPhams.add(new SanPham("Iphone 12", 20000000, R.drawable.ip12));
        sanPhams.add(new SanPham("Iphone 12 Pro", 24000000, R.drawable.ip12pro));
        sanPhams.add(new SanPham("Iphone 12 Pro Max", 27000000, R.drawable.iphone12prm));

        return sanPhams;
    }
}