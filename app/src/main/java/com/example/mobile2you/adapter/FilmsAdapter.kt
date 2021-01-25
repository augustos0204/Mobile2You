package com.example.mobile2you.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.mobile2you.model.Film
import kotlinx.android.synthetic.main.layout_card_film.view.*

class FilmsAdapter (var listaFilms: ArrayList<Film>) : RecyclerView.Adapter<FilmsAdapter.FilmViewHolder{
    class FilmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(film: Film){
            itemView.FilmName.text = film.Name
            itemView.FilmDate.text = film.Year.toString()
            itemView.FilmCategory.text = film.Category
        }
    }
}