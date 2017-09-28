package com.roque.paginasamarillasapp.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.roque.paginasamarillasapp.R;
import com.roque.paginasamarillasapp.models.Empresa;

import java.util.List;

/**
 * Created by ROQUE on 27/09/2017.
 */

public class LeadsAdapter extends ArrayAdapter<Empresa>{
    public LeadsAdapter(Context context, List<Empresa> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Obtener inflater.
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // ¿Existe el view actual?
        if (null == convertView) {
            convertView = inflater.inflate(
                    R.layout.list_item,
                    parent,
                    false);
        }

        // Referencias UI.
        ImageView imgId = (ImageView) convertView.findViewById(R.id.imageView);
        TextView nombre = (TextView) convertView.findViewById(R.id.txtTitulo);
        TextView rubro = (TextView) convertView.findViewById(R.id.txtDescripcion);
        TextView direcccion = (TextView) convertView.findViewById(R.id.txtDireccion);
        //TextView company = (TextView) convertView.findViewById(R.id.tv_company);

        // Lead actual.
        Empresa empresa = getItem(position);

        // Setup.
        Glide.with(getContext()).load(empresa.getImgId()).into(imgId);
        nombre.setText(empresa.getNombre());
        rubro.setText(empresa.getRubro());
        direcccion.setText(empresa.getDireccion());
        //company.setText(lead.getCompany());

        return convertView;
    }
}
