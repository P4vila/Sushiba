package com.example.sushiba;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class soporte_ayuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_soporte_ayuda);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // IMAGEN DE LOGO SIN FONDO CON EL GLIDE IMPLEMENTADO- IMAGEN DE ICON EN SOPORTE Y AYUDA
        ImageView imageView12 = findViewById(R.id.imageView12);
        String imageUrl12 = "https://live.staticflickr.com/65535/54156304544_65b4df6fbe_q.jpg";
        Glide.with(this)
                .load(imageUrl12)
                .into(imageView12);
    }
}