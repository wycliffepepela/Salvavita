package com.example.wycliffe.salvavita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class AidActivity extends AppCompatActivity {

    ListView listView;

    String[] Title={"burn",
            "Choking ",
            "Myocardial infarction",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aid);

        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Title);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(AidActivity.this,"Thanks for choosing " + Title[position],Toast.LENGTH_SHORT).show();
                Intent details = new Intent(getApplicationContext(),DetailsAidActivity.class);
                details.putExtra("data",position);
                startActivity(details);
                         }
        });
    }
}

