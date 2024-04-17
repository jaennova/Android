package com.jaennova.begginerxml.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.jaennova.begginerxml.databinding.SuperheroItemBinding
import com.squareup.picasso.Picasso

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = SuperheroItemBinding.bind(view)

    fun bind(superheroItemResponse: SuperheroItemResponse, onItemSelected: (String) -> Unit) {
        binding.tvSuperheroName.text = superheroItemResponse.name
        Picasso.get().load(superheroItemResponse.superheroImage.url).into(binding.ivSuperhero)
        binding.root.setOnClickListener { onItemSelected(superheroItemResponse.superheroId) }
    }
}