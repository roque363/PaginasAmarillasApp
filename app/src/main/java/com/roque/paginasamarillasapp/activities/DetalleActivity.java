package com.roque.paginasamarillasapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.roque.paginasamarillasapp.R;

public class DetalleActivity extends AppCompatActivity {
    private TextView txtNombre;
    private TextView txtRubro;
    private TextView txtDireccion;
    private TextView txtTelefono;
    private TextView txtCorreo;
    private TextView txtInfo;
    private ImageView imgEmpresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        txtNombre = (TextView)findViewById(R.id.txtTitulo);
        txtRubro = (TextView)findViewById(R.id.txtRubro);
        txtDireccion = (TextView)findViewById(R.id.txtDireccion);
        txtTelefono = (TextView)findViewById(R.id.txtTelefono);
        txtCorreo = (TextView)findViewById(R.id.txtCorreo);
        txtInfo = (TextView)findViewById(R.id.txtInfo);
        imgEmpresa = (ImageView)findViewById(R.id.imgEmpresa);

        MostrarDatos();
    }

    public void MostrarDatos(){
        String nombre = this.getIntent().getExtras().getString("nombre");
        String rubro = this.getIntent().getExtras().getString("rubro");
        String direccion = this.getIntent().getExtras().getString("direccion");
        String telefono = this.getIntent().getExtras().getString("telefono");
        String correo = this.getIntent().getExtras().getString("correo");
        String url = this.getIntent().getExtras().getString("url");
        String info = this.getIntent().getExtras().getString("info");
        int imgId = this.getIntent().getExtras().getInt("imgId");

        txtNombre.setText(nombre);
        txtRubro.setText(rubro);
        txtDireccion.setText(direccion);
        txtTelefono.setText(telefono);
        txtCorreo.setText(correo);
        txtInfo.setText(info);
        imgEmpresa.setImageResource(imgId);
    }
}
