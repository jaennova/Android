package com.jaennova.begginerxml.superheroapp

import com.google.gson.annotations.SerializedName

/**
 * Clase de datos que representa la respuesta de una solicitud de datos de superhéroes.
 *
 * @property response Indica si la solicitud fue exitosa ("success") o no ("error").
 * @property superheroes Lista de superhéroes obtenidos como resultado de la solicitud.
 */
data class SuperHeroDataResponse(
    @SerializedName("response") val response: String,
    @SerializedName("results") val superheroes: List<SuperheroItemResponse>
)

/**
 * Clase de datos que representa un superhéroe individual en la respuesta.
 *
 * @property superheroId Identificador único del superhéroe.
 * @property name Nombre del superhéroe.
 * @property superheroImage Detalles de la imagen del superhéroe.
 */
data class SuperheroItemResponse(
    @SerializedName("id") val superheroId: String,
    @SerializedName("name") val name: String,
    @SerializedName("image") val superheroImage: SuperheroImageResponse
)

/**
 * Clase de datos que representa la URL de la imagen de un superhéroe.
 *
 * @property url URL de la imagen del superhéroe.
 */
data class SuperheroImageResponse(
    @SerializedName("url") val url: String
)
