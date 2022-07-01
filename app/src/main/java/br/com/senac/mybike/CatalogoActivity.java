package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CatalogoActivity extends AppCompatActivity {
    RecyclerView idRecCatalogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalogo_layout);

        idRecCatalogo = findViewById(R.id.idRecCatalogo);
        //montagen do layout que será utilizado na lista

        idRecCatalogo.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        //vai deixar a lista mais eficiente

        idRecCatalogo.hasFixedSize();
        //intanciar o adaptador
        MyAdapter adapter = new MyAdapter();




        //Executando a montagen da lista

        idRecCatalogo.setAdapter();

    }
}