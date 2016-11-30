package com.example.lenovo.proyectov110;


import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AlimentoFragment extends Fragment {

    ListViewAdapter adapter;
    String[] titulo = new String[]{
            "Frutas",
            "Verduras",
            "Carnes",
            "Pescados",
            "Lacteos",
            "Cereales",
            "Legumbres",
            "Frutos-Secos",
    };
    int[] imagenes = {
            R.drawable.ic_menu_calendario,
            R.drawable.ic_menu_calendario,
            R.drawable.ic_menu_calendario,
            R.drawable.ic_menu_calendario,
            R.drawable.ic_menu_calendario,
            R.drawable.ic_menu_calendario,
            R.drawable.ic_menu_calendario,
            R.drawable.ic_menu_calendario
    };

    int tipo;

    Context context;
    Intent intent;

    public AlimentoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_alimento, container, false);


        final ListView lista = (ListView) v.findViewById(R.id.listView1);
        adapter = new ListViewAdapter(getActivity(), titulo, imagenes);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
              //  Toast.makeText(getApplicationContext(), "presiono " + i, Toast.LENGTH_SHORT).show();
                switch (posicion) {
                    case 0 :
                        intent = new Intent(getActivity(),Frutas.class);
                        getActivity().startActivity(intent);
                        break;
                    case 1 :
                        intent = new Intent(getActivity(),Verduras.class);
                        getActivity().startActivity(intent);
                        break;
                    case 2 :
                        intent = new Intent(getActivity(),Carnes.class);
                        getActivity().startActivity(intent);
                        break;
                    case 3 :
                        intent = new Intent(getActivity(),Pescados.class);
                        getActivity().startActivity(intent);
                        break;
                    case 4 :
                        intent = new Intent(getActivity(),Lacteos.class);
                        getActivity().startActivity(intent);
                        break;
                    case 5 :
                        intent = new Intent(getActivity(),Cereales.class);
                        getActivity().startActivity(intent);
                        break;
                    case 6 :
                        intent = new Intent(getActivity(),Legumbres.class);
                        getActivity().startActivity(intent);
                        break;
                    case 7 :
                        intent = new Intent(getActivity(),FrutosSecos.class);
                        getActivity().startActivity(intent);
                        break;
                    default:
                        Toast.makeText(getActivity(), "default" + posicion, Toast.LENGTH_SHORT).show();
                }
            }
        });

        return v;
    }
}
