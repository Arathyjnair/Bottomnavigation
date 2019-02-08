package com.example.user.bottomnavigation;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class vertical_recycler extends Fragment {
    private RecyclerView horizontal_recycler_view;
    private ArrayList<String> horizontalList;
    private HorizontalAdapter horizontalAdapter;


    public vertical_recycler() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vertcl= inflater.inflate(R.layout.fragment_vertical_recycler, container, false);
        horizontal_recycler_view = vertcl.findViewById(R.id.recyclrvw);
        horizontalList = new ArrayList<String>();
        horizontalList.add("Vertical 1 ");
        horizontalList.add("Vertical 2 ");
        horizontalList.add("Vertical 3 ");
        horizontalList.add("Vertical 4 ");
        horizontalList.add("Vertical 5 ");
        horizontalList.add("Vertical 6 ");
        horizontalList.add("Vertical 7 ");
        horizontalList.add("Vertical 8 ");
        horizontalList.add("Vertical 9 ");
        horizontalList.add("Vertical 10 ");
        horizontalAdapter = new HorizontalAdapter(horizontalList);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        horizontal_recycler_view.setLayoutManager(horizontalLayoutManagaer);
        horizontal_recycler_view.setAdapter(horizontalAdapter);
        return vertcl;
    }

    public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.MyViewHolder> {
        private List<String> horizontalList;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView txtView;

            public MyViewHolder(View view) {
                super(view);
                txtView = (TextView) view.findViewById(R.id.txtvw);

            }


        }

        public HorizontalAdapter(List<String> horizontalList) {
            this.horizontalList = horizontalList;
        }

        public MyViewHolder onCreateViewHolder(ViewGroup parent, int ViewType) {
            View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.horiscrn, parent, false);
            return new MyViewHolder(itemview);
        }

        @Override
        public void onBindViewHolder(final MyViewHolder holder, final int position) {
            holder.txtView.setText(horizontalList.get(position));
        }

        @Override
        public int getItemCount() {
            return horizontalList.size();
        }


    }
}