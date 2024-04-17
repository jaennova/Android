package com.jaennova.begginerxml.superheroapp

import com.google.gson.annotations.SerializedName

/**
 * Clase de datos que representa los detalles de un superhéroe, incluyendo su nombre, estadísticas de poder,
 * imagen y biografía.
 *
 * @property name Nombre del superhéroe.
 * @property powerstats Estadísticas de poder del superhéroe.
 * @property image Detalles de la imagen del superhéroe.
 * @property biography Biografía del superhéroe, que incluye su nombre completo y el editor/publisher.
 */
data class SuperHeroDetailResponse(
    @SerializedName("name") val name: String,
    @SerializedName("powerstats") val powerstats: PowerStatsResponse,
    @SerializedName("image") val image: SuperheroImageDetailResponse,
    @SerializedName("biography") val biography: Biography
)

/**
 * Clase de datos que representa las estadísticas de poder de un superhéroe.
 *
 * @property intelligence Nivel de inteligencia del superhéroe.
 * @property strength Nivel de fuerza del superhéroe.
 * @property speed Nivel de velocidad del superhéroe.
 * @property durability Nivel de durabilidad del superhéroe.
 * @property power Nivel de poder del superhéroe.
 * @property combat Nivel de combate del superhéroe.
 */
data class PowerStatsResponse(
    @SerializedName("intelligence") val intelligence: String,
    @SerializedName("strength") val strength: String,
    @SerializedName("speed") val speed: String,
    @SerializedName("durability") val durability: String,
    @SerializedName("power") val power: String,
    @SerializedName("combat") val combat: String
)

/**
 * Clase de datos que representa la URL de la imagen de un superhéroe.
 *
 * @property url URL de la imagen del superhéroe.
 */
data class SuperheroImageDetailResponse(
    @SerializedName("url") val url: String
)

/**
 * Clase de datos que representa la biografía de un superhéroe.
 *
 * @property fullName Nombre completo del superhéroe.
 * @property publisher Editor o publicador del superhéroe.
 */
data class Biography(
    @SerializedName("full-name") val fullName: String,
    @SerializedName("publisher") val publisher: String
)
