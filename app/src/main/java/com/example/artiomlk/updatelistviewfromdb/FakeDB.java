package com.example.artiomlk.updatelistviewfromdb;

import java.util.ArrayList;

/**
 * Created by ArtiomLK on 10/23/2017.
 */

public class FakeDB {

    //Fake our returned data
    public static ArrayList<String> getMeatReceipe() {
        ArrayList<String> list = new ArrayList<>();
        list.add("MeatReceipt1");
        list.add("MeatReceipt2");
        list.add("MeatReceipt3");

        return list;
    }

    //Imagine this method is adding 3 new recipes to the DB.
    //Thus the list we pass to our adapter are the values we want to display
    public static void getVegetarianRecipes() {

        ArrayList<String> list = new ArrayList<>();
        list.add("VegetarianReceipt1");
        list.add("VegetarianReceipt2");
        list.add("VegetarianReceipt3");

        MainActivity.adapter.initializeCustomAdapter(list);
    }
}
