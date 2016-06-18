package ru.levelp.formila;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChoiceScreen extends AppCompatActivity {
    private static final String[] VARIANTS = new String[]{"На работе достали","С парнем поругалась","Просто все бесят","Чет грустненько","Скажи что-нибудь приятное, котлетка!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choise_screen);
        ListView list = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.advice_screen,R.id.text, VARIANTS);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selection = VARIANTS[position];
                startAndroid(selection);

            }


        });
    }
    private void startAndroid(String s) {
        Intent intent= new Intent(this, AdviceScreen.class);
        intent.putExtra("variant", s);
        startActivity(intent);
    }



}
