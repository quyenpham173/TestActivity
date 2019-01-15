package com.example.testactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name = getIntent().getStringExtra("name");
        Bundle bundle = getIntent().getExtras();
        int age = bundle.getInt("age");
        int phone = bundle.getInt("Phone");
        String name2 = bundle.getString("name2");
        Log.e("Activity2", "Du lieu lay ra: " + name2 +" " + age+" "+ phone);
        Log.e("Activity2", "Du lieu lay ra : " + name);

        //get Object data
        User user = (User) getIntent().getSerializableExtra("user");
        Log.e("Activity2", "Du lieu lay ra: " + user.getName() + user.getId());
        setContentView(R.layout.activity2);
    }
}
