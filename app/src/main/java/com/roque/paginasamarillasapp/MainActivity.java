package com.roque.paginasamarillasapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ImageButton btnBusqueda;
    private ArrayAdapter<String> adapter;
    private EditText txtBusqueda;

    String data[]={
            "NANKA", "Maido", "Bao?", "Burrito Bar - Lima", "Chicha and Carbo", "Social Restaurant and Bar", "Edo Sushi Bar",
            "Osaka", "Norkys", "Pardos Chicken", "Tanta", "La Lucha Sangucheria Criolla", "Estación 329", "Maitea", "Pickadeli",
            "Pit's", "La 73 Paradero Gourmet"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list_view_res);
        txtBusqueda = (EditText)findViewById(R.id.txtBusqueda);
        btnBusqueda = (ImageButton)findViewById(R.id.btnBusqueda);
        adapter = new ArrayAdapter<String>(this,R.layout.list_item,R.id.textView,data);
        listView.setAdapter(adapter);

        txtBusqueda.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                MainActivity.this.adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        //Version 2
        //ArrayList<String> listRestaurantes = new ArrayList<>();
        //listRestaurantes.addAll(Arrays.asList(getResources().getStringArray(R.array.listRestaurantes)));
        //adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, listRestaurantes);
        //ListView.setAdapter(adapter);
    }

}
