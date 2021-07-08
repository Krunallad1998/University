package com.example.university;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Toolbar toolbar;
    String University[] = {"DAV Institute of Engineering & Technology",  "Lovely Professional University","Somaiya Vidyavihar",
            "NorthCap University", "Dharamsinh Desai University", "University of Health Sciences Andhra Pradesh",
            "Assam Agricultural University","Ahmedabad University","All India Institute of Medical Sciences", "AISECT University",
            "Alagappa University","Allahabad University","Open International University for Alternative Medicines",
            "Indian Board of Alternative Medicine","Amity University", "Amrita Vishwa Vidyapeetham (Deemed University)",
            "Amravati University","Aligarh Muslim University", "Andhra University", "Acharya Ranga Agricultural University",
            "Annamalai University","Anna University of Technology"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        listView = findViewById( R.id.list );
//        toolbar = findViewById(R.id.toolbar );

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.item_list, R.id.text1, University);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),UniversityDetails.class);
                System.out.println("i="+i);
                Integer a= i;
                String b= a.toString();
                intent.putExtra( "position", b );

                startActivity(intent);


            }
        });


    }


}