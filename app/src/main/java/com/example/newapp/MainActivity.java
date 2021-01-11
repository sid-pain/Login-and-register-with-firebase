package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.newapp.UI.LoginScreen;
import com.example.newapp.UI.RegisterActivity;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listVw);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Cristiano Ronaldo");
        arrayList.add("Lionel Messi");
        arrayList.add("Neymar");
        arrayList.add("Zidane");
        arrayList.add("Edan Hazard");
        arrayList.add("Luiz Suarez");
        arrayList.add("Sergio Ramos");
        arrayList.add("Mohamed Salah");
        arrayList.add("kylian Mbappe");
        arrayList.add("Luca Modric");
        arrayList.add("Zlatan Ibrahimovic");
        arrayList.add("Sergio Aguero");
        arrayList.add("Ronaldinho");
        arrayList.add("Xavi");
        arrayList.add("Zidane");
        arrayList.add("Maradona");
        arrayList.add("Gareth Bale");
        arrayList.add("Andres Iniesta");
        arrayList.add("Pele");
        arrayList.add("Karim Benzema");
        arrayList.add("Toni Kroos");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Clicked item:"+i+" "+arrayList.get(i).toString(),Toast.LENGTH_LONG).show();
            }
        });
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), LoginScreen.class));
        finish();
    }
}