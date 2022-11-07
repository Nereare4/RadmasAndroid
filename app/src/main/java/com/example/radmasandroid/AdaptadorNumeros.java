package com.example.radmasandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorNumeros extends RecyclerView.Adapter<AdaptadorNumeros.TitularesViewHolder> {

    private ArrayList<Numeros> datos;

    public AdaptadorNumeros(ArrayList<Numeros> datos) {
        this.datos = datos;
    }

    public static class TitularesViewHolder extends RecyclerView.ViewHolder{
        private TextView txtTitular;
        private TextView txtSubTitulo;

        public TitularesViewHolder(View itemView) {
            super(itemView);
            this.txtTitular = itemView.findViewById(R.id.titulo);
        }
        public void bindTitular(Numeros numeros){
            txtTitular.setText(numeros.getNumero());
        }

    }
    //CONSTRUYE LA VISTA
    @Override
    public TitularesViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_component, viewGroup, false);
        TitularesViewHolder tvh = new TitularesViewHolder(itemView);
        return tvh;
    }
    //ASIGNA CADA COMPONENTE
    @Override
    public void onBindViewHolder(@NonNull TitularesViewHolder holder, int position) {
        Numeros numeros = datos.get(position);
        holder.bindTitular(numeros);
    }
    //DEVUELVE EL TAMAÑO DEL ARRAY
    @Override
    public int getItemCount() {
        return datos.size();
    }


}
