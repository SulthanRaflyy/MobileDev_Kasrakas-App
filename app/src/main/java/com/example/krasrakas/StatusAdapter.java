package com.example.krasrakas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class StatusAdapter extends ArrayAdapter<StatusData> {
    public StatusAdapter(@NonNull Context context, ArrayList<StatusData> dataArrayList) {
        super(context, R.layout.list_status, dataArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        StatusData StatusData = getItem(position);

        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_status, parent, false);
        }

        ImageView listImage = view.findViewById(R.id.listImage);
        TextView listName = view.findViewById(R.id.listName);
        TextView listTime = view.findViewById(R.id.listTime);

        listImage.setImageResource(StatusData.image);
        listName.setText(StatusData.name);
        listTime.setText(StatusData.time);

        return view;
    }
}