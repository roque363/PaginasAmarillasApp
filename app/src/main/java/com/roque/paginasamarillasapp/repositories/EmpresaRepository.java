package com.roque.paginasamarillasapp.repositories;

import com.roque.paginasamarillasapp.R;
import com.roque.paginasamarillasapp.models.Empresa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ROQUE on 27/09/2017.
 */

public class EmpresaRepository {

    private static EmpresaRepository _INSTANCE = null;

    public static EmpresaRepository getInstance(){
        if(_INSTANCE == null)
            _INSTANCE = new EmpresaRepository();
        return _INSTANCE;
    }

    private EmpresaRepository() {
        //id, nombre, rubro, direccion, telefono, correo, url, info, imgId
        addEmpresa(new Empresa(1, "NANKA", "Restaurante", "Jr. Bambues 198, La Molina, Lima 15024, Perú", "+51 1 3697297",
                "reservas@nanka.pe", "www.nanka.pe", "Peruana, Latina, Mediterránea", R.drawable.img_nanka));
        addEmpresa(new Empresa(2, "Maido", "Restaurante", "Calle San Martín 399, Lima Lima 18, Perú", "+51 1 4462512",
                "informes@maido.pe", "www.maido.pe", "Japonesa, Peruana, Mariscos, Sushi", R.drawable.img_maido));
        addEmpresa(new Empresa(3, "Bao?", "Restaurante", "Calle Jose Domingo Choquehuanca 411, Lima lima 18, Perú", "(01)4834180",
                "No disponible", "www.facebook.com/pg/baoacomer/about/?ref=page_internal", "Comida rápida, Asiática, Apto para vegetarianos", R.drawable.img_bao));
        addEmpresa(new Empresa(4, "Burrito Bar", "Restaurante", "113 Av Miguel Grau|Barranco, Lima 15001, Perú", "+51 982 446 668",
                "No disponible", "www.facebook.com/Burrito-Bar-Lima-158923947518259", "Comida rápida, Cocina centroamericana, Mexicana", R.drawable.img_burritobar));
        addEmpresa(new Empresa(5, "Chicha and Carbo", "Restaurante", "Calle de las Bellas Artes 200, Lima, Perú", "+51 997 725 401",
                "No disponible", "www.facebook.com/Chicha-Carbó-1037520299623910", "Peruana, Cajún y criolla, Mediterránea", R.drawable.img_chichaandcarbor));
        addEmpresa(new Empresa(6, "Edo Sushi Bar", "Restaurante", "San Borja Sur 663, San Borja, Lima, Perú", "225-0881",
                "catering@edosushibar.com", "edosushibar.com", "Japonesa, Sushi, Asiática", R.drawable.img_edosushibar));
        //addEmpresa(new Empresa(7, "", "Restaurante", "", "", "", "", "", R.drawable.img_nanka));
        //addEmpresa(new Empresa(8, "", "Restaurante", "", "", "", "", "", R.drawable.img_nanka));
        //addEmpresa(new Empresa(9, "", "Restaurante", "", "", "", "", "", R.drawable.img_nanka));
        //addEmpresa(new Empresa(10, "", "Restaurante", "", "", "", "", "", R.drawable.img_nanka));
    }

    private List<Empresa> empresas = new ArrayList<>();

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void addEmpresa(Empresa empresa){
        this.empresas.add(empresa);
    }
}
