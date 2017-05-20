package com.sreyrothkimberley.first_test;

import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class KimberleyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kimberley);

    }
    @Override
    protected void  onStart(){
        super.onStart();
        Logger.print("on Start");

    }
    @Override
    protected void  onResume(){
        super.onResume();
        Logger.print("on Resume");

    }
    @Override
    protected void  onPause(){
        super.onPause();
        Logger.print("on Pause");

    }
    @Override
    protected void  onStop(){
        super.onStop();
        Logger.print("on Resume");

    }
    @Override
    protected void onDestory(){
        super.onDestory();
        Logger.print("on Destory");

    }
    @Override
    protected void  onRestar(){
        super.onRestar();
        Logger.print("on Restar");

    }
    @Override
    protected void  onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(SaveInstanceState);
        Logger.print("onSaveInstanceState");

    }
    @Override
    protected  void  onRestoreInstanceState(Bundle savedinstanceState){
        super.onRestoreInstanceState(savedinstanceState);
        Logger.print("onRestoreInstanceState");
    }


}
