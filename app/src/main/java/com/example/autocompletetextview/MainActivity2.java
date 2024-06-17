package com.example.autocompletetextview;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String[] datos = new String[]{"Primero", "Segundo", "Cuarto",
                "Tercero", "Quinto", "Sexto", "Sèptimo",
                "Octavo", "Noveno", "Dècimo"};

        ArrayAdapter<String> adapter = new
                ArrayAdapter<String>( this,
                android.R.layout.simple_dropdown_item_1line, datos);


        AutoCompleteTextView textView =
                findViewById(R.id.actvListaCursos);
        textView.setAdapter(adapter);


        String[] datoslista = new String[]{"CAROLAY DAMARIS BANCHON REMACHE ",
                "JOSEPH URIEL CABRERA PANTOJA  ",
                " WALTER GUSTAVO CADME ZAMBRANO ",
                "NOHELIA ADAMARIS CEDEÑO BERMELLO",
                "DAYRA JOMARA CHAVEZ ALAVA",
                "BRITTANY THAYLI COBEÑA ZAMBRANO",
                "DONATO SEBASTIAN CONSUEGRA GONZALEZ",
                "JECSON STALIN ESTRADA TAPIA",
                "JAIR ALEXANDER FRANCO ZAMORA",
                "KERLY JOHANA GONZALEZ ARRIAGA",
                "KIARA JULISSA INTRIAGO POSLIGUA",
                "ANGEL EDUARDO LITARDO PEÑA",
                "JOSE MESIAS LOPEZ JACOME",
                "JUSTIN IVAN MACIAS QUIROZ"

        };

        ArrayAdapter<String> adaptador2 =
                new ArrayAdapter<String>( this,
                android.R.layout.simple_list_item_1, datoslista);

        ListView lstListaalumnos = findViewById (R.id.lvListaalumnos);
        lstListaalumnos.setAdapter(adaptador2);
        lstListaalumnos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        "Alumno Seleccionado: " +
                                adapterView.getItemAtPosition(position).toString() ,
                        Toast.LENGTH_LONG).show();
            }
        });






    }
}