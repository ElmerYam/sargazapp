package app.elmeryam.com.sargazapp.view;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import app.elmeryam.com.sargazapp.R;
import app.elmeryam.com.sargazapp.adapter.ViewPagerAdapter;

public class MainMenuActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
    }

    public void masInfo(View view){
        Intent ciudad = new Intent(this,InfoCiudad.class);
        startActivity(ciudad);

    }




}
