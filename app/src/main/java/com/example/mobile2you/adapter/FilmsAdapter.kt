package com.example.mobile2you.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mobile2you.R
import com.example.mobile2you.model.Film
import kotlinx.android.synthetic.main.layout_card_film.view.*

class FilmsAdapter (var listFilms: ArrayList<Film>) : RecyclerView.Adapter<FilmsAdapter.FilmViewHolder>(){
    class FilmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(film: Film){
            itemView.FilmName.text = film.Name
            itemView.FilmDate.text = film.Year.toString()
            itemView.FilmCategory.text = film.Category
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_card_film, parent)

        return FilmViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listFilms.size
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val film = listFilms[position]
        holder.bind(film)
    }
}