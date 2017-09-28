package com.roque.paginasamarillasapp.activities;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

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
            //nombre = empresa.getNombre();
            //rubro = empresa.getRubro();
            //img = empresa.getImgId();
        //}
        LeadsAdapter leadsAdapter = new LeadsAdapter(this, EmpresaRepository.getInstance().getEmpresas());
        listView.setAdapter(leadsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,int position, long arg3) {
                String nombre;
                String rubro;
                String direccion;
                String telefono;
                String correo;
                String url;
                String info;
                int imgId;
                EmpresaRepository empresaRepository = EmpresaRepository.getInstance();
                List<Empresa> empresas = empresaRepository.getEmpresas();
                for (Empresa empresa : empresas){
                    if(position == empresa.getId() ){
                        Intent i = new Intent(MainActivity.this, DetalleActivity.class);
                        nombre = empresa.getNombre();
                        i.putExtra("nombre", nombre);
                        rubro = empresa.getRubro();
                        i.putExtra("rubro", rubro);
                        direccion = empresa.getDireccion();
                        i.putExtra("direccion", direccion);
                        telefono = empresa.getTelefono();
                        i.putExtra("telefono", telefono);
                        correo = empresa.getCorreo();
                        i.putExtra("correo", correo);
                        url = empresa.getUrl();
                        i.putExtra("url", url);
                        info = empresa.getInfo();
                        i.putExtra("info",info);
                        imgId = empresa.getImgId();
                        i.putExtra("imgId",imgId);
                        startActivity(i);
                        //Toast.makeText(MainActivity.this, "Nombre: "+nombre+"\nTelefono: "+telefono, Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
                //Toast.makeText(MainActivity.this, "Prueba: " + position, Toast.LENGTH_SHORT).show();
            }
        });

    }

}
