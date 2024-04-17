package com.jaennova.begginerxml.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.jaennova.begginerxml.databinding.SuperheroItemBinding
import com.squareup.picasso.Picasso

/**
 * Clase que representa un ViewHolder para un elemento de superhéroe en un RecyclerView.
 *
 * @param view La vista del elemento del superhéroe.
 */
class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    // Referencia al binding generado para el layout del elemento del superhéroe
    private val binding = SuperheroItemBinding.bind(view)

    /**
     * Método para vincular los datos de un superhéroe con la vista del ViewHolder.
     *
     * @param superheroItemResponse Los datos del superhéroe a mostrar.
     * @param onItemSelected La acción a realizar cuando se selecciona un superhéroe.
     */
    fun bind(superheroItemResponse: SuperheroItemResponse, onItemSelected: (String) -> Unit) {
        // Establecer el nombre del superhéroe en el TextView
        binding.tvSuperheroName.text = superheroItemResponse.name

        // Cargar la imagen del superhéroe utilizando Picasso y establecerla en el ImageView
        Picasso.get().load(superheroItemResponse.superheroImage.url).into(binding.ivSuperhero)

        // Establecer un Listener para detectar cuando se selecciona un superhéroe y ejecutar la acción correspondiente
        binding.root.setOnClickListener { onItemSelected(superheroItemResponse.superheroId) }
    }
}
