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

public class Fragment3 extends Fragment {

    RecyclerView recyclerView3;
    ArrayList<SanPham> listSanPham;
    SanPhamAdapter sanPhamAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView3 = getView().findViewById(R.id.recyclerview3);
        listSanPham = new ArrayList<>();
        sanPhamAdapter = new SanPhamAdapter(requireContext(), listSanPham);
        sanPhamAdapter.setData(getAll());
        LinearLayoutManager manager = new LinearLayoutManager(requireContext());
        recyclerView3.setLayoutManager(manager);
        recyclerView3.setAdapter(sanPhamAdapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_3, container, false);
    }

    private ArrayList<SanPham> getAll(){
        ArrayList<SanPham> sanPhams = new ArrayList<>();
        sanPhams.add(new SanPham("Nokia 2.4", 7700000, R.drawable.nokia24));
        sanPhams.add(new SanPham("Nokia 3.4", 9200000, R.drawable.nokia34));
        sanPhams.add(new SanPham("Nokia 5.4", 10000000, R.drawable.nokia54));
        sanPhams.add(new SanPham("Nokia 7.2", 13000000, R.drawable.nokia72));

        return sanPhams;
    }
}