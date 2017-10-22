package com.example.mirza.tabexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by mirza on 10/8/17.
 */

public class TopPonuda extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.top_ponuda, container, false);

        String[] putovanja = {"Njemačka", "Turska", "Grčka", "Norveška", "Italija"};

        // Inflate the layout for this fragment

        ListView ListView = (ListView) view.findViewById(R.id.lvTopPonuda);

        ArrayAdapter<String> ListviewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                putovanja
        );

        ListView.setAdapter(ListviewAdapter);

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Toast.makeText(getActivity(), "Ovo je putovanje za one koji idu po novi posao", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), "Ovo je turističko putovanje", Toast.LENGTH_SHORT).show();
                }


            }
        });
        return view;
    }
}