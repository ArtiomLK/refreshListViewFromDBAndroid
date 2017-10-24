package com.example.artiomlk.updatelistviewfromdb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by ArtiomLK on 10/23/2017.
 */

public class CustomAdapter extends BaseAdapter {

    ArrayList<String> recipes;
    Context context;

    public CustomAdapter(Context context) {
        this.context = context;
        recipes = new ArrayList<>();
    }

    public void initializeCustomAdapter(ArrayList<String> arrayList) {
        recipes = arrayList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return recipes.size();
    }

    @Override
    public Object getItem(int position) {
        return recipes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.child, null);
        } else {
            view = convertView;
        }

        ((EditText) view.findViewById(R.id.recipe_name)).setText(recipes.get(position));

        return view;
    }
}
