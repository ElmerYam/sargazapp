package app.elmeryam.com.sargazapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import app.elmeryam.com.sargazapp.view.MainMenuActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciarApp(View view){
        Intent iniciar = new Intent(this,MainMenuActivity.class);
        startActivity(iniciar);
    }
}
