package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "We cannot recieve emails at the moment!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void showMessage1(View v){
       Toast t = Toast.makeText(getApplicationContext(), "The Spotify App will be launched Shortly!", Toast.LENGTH_SHORT);
        t.show();
    }

    public void showMessage2(View v){
        Toast t = Toast.makeText(getApplicationContext(),"The Scores App will be launched Shortly!", Toast.LENGTH_SHORT);
        t.show();
    }

    public void showMessage3(View v){
        Toast t =  Toast.makeText(getApplicationContext(),"The Library Will open now!", Toast.LENGTH_SHORT);
        t.show();
    }

    public void showMessage4(View v){
        Toast t = Toast.makeText(getApplicationContext(),"Build It Bigger is Starting now!", Toast.LENGTH_SHORT);
        t.show();
    }


    public void showMessage5(View v){
        Toast t = Toast.makeText(getApplicationContext(),"The XYZ reader is ready with your Book!", Toast.LENGTH_SHORT);
        t.show();
    }

    public void showMessage6(View v){
        Toast t = Toast.makeText(getApplicationContext(),"The Final Project is Coming Soon!", Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
