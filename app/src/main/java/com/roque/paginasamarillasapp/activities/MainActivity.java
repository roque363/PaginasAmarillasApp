package com.roque.paginasamarillasapp.activities;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.roque.paginasamarillasapp.R;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ImageButton btnBusqueda;
    private ArrayAdapter<String> adapter;
    private EditText txtBusqueda;

    String data[]={
            "NANKA", "Maido", "Bao?", "Burrito Bar - Lima"
    };
    String des[]={
            "restaurante", "restaurante", "restaurante", "restaurante"
    };
    Integer imgId[]={
            R.drawable.img_nanka, R.drawable.img_maido, R.drawable.img_bao, R.drawable.img_burritobar
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list_view_res);
        txtBusqueda = (EditText)findViewById(R.id.txtBusqueda);
        btnBusqueda = (ImageButton)findViewById(R.id.btnBusqueda);
        CustomListview customListview=new CustomListview(this,data,des,imgId);
        adapter = new ArrayAdapter<String>(this,R.layout.list_item,R.id.txtTitulo,data);
        listView.setAdapter(adapter);
        listView.setAdapter(customListview);

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
