package com.example.stay.liczba_losowa;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button generuj;
    private TextView wynik;
    private final static int MIN = 1;
    private final static int MAX = 50;
    private Random randomGenerator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generuj = (Button) findViewById(R.id.generuj_but);
        generuj.setOnClickListener(this);
        wynik = (TextView) findViewById(R.id.ilosc_klikniec_tv);
        randomGenerator = new Random();
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

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.generuj_but)
        {
            int temp = randomGenerator.nextInt(MAX) + MIN;
            wynik.setText("Wynik: " + temp);
        }
    }
}
