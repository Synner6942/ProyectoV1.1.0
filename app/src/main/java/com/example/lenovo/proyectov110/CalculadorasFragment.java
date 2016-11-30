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
public class CalculadorasFragment extends Fragment {
    ListViewAdapter adapter;

    String[] titulo = new String[]{
            "Calculadora de IMC",
            "Calculadora de Peso Ideal",
            "Calculadora de Edad Biologica",
            "Calculadora de Proteinas",
            "Calorias por Alimento",
            "Cantidad diaria Recomendada",
            "Colesterol por Alimento",
            "Carbohidratos por Alimentos",
            "Metabolismo Basal",
            "Porcentaje de Grasa Corporal",
    };
    int[] imagenes = {
            R.drawable.calculator,
            R.drawable.calculator,
            R.drawable.calculator,
            R.drawable.calculator,
            R.drawable.calculator,
            R.drawable.calculator,
            R.drawable.calculator,
            R.drawable.calculator,
            R.drawable.calculator,
            R.drawable.calculator
    };

    Context context;

    public CalculadorasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_calculadoras, container, false);
        final ListView lista = (ListView) v.findViewById(R.id.listView2);
        adapter = new ListViewAdapter(getActivity(), titulo, imagenes);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
                //  Toast.makeText(getApplicationContext(), "presiono " + i, Toast.LENGTH_SHORT).show();
                switch (posicion) {
                    case 0 :
                        Intent intent = new Intent(getActivity(),ImcFragment.class);
                        getActivity().startActivity(intent);
                        break;
                    case 1 :
                        Toast.makeText(getActivity(), "presiono " + posicion, Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(getActivity(), "default", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return v;
    }

}
