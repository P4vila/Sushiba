package com.example.sushiba;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class Activity_perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_perfil);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // FOTO CON GLIDE DE PERFIL DE CAMILA IMAGEN 6
        ImageView imageView6 = findViewById(R.id.imageView6);

        // URL directa de la imagen que quieras usar
        String imageUrl = "https://live.staticflickr.com/65535/54158695005_ab64ab8aa5_q.jpg";

        // Usar Glide para cargar la imagen en el ImageView
        Glide.with(this)
                .load(imageUrl)
                .into(imageView6);


        // FOTO DE HISTORIAL DE PEDIDO DEL PERFIL-- IMAGEN 7
        ImageView imageView7 = findViewById(R.id.imageView7);
        String imageUrl7 = "https://live.staticflickr.com/65535/54159940743_b59888b72a_q.jpg";
        Glide.with(this)
                .load(imageUrl7)
                .into(imageView7);

        // FOTO DE PRIVACIDAD DEL ACTIVITY DE PERFIL -- IMAGEN 8
        ImageView imageView8 = findViewById(R.id.imageView8);
        String imageUrl8 = "https://live.staticflickr.com/65535/54159975659_90c251b701_q.jpg";
        Glide.with(this)
                .load(imageUrl8)
                .into(imageView8);

        // IMAGEN DE AJUSTES DEL ACTIVITY DEL PERFIL -- IMAGEN 9
        ImageView imageView9 = findViewById(R.id.imageView9);
        String imageUrl9 = "https://live.staticflickr.com/65535/54160119455_55806f6bf8_q.jpg";
        Glide.with(this)
                .load(imageUrl9)
                .into(imageView9);

        //IMAGEN DE CERRAR SECCION DEL ACTIVITY DEL PERFILL -- IMAGEN 10
        ImageView imageView10 = findViewById(R.id.imageView10);
        String imageUrl10 = "https://live.staticflickr.com/65535/54159669611_713569525a_q.jpg";
        Glide.with(this)
                .load(imageUrl10)
                .into(imageView10);

    }


}