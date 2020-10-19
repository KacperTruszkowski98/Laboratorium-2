package com.example.myfrags;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.Fragment;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

    private FragmentManager fragmentManager;

    private Fragment Fragment1, Fragment2, Fragment3, Fragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment1 = new Fragment1();
        Fragment2 = new Fragment2();
        Fragment3 = new Fragment3();
        Fragment4 = new Fragment4();

        fragmentManager = getSupportFragmentManager();

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.frame1, Fragment1);
        transaction.add(R.id.frame2, Fragment2);
        transaction.add(R.id.frame3, Fragment3);
        transaction.add(R.id.frame4, Fragment4);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}