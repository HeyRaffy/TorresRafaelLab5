package com.torres.rafael;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onStart(){
        super.onStart();
        Log.d("4ITF", "onStart has executed...");
    }

    protected void onResume(){
        super.onResume();
        Log.d("4ITF", "onResume has executed...");
    }

    protected void onPause(){
        super.onPause();
        Log.d("4ITF", "onPause has executed...");
    }

    protected void onStop(){
        super.onStop();
        Log.d("4ITF", "onStop has executed...");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("4ITF", "onRestart has executed...");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("4ITF", "onDestroy has executed...");
    }

    public void activity1(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void activity2(View v){
        Intent i = new Intent(this,SecondActivity.class);
        startActivity(i);
    }

    public void map(View v){
        Intent i = null, chooser=null;
        if (v.getId()== R.id.mapbutton) {
            i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5406,120.9791"));
            chooser= Intent.createChooser(i, "Select your Map App");
            startActivity(chooser);
        }
    }
}
