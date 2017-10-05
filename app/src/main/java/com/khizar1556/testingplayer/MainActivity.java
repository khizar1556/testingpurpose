package com.khizar1556.testingplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.khizar1556.testinglibrary.*;
public class MainActivity extends AppCompatActivity {
testingtoast Ttoast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ttoast=new testingtoast();
        Ttoast.gettoast(MainActivity.this);
    }
}
