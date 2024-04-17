package com.jaennova.begginerxml.superheroapp

import android.content.res.Resources
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.jaennova.begginerxml.databinding.ActivitySuperHeroDetailBinding
import com.jaennova.begginerxml.superheroapp.SuperHeroListActivity.Companion.EXTRA_ID
import com.squareup.picasso.Picasso
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.math.roundToInt

class SuperHeroDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySuperHeroDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuperHeroDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val id: String = intent.getStringExtra(EXTRA_ID).orEmpty()
        getSuperheroInformation(id)
    }

    /**
     * Obtiene la información del superhéroe correspondiente al ID proporcionado.
     *
     * @param id El ID del superhéroe del cual se desea obtener la información.
     */
    private fun getSuperheroInformation(id: String) {
        // Ejecuta la operación en un hilo de fondo utilizando un CoroutineScope
        CoroutineScope(Dispatchers.IO).launch {
            // Realiza una solicitud para obtener los detalles del superhéroe utilizando Retrofit y la API
            val superheroDetail = getRetrofit().create(ApiService::class.java).getSuperheroDetail(id)

            // Verifica si la respuesta no es nula y está completa
            if (superheroDetail.isSuccessful && superheroDetail.body() != null) {
                // Actualiza la interfaz de usuario en el hilo principal con los detalles del superhéroe
                runOnUiThread { createUI(superheroDetail.body()!!) }
            }
        }
    }

    /**
     * Crea la interfaz de usuario para mostrar los detalles del superhéroe.
     *
     * @param superhero Los detalles del superhéroe para mostrar.
     */
    private fun createUI(superhero: SuperHeroDetailResponse) {
        // Cargar la imagen del superhéroe utilizando Picasso y establecerla en el ImageView
        Picasso.get().load(superhero.image.url).into(binding.ivSuperhero)

        // Establecer el nombre del superhéroe en el TextView
        binding.tvSuperheroName.text = superhero.name

        // Preparar y mostrar las estadísticas de poder del superhéroe
        prepareStats(superhero.powerstats)

        // Establecer el nombre real del superhéroe en el TextView correspondiente
        binding.tvSuperheroRealName.text = superhero.biography.fullName

        // Establecer el publicador del superhéroe en el TextView correspondiente
        binding.tvPublisher.text = superhero.biography.publisher
    }

    /**
     * Prepara y muestra las estadísticas de poder del superhéroe.
     *
     * @param powerstats Las estadísticas de poder del superhéroe.
     */
    private fun prepareStats(powerstats: PowerStatsResponse) {
        // Actualizar la altura de las vistas de estadísticas según las estadísticas de poder proporcionadas
        updateHeight(binding.viewCombat, powerstats.combat)
        updateHeight(binding.viewDurability, powerstats.durability)
        updateHeight(binding.viewSpeed, powerstats.speed)
        updateHeight(binding.viewStrength, powerstats.strength)
        updateHeight(binding.viewIntelligence, powerstats.intelligence)
        updateHeight(binding.viewPower, powerstats.power)
    }


    /**
     * Actualiza la altura de una vista según la estadística proporcionada.
     *
     * @param view La vista cuya altura se actualizará.
     * @param stat La estadística que determina la nueva altura de la vista.
     */
    private fun updateHeight(view: View, stat: String) {
        // Obtener los parámetros de diseño de la vista
        val params = view.layoutParams
        // Convertir la estadística de píxeles a píxeles densidad independiente (dp)
        params.height = pxToDp(stat.toFloat())
        // Establecer los nuevos parámetros de diseño en la vista
        view.layoutParams = params
    }

    /**
     * Convierte píxeles a píxeles densidad independiente (dp).
     *
     * @param px El valor en píxeles a convertir.
     * @return El valor en píxeles densidad independiente (dp).
     */
    private fun pxToDp(px: Float): Int {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, px, Resources.getSystem().displayMetrics
        ).roundToInt()
    }

    /**
     * Crea y devuelve una instancia de Retrofit para realizar solicitudes a la API.
     *
     * @return Una instancia de Retrofit configurada con la base URL y un convertidor Gson.
     */
    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://superheroapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}