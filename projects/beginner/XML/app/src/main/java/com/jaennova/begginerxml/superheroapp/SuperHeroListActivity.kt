package com.jaennova.begginerxml.superheroapp

import android.content.Intent
import android.nfc.NfcAdapter.EXTRA_ID
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.jaennova.begginerxml.databinding.ActivitySuperHeroListBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Actividad principal que muestra una lista de superhéroes.
 */
class SuperHeroListActivity : AppCompatActivity() {
    // Variable para el binding de la actividad
    private lateinit var binding: ActivitySuperHeroListBinding

    // Instancia de Retrofit para realizar solicitudes HTTP
    private lateinit var retrofit: Retrofit

    // Adaptador para la lista de superhéroes
    private lateinit var adapter: SuperheroAdapter

    // Constante que define el nombre del extra utilizado para pasar el ID del superhéroe a la actividad de detalles
    companion object {
        const val EXTRA_ID = "extra_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuperHeroListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        retrofit = getRetrofit()
        initUI()
    }

    /**
     * Método para inicializar la interfaz de usuario de la actividad.
     */
    private fun initUI() {
        // Configura el SearchView para realizar búsquedas de superhéroes por nombre
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // Cuando se envía el texto de búsqueda, realiza la búsqueda por nombre
                searchByName(query.orEmpty())
                return false
            }

            override fun onQueryTextChange(newText: String?) = false
        })

        // Inicializa el adaptador de la lista de superhéroes
        adapter = SuperheroAdapter { superheroId -> navigateToDetail(superheroId) }

        // Configura el RecyclerView con el adaptador y un LinearLayoutManager
        binding.rvSuperhero.setHasFixedSize(true)
        binding.rvSuperhero.layoutManager = LinearLayoutManager(this)
        binding.rvSuperhero.adapter = adapter
    }


    /**
     * Método para buscar superhéroes por su nombre utilizando la API.
     *
     * @param query El nombre del superhéroe a buscar.
     */
    private fun searchByName(query: String) {
        // Muestra la barra de progreso mientras se realiza la búsqueda
        binding.progressBar.isVisible = true

        // Utiliza un CoroutineScope para realizar la búsqueda en un hilo de fondo
        CoroutineScope(Dispatchers.IO).launch {
            // Realiza la solicitud HTTP para buscar superhéroes por nombre
            val myResponse: Response<SuperHeroDataResponse> =
                retrofit.create(ApiService::class.java).getSuperheroes(query)

            // Verifica si la solicitud fue exitosa
            if (myResponse.isSuccessful) {
                // Si la solicitud fue exitosa, registra un mensaje de éxito en el Logcat
                Log.i("api", "¡Funciona! :)")

                // Obtiene la respuesta de la solicitud
                val response: SuperHeroDataResponse? = myResponse.body()

                // Verifica si la respuesta no es nula
                if (response != null) {
                    // Si la respuesta no es nula, registra la respuesta en el Logcat
                    Log.i("api", response.toString())

                    // Actualiza la lista de superhéroes en el hilo principal de la interfaz de usuario
                    runOnUiThread {
                        adapter.updateList(response.superheroes)
                        // Oculta la barra de progreso después de actualizar la lista
                        binding.progressBar.isVisible = false
                    }
                }
            } else {
                // Si la solicitud no fue exitosa, registra un mensaje de error en el Logcat
                Log.i("api", "¡No funciona! :(")
            }
        }
    }


    /**
     * Método para obtener una instancia de Retrofit configurada para realizar solicitudes HTTP.
     *
     * @return Una instancia de Retrofit configurada.
     */
    private fun getRetrofit(): Retrofit {
        // Crea un nuevo objeto Retrofit.Builder
        return Retrofit.Builder()
            // Establece la URL base de la API de superhéroes
            .baseUrl("https://superheroapi.com/")
            // Agrega un convertidor de Gson para manejar la conversión entre objetos JSON y clases Kotlin
            .addConverterFactory(GsonConverterFactory.create())
            // Construye la instancia de Retrofit
            .build()
    }

    /**
     * Navega a la actividad de detalles del superhéroe.
     *
     * @param id El ID del superhéroe del cual se desean ver los detalles.
     */
    private fun navigateToDetail(id: String) {
        // Crea un Intent para iniciar la actividad de detalles del superhéroe
        val intent = Intent(this, SuperHeroDetailActivity::class.java)
        // Agrega el ID del superhéroe como un extra en el Intent
        intent.putExtra(EXTRA_ID, id)
        // Inicia la actividad de detalles del superhéroe
        startActivity(intent)
    }

}