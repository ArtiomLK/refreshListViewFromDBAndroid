package com.example.artiomlk.updatelistviewfromdb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    public static CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find your ListView
        listView = findViewById(R.id.list_view);

        //Initialize your custom Adapter
        adapter = new CustomAdapter(this);

        //Set your adapter to your ListView
        listView.setAdapter(adapter);

        //Lets populate our ListView as we were doing from the DB
        adapter.initializeCustomAdapter(FakeDB.getMeatReceipe());


        findViewById(R.id.click_me).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Here Imagine you're adding, deleting, updating or something to your DB
                //It does not matter if you call this method from this or another activity
                FakeDB.getVegetarianRecipes();
            }
        });
    }
}
