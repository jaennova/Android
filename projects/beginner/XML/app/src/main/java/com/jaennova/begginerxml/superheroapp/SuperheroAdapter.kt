package com.jaennova.begginerxml.superheroapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jaennova.begginerxml.R

/**
 * Adaptador para mostrar una lista de superhéroes en un RecyclerView.
 *
 * @param superheroList Lista de superhéroes a mostrar.
 * @param onItemSelected Acción a realizar cuando se selecciona un superhéroe.
 */
class SuperheroAdapter(
    var superheroList: List<SuperheroItemResponse> = emptyList(),
    private val onItemSelected: (String) -> Unit
) :
    RecyclerView.Adapter<SuperHeroViewHolder>() {

    /**
     * Actualiza la lista de superhéroes y notifica al adaptador del cambio.
     *
     * @param list La nueva lista de superhéroes.
     */
    fun updateList(list: List<SuperheroItemResponse>) {
        superheroList = list
        notifyDataSetChanged()
    }

    /**
     * Crea una nueva instancia de SuperHeroViewHolder.
     *
     * @param parent El ViewGroup en el que se inflará la nueva vista.
     * @param viewType El tipo de vista del nuevo ViewHolder.
     * @return Un nuevo SuperHeroViewHolder que contiene la vista del elemento del superhéroe.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        return SuperHeroViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.superhero_item, parent, false)
        )
    }

    /**
     * Llena los datos de un ViewHolder con los datos de un superhéroe específico.
     *
     * @param viewHolder El ViewHolder a llenar.
     * @param position La posición del superhéroe en la lista.
     */
    override fun onBindViewHolder(viewHolder: SuperHeroViewHolder, position: Int) {
        viewHolder.bind(superheroList[position], onItemSelected)
    }

    /**
     * Obtiene el número total de elementos en la lista de superhéroes.
     *
     * @return El número total de superhéroes en la lista.
     */
    override fun getItemCount() = superheroList.size
}
