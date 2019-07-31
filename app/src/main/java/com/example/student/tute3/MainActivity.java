package com.example.student.tute3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ChangeFragment(View view){
        Fragment fragment;
        if(view==findViewById(R.id.btnFragment1)){
            fragment=new fragment1();

            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fgmntDefault,fragment);
            ft.commit();

        }


        if(view==findViewById(R.id.btnFragment2)){
            fragment=new fragment2();

            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction Ft=fm.beginTransaction();

            Ft.replace(R.id.fgmntDefault,fragment);
            Ft.commit();
        }
    }
}
