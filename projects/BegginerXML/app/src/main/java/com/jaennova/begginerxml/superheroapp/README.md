# Super Hero App

## Instrucciones

1. **Crear Paleta de Colores:**
   - Utiliza [AICOLORS](https://aicolors.co/) u otras herramientas similares para generar la paleta de colores en el archivo `colors.xml`.

2. **Configurar Permisos de Internet:**
   - Agrega el permiso necesario para acceder a internet dentro del archivo Android Manifest.

3. **Agregar Recursos Necesarios:**
   - Incluye los recursos requeridos en los archivos `strings.xml` y `colors.xml` dentro de la carpeta de recursos.

4. **Importar Librerías Necesarias:**
   - Asegúrate de importar las librerías necesarias para el desarrollo del proyecto.

5. **Diseñar Interfaz de Usuario:**
   - Utiliza el archivo `activity_super_hero_list.xml` para diseñar la interfaz de usuario de la actividad principal de tu aplicación, incorporando componentes como la SearchView, RecyclerView y ProgressBar.

6. **Crear Archivo de Recurso de Diseño:**
   - Crea un archivo de recursos de diseño (`item_superhero.xml`) para los elementos de la lista de los personajes.

7. **Desarrollar Actividad de Detalle del Superhéroe:**
   - Crea una nueva actividad llamada `SuperheroDetailActivity.kt` para mostrar los detalles de cada superhéroe en el archivo XML correspondiente.

8. **Diseñar Interfaz de Detalle del Superhéroe:**
   - Diseña la interfaz en el archivo `activity_superhero_detail.xml` donde se presentarán los detalles de cada superhéroe.

9. **Definir Clases de Datos:**
    - Crea las clases de datos `SuperHeroDataResponse.kt` y `SuperHeroDetailResponse.kt` para especificar la estructura de los datos solicitados a la API.

10.  **Crear Interfaz para las Peticiones a la API:**
    - Define una interfaz llamada `ApiService.kt` para realizar las peticiones GET a la API. 

11. **Implementar ViewHolder para RecyclerView:**
    - Crea el ViewHolder necesario para el RecyclerView que se utilizará en la lista de superhéroes.

12. **Crear Adaptador para RecyclerView:**
    - Desarrolla el adaptador necesario para el RecyclerView que mostrará la lista de superhéroes.

13. **Inicializar Variables y Configuraciones:**
    - En la actividad `SuperHeroListActivity.kt`, inicializa las variables necesarias para el ViewBinding, Retrofit y el adaptador.

14. **Implementar Navegación a Detalle:**
    - Crea la función `navigateToDetail` que reciba un ID de tipo string y utilice un `companion object` para pasar la clave del ID a la actividad de detalle del superhéroe a través de un intent.

15. **Agregar Funcionalidad de Búsqueda:**
    - Implementa la función `searchByName` para añadir la lógica de búsqueda de superhéroes en el SearchView.

16. **Inicializar Interfaz de Usuario:**
    - Crea la función `initUI` para inicializar la lógica del SearchView y el adaptador del RecyclerView. Luego, llama a esta función dentro del método `onCreate`.


17. - **Crear Binding y Variable de Clave:**
  - En `SuperheroDetailActivity.kt`, crea el binding necesario y una variable para almacenar la clave recibida del activity anterior.

18. - **Instanciar Retrofit:**
  - Crea la instancia de Retrofit en `SuperheroDetailActivity.kt` para facilitar las solicitudes a la API.

19. - **Función `pxToDp`:**
  - Implementa la función `pxToDp` para convertir píxeles a unidades de densidad independiente de píxeles (dp) según sea necesario en el diseño de la interfaz de usuario.

20. - **Función `updateHeight`:**
  - Crea la función `updateHeight` para establecer de forma gráfica las estadísticas de cada superhéroe, probablemente relacionada con la altura del superhéroe.

21. - **Función `prepareStats`:**
  - Desarrolla la función `prepareStats` para recibir las estadísticas de cada superhéroe y prepararlas para su visualización en la interfaz de usuario.

22. - **Función `createUI`:**
  - Implementa la función `createUI` que reciba los datos del superhéroe y muestre esos datos en pantalla mediante su identificador correspondiente.

23. - **Función `getSuperheroInformation`:**
  - Crea la función `getSuperheroInformation` en `SuperheroDetailActivity.kt` para realizar la petición a la API utilizando Retrofit y coroutines. Esta función debe mostrar los detalles del superhéroe en la interfaz de detalle de superhéroe.
