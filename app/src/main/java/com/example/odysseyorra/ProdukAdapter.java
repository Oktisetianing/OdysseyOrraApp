package com.example.odysseyorra;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ProdukAdapter extends RecyclerView.Adapter<ProdukAdapter.ViewHolder> {

    ProdukModel [] produklist;

    public ProdukAdapter(ProdukModel[] produklist) {

        this.produklist = produklist;
    }

    @NonNull
    @Override
    public ProdukAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View listproduk = layoutInflater.inflate(R.layout.item_produk,null);

        ViewHolder viewHolder = new ViewHolder((listproduk));

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProdukAdapter.ViewHolder holder, int position) {
       ProdukModel produkModel = produklist[position];
        holder.gmbrproduk.setImageResource(ProdukModel.getGmbrproduk());
        holder.tvnamaproduk.setText(ProdukModel.getTvnamaproduk());
        holder.tvdeskripsi.setText(ProdukModel.getTvdeskripsi());

        holder.maincard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),MainActivity.class);
                intent.putExtra("Gambar", produkModel.getGmbrproduk());
                intent.putExtra("Nama Produk", produkModel.getTvnamaproduk());
                intent.putExtra("Deskripsi", produkModel.getTvdeskripsi());
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return produklist.length;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView gmbrproduk;
        TextView tvnamaproduk,tvdeskripsi;
        CardView maincard;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gmbrproduk = itemView.findViewById(R.id.gmbrproduk);
            tvnamaproduk = itemView.findViewById(R.id.tvnamaproduk);
            tvdeskripsi = itemView.findViewById(R.id.tvdeskripsi);
            maincard = itemView.findViewById(R.id.maincard);
        }

    }

}

