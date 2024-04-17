package com.jaennova.begginerxml.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Interfaz que define los métodos para realizar solicitudes a la API de superhéroes.
 */
interface ApiService {
    /**
     * Método para obtener una lista de superhéroes que coinciden con un nombre específico.
     *
     * @param superheroName El nombre del superhéroe a buscar.
     * @return Una respuesta que contiene los datos de los superhéroes encontrados.
     */
    @GET("/api/10229233666327556/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName: String): Response<SuperHeroDataResponse>

    /**
     * Método para obtener los detalles de un superhéroe específico.
     *
     * @param superheroId El ID del superhéroe del cual se desean obtener los detalles.
     * @return Una respuesta que contiene los detalles del superhéroe.
     */
    @GET("/api/10229233666327556/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId: String): Response<SuperHeroDetailResponse>
}
