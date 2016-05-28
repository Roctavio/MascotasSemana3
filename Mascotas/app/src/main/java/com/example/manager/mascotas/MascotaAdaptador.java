package com.example.manager.mascotas;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by manager on 28/05/16.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>
{
    ArrayList<Mascota> mascotas;

    public MascotaAdaptador(ArrayList<Mascota> mascotas)
    {
        this.mascotas = mascotas;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder holder, int position)
    {
        Mascota mascota = mascotas.get(position);
        holder.imgFotoPerroCard.setImageResource(mascota.getFoto());
        holder.tvNombrePerroCard.setText(mascota.getNombre());
        holder.tvLikesCard.setText(mascota.getLikes());
    }

    @Override
    public int getItemCount()
    {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView imgFotoPerroCard;
        //private ImageView imgHuesoBlancoCard;
        private TextView tvNombrePerroCard;
        private TextView tvLikesCard;

        public MascotaViewHolder(View itemView)
        {
            super(itemView);

            imgFotoPerroCard = (ImageView) itemView.findViewById(R.id.imgFotoPerroCard);
            tvNombrePerroCard = (TextView) itemView.findViewById(R.id.tvNombrePerroCard);
            tvLikesCard = (TextView) itemView.findViewById(R.id.tvLikesCard);
        }
    }
}
