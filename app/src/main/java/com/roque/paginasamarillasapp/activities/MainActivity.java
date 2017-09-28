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
import com.roque.paginasamarillasapp.models.Empresa;
import com.roque.paginasamarillasapp.repositories.EmpresaRepository;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ImageButton btnBusqueda;
    private ArrayAdapter<String> adapter;
    private EditText txtBusqueda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list_view_res);
        txtBusqueda = (EditText)findViewById(R.id.txtBusqueda);
        btnBusqueda = (ImageButton)findViewById(R.id.btnBusqueda);

        //EmpresaRepository empresaRepository = EmpresaRepository.getInstance();
        //List<Empresa> empresas = empresaRepository.getEmpresas();
        //for (Empresa empresa : empresas){
            //nombre[5] = empresa.getNombre();
            //rubro[5] = empresa.getRubro();
            //img[5] = empresa.getImgId();
        //}

        LeadsAdapter leadsAdapter = new LeadsAdapter(this, EmpresaRepository.getInstance().getEmpresas());
        listView.setAdapter(leadsAdapter);

        /*txtBusqueda.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //MainActivity.this.leadsAdapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });*/
    }

}
