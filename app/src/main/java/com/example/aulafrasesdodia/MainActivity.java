package com.example.aulafrasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

     public void gerarFraseAleatoria(View view){

        String[] frases = {
                "O sucesso é a soma de pequenos esforços repetidos dia após dia. – Robert Collier",
                "A vida começa onde termina a sua zona de conforto. – Neale Donald Walsch",
                "Acredite que você pode, assim você já está no meio do caminho. – Theodore Roosevelt",
                "A única maneira de fazer um ótimo trabalho é amar o que você faz. – Steve Jobs",
                "O fracasso é apenas a oportunidade de começar de novo, desta vez de forma mais inteligente. – Henry Ford",
                "A maior glória em viver não está em nunca cair, mas em se levantar cada vez que caímos. – Nelson Mandela",
                "Você é mais forte do que pensa e será mais feliz do que imagina. – Desconhecido",
                "Não importa o quão devagar você vá, desde que você não pare. – Confúcio",
                "A melhor maneira de prever o futuro é criá-lo. – Peter Drucker",
                "Acredite que você pode e você já está no meio do caminho. – Theodore Roosevelt",
        };

        int numeroAleatorio = new Random().nextInt(10);

        TextView texto = findViewById(R.id.textFrase);
        texto.setText(frases[numeroAleatorio]);
    }
}