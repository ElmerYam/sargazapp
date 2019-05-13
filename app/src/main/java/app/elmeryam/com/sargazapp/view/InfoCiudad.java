package app.elmeryam.com.sargazapp.view;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import app.elmeryam.com.sargazapp.R;
import app.elmeryam.com.sargazapp.adapter.ReportsAdapterRecyclerView;
import app.elmeryam.com.sargazapp.model.Report;

public class InfoCiudad extends AppCompatActivity {

    ArrayList<Report> reports;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_ciudad);
        setupActionBar();
        /*recyclerView = (RecyclerView)findViewById(R.id.pictureReci);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        ArrayList<Report> reports = new ArrayList<>();
        reports.add(new Report("https://www.eluniversal.com.mx/sites/default/files/styles/f03-651x400/public/2019/05/07/sargazo33.jpg?itok=wIwoT9-j&c=d73e4a0e38ed2b60d880e5f2a46ef47e",
                "Papaya playa beach", "Demaciada acumulacion de sargazo","Alta", "12-05-19","Ayer"));
        reports.add(new Report("https://www.eluniversal.com.mx/sites/default/files/styles/f03-651x400/public/2019/05/07/sargazo33.jpg?itok=wIwoT9-j&c=d73e4a0e38ed2b60d880e5f2a46ef47e",
                "INTI Beach", "Sargazo recolectado pro empresarios locales de la zona","Medio", "13-05-19","Hace dos horas"));
        reports.add(new Report("https://www.eluniversal.com.mx/sites/default/files/styles/f03-651x400/public/2019/05/07/sargazo33.jpg?itok=wIwoT9-j&c=d73e4a0e38ed2b60d880e5f2a46ef47e",
                "Papaya playa beach", "Demaciada acumulacion de sargazo","Alta", "12-05-19","Ayer"));

        ReportsAdapterRecyclerView adapter =new ReportsAdapterRecyclerView(reports,R.layout.cardview_reports);

        recyclerView.setAdapter(adapter);*/

    }

    private void setupActionBar(){
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Playa del Carmen");
        }
    }


    public void masInfo(View view){
        Intent maps = new Intent(this,MapsActivity.class);
        startActivity(maps);

    }

}
