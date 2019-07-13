package com.example.sharman_1.foodapp;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        mRecyclerView=findViewById(R.id.recyclerview);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);


        myFoodList=new ArrayList<>();

        mFoodData=new FoodData("Sprouts Coriander Dosa, Penne Pasta, Sarson Saag Pulao","Fruits and vegetables give your kid vitamins, minerals, fiber and disease fighting chemicals",getString(R.string.Rs1),R.drawable.coriander);
        myFoodList.add((mFoodData));

        mFoodData=new FoodData("Vathal Kuzhambu, Vazhaipoo Paruppu Usili","picy tamarind curry, with berries is this traditional vathal kuzhambu",getString(R.string.Rs1),R.drawable.kuzhanbu);
        myFoodList.add((mFoodData));


        mFoodData=new FoodData("Sprouts Coriander Dosa, Penne Pasta, Sarson Saag Pulao","Grains give energy, choose whole wheat pasta, oats, quinoa other than rice and wheat",getString(R.string.Rs1),R.drawable.kidslunch);
        myFoodList.add((mFoodData));


        mFoodData=new FoodData("Vendakkai Poriyal, Ragi Rava Idli, Chilli Cheese Momo","Make Garlic, Onion and Ginger Pasta and store it in a fridge for 5 days, if  you use it daily in your food",getString(R.string.Rs1),R.drawable.vendakkai);
        myFoodList.add((mFoodData));

        mFoodData=new FoodData("One Dish Chicken & Rice Bake","Description about first item",getString(R.string.Rs1),R.drawable.paneer);
        myFoodList.add((mFoodData));

        mFoodData=new FoodData("Sarson Saag Pulao,Tomato Sheer with Raita & Pyaz","lovely condiments of pickled onions and papad that complete the meal.",getString(R.string.Rs1),R.drawable.winter);
        myFoodList.add((mFoodData));

        mFoodData=new FoodData("Must-try North Indian Veg Mini Meal Plan","Veg curry, 4 whole wheat rotis,salad and pickle",getString(R.string.Rs1),R.drawable.images);
        myFoodList.add((mFoodData));



        MyAdapter myAdapter=new MyAdapter(MainActivity.this,myFoodList);
        mRecyclerView.setAdapter(myAdapter);




    }


}
