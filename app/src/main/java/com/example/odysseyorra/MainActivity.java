package com.example.odysseyorra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerviewproduk;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menambahkan data untuk item list
        ProdukModel [] dataproduk = new ProdukModel[]{
                new ProdukModel("Paris Premium","Hijab paris dengan bahan yang ringan serta tekstur bahannya lebih lembut dan juga mudah diatur ketika dikenakan.", R.drawable.parispremium),
                new ProdukModel("Bella Square","Hijab yang terbuat dari bahan double hycon dan yang pastinya 100% terbuat dari katun yang menjadikan bahan ini adem dan menyerap keringat. Jilbab Bella Square menggunakan bahan yang mudah dibentuk, jatuh, dan tidak licin.", R.drawable.bellasquare),
                new ProdukModel("Pashmina Silk","Hijab model persegi panjang, yang terbuat dari bahan silk. Bahan silk adalah jenis kain yang ditenun dengan menggunakan teknik serat filamen, sehingga punya ciri khas permukaan yang mengkilap dan licin. Tapi untuk bagian dalam atau belakangnya, kain silk ini nggak licin dan nggak mengkilap.", R.drawable.pashminasilk),
        };

        recyclerviewproduk = findViewById(R.id.recycleviewproduk);
        ProdukAdapter produkadpter = new ProdukAdapter(dataproduk);
        recyclerviewproduk.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerviewproduk.setAdapter(produkadpter);

    }
}