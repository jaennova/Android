# Proyecto a desarrollar

Este repositorio contiene una serie de proyectos organizados en tres secciones diferentes: Beginner, Intermediate y Advanced. Cada sección se enfoca en diferentes niveles de habilidad y profundiza en conceptos más avanzados de desarrollo de aplicaciones Android.

## Sección Beginner

### Conceptos:

1. **Layouts y Views**: En Android, los Layouts son contenedores que controlan la posición y el tamaño de los elementos de la interfaz de usuario, mientras que las Views son los elementos individuales (como botones, texto, imágenes, etc.) que se muestran en la pantalla. Dominar los Layouts y Views es fundamental para diseñar interfaces de usuario efectivas y atractivas.

2. **Activities y Fragments**: Las Activities representan una única pantalla con una interfaz de usuario, mientras que los Fragments son componentes modulares que representan una parte de la interfaz de usuario de una Activity. Ambos son esenciales para construir la navegación y la interfaz de usuario en una aplicación Android.

3. **RecyclerView**: RecyclerView es un componente que permite mostrar grandes conjuntos de datos de manera eficiente en una lista desplazable. Es más flexible y eficiente que ListView y es ampliamente utilizado para implementar listas en aplicaciones Android.

4. **Almacenamiento de datos local**: SharedPreferences es una forma de almacenamiento de datos simple y liviana que se utiliza para almacenar datos en pares clave-valor de manera persistente en el dispositivo del usuario. Es útil para guardar configuraciones de la aplicación, preferencias del usuario y otros datos simples que deben persistir entre sesiones de la aplicación.

5. **Intents y navegación entre Activities**: Los Intents son objetos utilizados para comunicarse entre componentes de una aplicación, como Activities y Servicios. En el nivel de principiante, comprender cómo utilizar Intents para iniciar otras Activities y pasar datos entre ellas es esencial para la navegación básica dentro de una aplicación.

6. **Gestión de recursos**: En Android, los recursos son archivos externos que se utilizan en la aplicación, como imágenes, cadenas de texto, archivos XML, etc. Aprender a organizar y utilizar estos recursos correctamente es crucial para desarrollar aplicaciones Android efectivas y mantenibles.

### Proyectos:

1. **ToDo List App**:

   - **Descripción**: Una aplicación simple de lista de tareas que permite al usuario agregar, editar y eliminar tareas. Es una herramienta básica para organizar y gestionar tareas pendientes.
   
   - **Conceptos Practicados**: Este proyecto te permite practicar el uso de RecyclerView para mostrar una lista de tareas de manera eficiente y el almacenamiento de datos local utilizando SharedPreferences para guardar y recuperar las tareas del usuario.

   - **Recursos**: Puedes encontrar ejemplos de interfaces de usuario para listas de tareas en sitios como [AndroidHive](https://www.androidhive.info/2017/09/android-recyclerview-swipe-delete-undo-using-itemtouchhelper/) o en repositorios de código abierto en plataformas como GitHub.

2. **Calculator App**:

   - **Descripción**: Una calculadora básica que realiza operaciones aritméticas simples. Es una herramienta útil para realizar cálculos básicos en dispositivos móviles.
   
   - **Conceptos Practicados**: En este proyecto, te centrarás en diseñar la interfaz de usuario utilizando diferentes tipos de Layouts y Views para crear los botones numéricos y de operación de la calculadora, y también aprenderás a manejar eventos de clic en los botones para realizar las operaciones.

   - **Recursos**: Puedes encontrar ejemplos de interfaces de usuario para calculadoras básicas en sitios de tutoriales como [Android Authority](https://www.androidauthority.com/simple-calculator-app-768654/) o en ejemplos disponibles en GitHub.
  
3. Notepad App:
   - **Descripción**: Una aplicación simple para tomar notas que permite al usuario crear, editar y eliminar notas. Además, la aplicación puede incluir la capacidad de categorizar las notas y buscar entre ellas.
   - **Conceptos Practicados**: Layouts y Views para diseñar la interfaz de usuario de la pantalla de notas, Activities para representar las diferentes pantallas de la aplicación, RecyclerView para mostrar la lista de notas de manera eficiente y SharedPreferences para almacenar las notas localmente.
   - **Recursos**: Puedes encontrar ejemplos de interfaces de usuario para aplicaciones de toma de notas en sitios como [Dribbble](https://dribbble.com/tags/note_app) o [GitHub](https://github.com/topics/note-taking-app).

4. Recipe Book App:
   - **Descripción**: Una aplicación que permite a los usuarios buscar, guardar y compartir recetas de cocina. Los usuarios pueden ver detalles de las recetas, guardar sus favoritas y compartirlas con amigos.
   - **Conceptos Practicados**: Layouts y Views para diseñar la interfaz de usuario de la pantalla de recetas, Activities para representar las diferentes pantallas de la aplicación, RecyclerView para mostrar la lista de recetas de manera eficiente, SharedPreferences para almacenar las recetas favoritas y la gestión de Intents para compartir recetas.
   - **Recursos**: Puedes encontrar ejemplos de interfaces de usuario para aplicaciones de libros de recetas en sitios como [Pinterest](https://www.pinterest.com/search/pins/?q=recipe%20app%20ui) o [Behance](https://www.behance.net/search/projects/?search=recipe%20app%20ui).

5. Contact Manager App:
   - **Descripción**: Una aplicación que permite a los usuarios agregar, editar y eliminar contactos. Además, los usuarios pueden buscar contactos por nombre o número y organizarlos en grupos.
   - **Conceptos Practicados**: Layouts y Views para diseñar la interfaz de usuario de la pantalla de contactos, Activities para representar las diferentes pantallas de la aplicación, RecyclerView para mostrar la lista de contactos de manera eficiente, SharedPreferences para almacenar los contactos localmente y la gestión de Intents para agregar o editar contactos.
   - **Recursos**: Puedes encontrar ejemplos de interfaces de usuario para aplicaciones de gestión de contactos en sitios como [Dribbble](https://dribbble.com/tags/contact_manager_app) o [GitHub](https://github.com/topics/contact-manager-app).

6. Task Manager App:
   - **Descripción**: Una aplicación que permite a los usuarios organizar y realizar un seguimiento de sus tareas y proyectos. Los usuarios pueden crear listas de tareas, establecer recordatorios, establecer prioridades y colaborar en proyectos con otros usuarios.
    - **Conceptos Practicados**: Layouts y Views para diseñar la interfaz de usuario de la pantalla de tareas y listas de tareas, Activities para representar las diferentes pantallas de la aplicación, RecyclerView para mostrar la lista de tareas de manera eficiente, SharedPreferences para almacenar las listas de tareas localmente y la gestión de Intents para compartir tareas o listas de tareas.

    - **Recursos**: Puedes encontrar ejemplos de interfaces de usuario para aplicaciones de gestión de tareas en sitios como Dribbble o GitHub.

7. Habit Tracker App:
   - **Descripción**: Una aplicación que ayuda a los usuarios a realizar un seguimiento de sus hábitos diarios, establecer metas y recibir recordatorios. Los usuarios pueden registrar sus actividades diarias, ver su progreso a lo largo del tiempo y recibir notificaciones para mantenerse en camino.
   - **Conceptos Practicados**: Layouts y Views para diseñar la interfaz de usuario de la pantalla de hábitos y actividades, Activities para representar las diferentes pantallas de la aplicación, RecyclerView para mostrar la lista de hábitos y actividades de manera eficiente, SharedPreferences para almacenar los hábitos y actividades localmente y la gestión de Intents para establecer recordatorios.
    - **Recursos**: Puedes encontrar ejemplos de interfaces de usuario para aplicaciones de seguimiento de hábitos en sitios como Dribbble o GitHub.
## Sección Intermediate

### Conceptos:

1. **Consumo de APIs**: Aprender a consumir datos de servicios web utilizando bibliotecas como Retrofit o Volley. Entender cómo realizar solicitudes HTTP, manejar respuestas y procesar datos en formato JSON.

2. **Persistencia de datos avanzada**: Utilizar bases de datos locales, como SQLite o Room, para almacenar y recuperar datos de manera estructurada. Aprender a trabajar con consultas SQL, crear y actualizar tablas, y utilizar ORM (Object-Relational Mapping) con Room.

3. **Patrones de diseño de software**: Familiarizarse con patrones de diseño comunes en Android, como MVC (Model-View-Controller), MVP (Model-View-Presenter) y MVVM (Model-View-ViewModel), y entender cómo aplicarlos en el desarrollo de aplicaciones.

4. **Manejo avanzado de RecyclerView**: Explorar técnicas avanzadas para personalizar la apariencia y el comportamiento de RecyclerView, como múltiples tipos de vistas, animaciones de elementos y desplazamiento suave.

5. **Geolocalización y Mapas**: Integrar servicios de geolocalización en la aplicación para obtener la ubicación del usuario y mostrarla en un mapa. Utilizar la API de Google Maps para mostrar mapas interactivos y agregar marcadores.

6. **Material Design**: Diseñar interfaces de usuario modernas y atractivas siguiendo las directrices de Material Design de Google. Utilizar componentes de diseño como AppBar, BottomNavigationView, CardView, etc.

7. **Gestión de permisos**: Aprender a solicitar y manejar permisos de usuario en Android, especialmente en contextos como el acceso a la cámara, almacenamiento externo, ubicación, etc.

8. **Trabajo en segundo plano**: Implementar tareas en segundo plano utilizando servicios, trabajadores en segundo plano y programadores de trabajos (JobScheduler) para realizar operaciones que no deben bloquear la interfaz de usuario.

9. **Notificaciones**: Integrar notificaciones push locales y remotas en la aplicación para mantener a los usuarios informados sobre eventos importantes o actualizaciones en la aplicación.

10. **Pruebas unitarias y de integración**: Aprender a escribir pruebas unitarias y de integración para garantizar la calidad y la fiabilidad de la aplicación. Utilizar herramientas como JUnit, Mockito y Espresso para realizar pruebas automatizadas.

### Proyectos:

Por supuesto, aquí tienes algunos proyectos para la sección intermediate que abordan múltiples conceptos:

### 1. Weather Forecast App:
   - **Descripción**: Una aplicación que muestra el pronóstico del tiempo para una ubicación específica. Los usuarios pueden buscar ciudades, ver detalles del clima como temperatura, humedad, velocidad del viento, etc., y recibir notificaciones de cambios climáticos.
   - **Conceptos Practicados**: Consumo de APIs (utilizando Retrofit o Volley para obtener datos meteorológicos), manejo avanzado de RecyclerView para mostrar la lista de ciudades y detalles del clima, integración de servicios de geolocalización para obtener la ubicación del usuario y mostrarla en un mapa, material Design para diseñar una interfaz de usuario atractiva y responsiva.
   - **Recursos**: Puedes encontrar ejemplos de diseño de interfaces de usuario para aplicaciones de pronóstico del tiempo en sitios como [Dribbble](https://dribbble.com/search/weather%20app) o [GitHub](https://github.com/topics/weather-forecast-app).

### 2. Movie Explorer App:
   - **Descripción**: Una aplicación que permite a los usuarios explorar y buscar películas, ver detalles de películas como el elenco, la trama, las críticas, etc., y guardar películas favoritas para ver más tarde.
   - **Conceptos Practicados**: Consumo de APIs (utilizando Retrofit o Volley para obtener datos de una API de películas), persistencia de datos avanzada (utilizando Room para almacenar las películas favoritas del usuario), manejo avanzado de RecyclerView para mostrar la lista de películas de manera dinámica, material Design para diseñar una interfaz de usuario moderna y atractiva.
   - **Recursos**: Puedes encontrar ejemplos de diseño de interfaces de usuario para aplicaciones de exploración de películas en sitios como [Dribbble](https://dribbble.com/tags/movie_app) o [GitHub](https://github.com/topics/movie-explorer-app).

### 3. Fitness Tracker App:
   - **Descripción**: Una aplicación que permite a los usuarios realizar un seguimiento de su actividad física, registrar entrenamientos, establecer metas de fitness, y recibir notificaciones de progreso y logros.
   - **Conceptos Practicados**: Persistencia de datos avanzada (utilizando SQLite o Room para almacenar registros de actividad física y metas de fitness), manejo avanzado de RecyclerView para mostrar la lista de registros de entrenamiento de manera eficiente, notificaciones para informar al usuario sobre progreso y logros, material Design para diseñar una interfaz de usuario moderna y motivadora.
   - **Recursos**: Puedes encontrar ejemplos de diseño de interfaces de usuario para aplicaciones de seguimiento de actividad física en sitios como [Dribbble](https://dribbble.com/search/fitness%20app) o [GitHub](https://github.com/topics/fitness-tracker-app).


### 4. Recipe Finder App:
   - **Descripción**: Una aplicación que permite a los usuarios buscar recetas de cocina utilizando ingredientes específicos. Los usuarios pueden ver detalles de las recetas, guardar sus favoritas y compartir recetas con amigos.
   - **Conceptos Practicados**: Consumo de APIs (utilizando Retrofit o Volley para obtener datos de una API de recetas), persistencia de datos avanzada (utilizando SQLite o Room para almacenar recetas favoritas), manejo avanzado de RecyclerView para mostrar la lista de recetas de manera eficiente, material Design para diseñar una interfaz de usuario moderna y atractiva.
   - **Recursos**: Puedes encontrar ejemplos de diseño de interfaces de usuario para aplicaciones de búsqueda de recetas en sitios como [Dribbble](https://dribbble.com/tags/recipe_app) o [GitHub](https://github.com/topics/recipe-finder-app).

### 5. Travel Planner App:
   - **Descripción**: Una aplicación que ayuda a los usuarios a planificar viajes, buscar destinos turísticos, reservar alojamiento y actividades, y mantener un itinerario de viaje organizado.
   - **Conceptos Practicados**: Consumo de APIs (utilizando Retrofit o Volley para obtener datos de servicios de viaje y turismo), integración de mapas y geolocalización para mostrar destinos y planificar rutas, persistencia de datos avanzada (utilizando Room para almacenar información de viajes y reservas), material Design para diseñar una interfaz de usuario intuitiva y atractiva.
   - **Recursos**: Puedes encontrar ejemplos de diseño de interfaces de usuario para aplicaciones de planificación de viajes en sitios como [Dribbble](https://dribbble.com/search/travel%20app) o [GitHub](https://github.com/topics/travel-planner-app).

### 6. Language Learning App:
   - **Descripción**: Una aplicación que ayuda a los usuarios a aprender nuevos idiomas mediante lecciones interactivas, juegos de vocabulario, ejercicios de pronunciación y seguimiento de progreso.
   - **Conceptos Practicados**: Consumo de APIs (utilizando Retrofit o Volley para obtener datos de lecciones y ejercicios), persistencia de datos avanzada (utilizando SQLite o Room para almacenar vocabulario y progreso del usuario), material Design para diseñar una interfaz de usuario atractiva y fácil de usar, notificaciones para recordatorios de estudio y progreso.
   - **Recursos**: Puedes encontrar ejemplos de diseño de interfaces de usuario para aplicaciones de aprendizaje de idiomas en sitios como [Dribbble](https://dribbble.com/tags/language_learning_app) o [GitHub](https://github.com/topics/language-learning-app).


### 7. Social Media Feed App:
   - **Descripción**: Una aplicación que muestra un feed de publicaciones de redes sociales, donde los usuarios pueden ver y interactuar con publicaciones de amigos, como dar "me gusta", comentar o compartir.
   - **Conceptos Practicados**: Consumo de APIs (utilizando Retrofit o Volley para obtener datos de una API de redes sociales), manejo avanzado de RecyclerView para mostrar el feed de manera dinámica, persistencia de datos avanzada (utilizando Room para almacenar publicaciones y datos de usuario), material Design para diseñar una interfaz de usuario moderna y atractiva.
   - **Recursos**: Puedes encontrar ejemplos de diseño de interfaces de usuario para aplicaciones de feeds sociales en sitios como [Dribbble](https://dribbble.com/tags/social_media_app) o [GitHub](https://github.com/topics/social-media-feed-app).

### 8. Music Player App:
   - **Descripción**: Una aplicación que permite a los usuarios reproducir y gestionar su biblioteca de música. Los usuarios pueden crear listas de reproducción, explorar álbumes y artistas, y controlar la reproducción desde una interfaz de usuario intuitiva.
   - **Conceptos Practicados**: Consumo de APIs (para obtener metadatos de canciones y álbumes), persistencia de datos avanzada (utilizando Room para almacenar información de música y listas de reproducción), material Design para diseñar una interfaz de usuario elegante y funcional, manejo avanzado de RecyclerView para mostrar listas de canciones y álbumes.
   - **Recursos**: Puedes encontrar ejemplos de diseño de interfaces de usuario para aplicaciones de reproductor de música en sitios como [Dribbble](https://dribbble.com/search/music%20player) o [GitHub](https://github.com/topics/music-player-app).

### 9. Fitness Challenge App:
   - **Descripción**: Una aplicación que organiza desafíos de fitness y motivación para los usuarios. Los usuarios pueden unirse a desafíos, registrar su progreso, compartir logros y competir con amigos.
   - **Conceptos Practicados**: Consumo de APIs (para obtener datos de desafíos y competiciones), integración de mapas y geolocalización para registrar actividades y rutas, persistencia de datos avanzada (utilizando Room para almacenar progreso y datos de desafíos), material Design para diseñar una interfaz de usuario atractiva y motivadora.
   - **Recursos**: Puedes encontrar ejemplos de diseño de interfaces de usuario para aplicaciones de desafíos de fitness en sitios como [Dribbble](https://dribbble.com/search/fitness%20challenge) o [GitHub](https://github.com/topics/fitness-challenge-app).


### 10. Recipe Sharing App:
   - **Descripción**: Una aplicación que permite a los usuarios compartir sus recetas de cocina favoritas con la comunidad. Los usuarios pueden publicar nuevas recetas, explorar recetas de otros usuarios, guardar recetas en favoritos y dejar comentarios.
   - **Conceptos Practicados**: Consumo de APIs (para obtener datos de recetas compartidas por otros usuarios), persistencia de datos avanzada (utilizando Room para almacenar recetas guardadas y comentarios), manejo avanzado de RecyclerView para mostrar listas de recetas y comentarios, material Design para diseñar una interfaz de usuario atractiva y funcional.
   - **Recursos**: Puedes encontrar ejemplos de diseño de interfaces de usuario para aplicaciones de intercambio de recetas en sitios como [Dribbble](https://dribbble.com/search/recipe%20sharing%20app) o [GitHub](https://github.com/topics/recipe-sharing-app).

### 11. Task Management App:
   - **Descripción**: Una aplicación que ayuda a los usuarios a gestionar sus tareas y proyectos. Los usuarios pueden crear listas de tareas, asignar prioridades, establecer fechas límite y recibir recordatorios.
   - **Conceptos Practicados**: Consumo de APIs (para obtener datos de tareas compartidas en equipos de trabajo), persistencia de datos avanzada (utilizando Room para almacenar tareas y proyectos), manejo avanzado de RecyclerView para mostrar listas de tareas y proyectos, material Design para diseñar una interfaz de usuario limpia y eficiente.
   - **Recursos**: Puedes encontrar ejemplos de diseño de interfaces de usuario para aplicaciones de gestión de tareas en sitios como [Dribbble](https://dribbble.com/search/task%20management%20app) o [GitHub](https://github.com/topics/task-management-app).

### 12. Event Planning App:
   - **Descripción**: Una aplicación que facilita la planificación y organización de eventos. Los usuarios pueden crear eventos, invitar a amigos, establecer ubicaciones y fechas, enviar recordatorios y gestionar la lista de invitados.
   - **Conceptos Practicados**: Consumo de APIs (para obtener datos de ubicaciones y disponibilidad de espacios para eventos), persistencia de datos avanzada (utilizando Room para almacenar detalles de eventos y lista de invitados), integración de mapas para mostrar ubicaciones de eventos, material Design para diseñar una interfaz de usuario intuitiva y atractiva.
   - **Recursos**: Puedes encontrar ejemplos de diseño de interfaces de usuario para aplicaciones de planificación de eventos en sitios como [Dribbble](https://dribbble.com/search/event%20planning%20app) o [GitHub](https://github.com/topics/event-planning-app).


## Sección Advanced

### Conceptos:

1. **Arquitectura MVVM**: Implementación de la arquitectura Model-View-ViewModel.
2. **Jetpack Compose**: Construcción de la interfaz de usuario declarativa.
3. **Room Database**: Utilizar una base de datos local con Room.
4. **Autenticación y autorización con Firebase**: Implementar autenticación de usuario y control de acceso.

### Proyectos:

### 1. Social Media Dashboard App:
   - **Descripción**: Una aplicación que permite a los usuarios gestionar múltiples cuentas de redes sociales desde una sola plataforma. Los usuarios pueden autenticarse con Firebase Authentication, cargar datos de diferentes APIs de redes sociales utilizando Retrofit, y utilizar la arquitectura MVVM para separar la lógica de presentación de los datos.
   - **Conceptos Practicados**: Arquitectura MVVM, Autenticación y autorización con Firebase, Integración de APIs avanzadas, Manejo avanzado de estados, Navegación entre pantallas.
   - **Recursos**: Puedes encontrar ejemplos de arquitecturas MVVM en Android en sitios como [GitHub](https://github.com/topics/android-mvvm) y tutoriales sobre Firebase Authentication en la [documentación oficial de Firebase](https://firebase.google.com/docs/auth/android/start).

### 2. E-commerce Marketplace App:
   - **Descripción**: Una aplicación de comercio electrónico que permite a los usuarios comprar y vender productos. Utiliza Room Database para almacenar información de productos y usuarios, implementa Jetpack Compose para construir una interfaz de usuario dinámica, y carga imágenes de productos desde una API utilizando Glide o Coil.
   - **Conceptos Practicados**: Room Database, Jetpack Compose, Carga de imágenes con Glide o Coil, Integración de APIs avanzadas, Paginación.
   - **Recursos**: Puedes encontrar ejemplos de Jetpack Compose en la [documentación oficial de Android](https://developer.android.com/jetpack/compose) y tutoriales sobre Room Database en el [sitio web oficial de Android Developers](https://developer.android.com/training/data-storage/room).

### 3. Travel Journal App:
   - **Descripción**: Una aplicación que permite a los usuarios planificar viajes, guardar detalles de itinerarios y registrar experiencias de viaje. Utiliza Room Database para almacenar datos de viaje de manera estructurada, integra Google Maps para mostrar ubicaciones y rutas de viaje, y realiza pruebas avanzadas de rendimiento utilizando Firebase Test Lab.
   - **Conceptos Practicados**: Room Database, Integración de Google Maps, Paginación, Pruebas avanzadas y automatización de pruebas, Manejo avanzado de estados.
   - **Recursos**: Puedes encontrar ejemplos de integración de Google Maps en la [documentación oficial de Google Maps Platform](https://developers.google.com/maps/documentation/android-sdk/intro) y tutoriales sobre Room Database en el [sitio web oficial de Android Developers](https://developer.android.com/training/data-storage/room).


### 4. Fitness Tracker App:
   - **Descripción**: Una aplicación completa para realizar un seguimiento del progreso en el fitness. Los usuarios pueden registrar entrenamientos, establecer objetivos, seguir su progreso a lo largo del tiempo y recibir recomendaciones personalizadas. La aplicación utiliza arquitectura MVVM para separar la lógica de negocio de la interfaz de usuario, implementa paginación para cargar registros de entrenamiento de manera eficiente y realiza pruebas avanzadas de integración para garantizar la fiabilidad de las funciones.
   - **Conceptos Practicados**: Arquitectura MVVM, Paginación, Pruebas avanzadas y automatización de pruebas, Integración de APIs avanzadas, Manejo avanzado de estados.
   - **Recursos**: Puedes encontrar ejemplos de arquitecturas MVVM en Android en sitios como [GitHub](https://github.com/topics/android-mvvm) y tutoriales sobre paginación en la [documentación oficial de Android](https://developer.android.com/topic/libraries/architecture/paging).

### 5. Recipe Recommendation App:
   - **Descripción**: Una aplicación que recomienda recetas personalizadas según las preferencias y restricciones dietéticas del usuario. Utiliza Firebase Authentication para permitir que los usuarios inicien sesión de forma segura, integra la API de recomendaciones de recetas utilizando Retrofit para obtener sugerencias personalizadas, y muestra imágenes de recetas utilizando Coil para la carga de imágenes eficiente.
   - **Conceptos Practicados**: Autenticación y autorización con Firebase, Integración de APIs avanzadas, Carga de imágenes con Coil, Arquitectura MVVM, Manejo avanzado de estados.
   - **Recursos**: Puedes encontrar ejemplos de integración de Firebase Authentication en la [documentación oficial de Firebase](https://firebase.google.com/docs/auth/android/start) y tutoriales sobre Retrofit en la [documentación oficial de Android](https://developer.android.com/training/data-storage/room).

### 6. Financial Management App:
   - **Descripción**: Una aplicación para ayudar a los usuarios a gestionar sus finanzas personales. Utiliza Room Database para almacenar transacciones financieras y categorías de gastos, implementa Jetpack Compose para crear una interfaz de usuario moderna y dinámica, y utiliza notificaciones para recordatorios de pagos y seguimiento de gastos.
   - **Conceptos Practicados**: Room Database, Jetpack Compose, Notificaciones, Arquitectura MVVM, Manejo avanzado de estados.
   - **Recursos**: Puedes encontrar ejemplos de Jetpack Compose en la [documentación oficial de Android](https://developer.android.com/jetpack/compose) y tutoriales sobre Room Database en el [sitio web oficial de Android Developers](https://developer.android.com/training/data-storage/room).


### 7. Real-time Chat App:
   - **Descripción**: Una aplicación de chat en tiempo real que permite a los usuarios comunicarse entre sí. Utiliza Firebase Authentication para la autenticación de usuarios, Firebase Realtime Database o Firestore para el almacenamiento y sincronización de mensajes en tiempo real, y Jetpack Compose para construir una interfaz de usuario moderna y dinámica.
   - **Conceptos Practicados**: Autenticación y autorización con Firebase, Integración de Firebase Realtime Database o Firestore, Jetpack Compose, Arquitectura MVVM.
   - **Recursos**: Puedes encontrar ejemplos de integración de Firebase en la [documentación oficial de Firebase](https://firebase.google.com/docs/android/setup) y tutoriales sobre Jetpack Compose en la [documentación oficial de Android](https://developer.android.com/jetpack/compose).

### 8. Video Streaming App:
   - **Descripción**: Una aplicación que permite a los usuarios ver videos en streaming desde una plataforma online. Utiliza la arquitectura MVVM para gestionar la lógica de negocio y la interfaz de usuario de manera separada, integra Retrofit para consumir una API de streaming de video, y utiliza ExoPlayer para reproducir los videos de manera eficiente.
   - **Conceptos Practicados**: Arquitectura MVVM, Consumo de APIs avanzadas con Retrofit, Integración de ExoPlayer para reproducción de video, Manejo avanzado de estados.
   - **Recursos**: Puedes encontrar ejemplos de integración de ExoPlayer en la [documentación oficial de ExoPlayer](https://exoplayer.dev/hello-world.html) y tutoriales sobre Retrofit en la [documentación oficial de Android](https://developer.android.com/training/data-storage/room).

### 9. Remote Control App:
   - **Descripción**: Una aplicación que permite a los usuarios controlar dispositivos electrónicos a distancia. Utiliza Firebase Authentication para la autenticación de usuarios, Firebase Realtime Database o Firestore para el intercambio de comandos en tiempo real, y Jetpack Compose para crear una interfaz de usuario intuitiva y atractiva.
   - **Conceptos Practicados**: Autenticación y autorización con Firebase, Integración de Firebase Realtime Database o Firestore, Jetpack Compose, Arquitectura MVVM.
   - **Recursos**: Puedes encontrar ejemplos de integración de Firebase en la [documentación oficial de Firebase](https://firebase.google.com/docs/android/setup) y tutoriales sobre Jetpack Compose en la [documentación oficial de Android](https://developer.android.com/jetpack/compose).


### 10. Music Player App with Offline Support:
   - **Descripción**: Una aplicación de reproducción de música que permite a los usuarios reproducir canciones tanto en línea como fuera de línea. Utiliza Firebase Authentication para la autenticación de usuarios, Firebase Storage para almacenar archivos de música, y Jetpack Compose para diseñar una interfaz de usuario moderna y dinámica. Además, implementa Room Database para almacenar información sobre las canciones descargadas y las preferencias del usuario.
   - **Conceptos Practicados**: Autenticación y autorización con Firebase, Integración de Firebase Storage para almacenamiento de archivos, Jetpack Compose, Room Database, Arquitectura MVVM.
   - **Recursos**: Puedes encontrar ejemplos de integración de Firebase en la [documentación oficial de Firebase](https://firebase.google.com/docs/android/setup) y tutoriales sobre Jetpack Compose en la [documentación oficial de Android](https://developer.android.com/jetpack/compose).

### 11. Language Learning App with Speech Recognition:
   - **Descripción**: Una aplicación que ayuda a los usuarios a aprender nuevos idiomas utilizando reconocimiento de voz para practicar la pronunciación. Utiliza Firebase Authentication para gestionar la autenticación de usuarios, Firebase Realtime Database o Firestore para almacenar datos de usuarios y progreso de aprendizaje, y la API de reconocimiento de voz de Android para evaluar la pronunciación del usuario.
   - **Conceptos Practicados**: Autenticación y autorización con Firebase, Integración de Firebase Realtime Database o Firestore, API de reconocimiento de voz de Android, Arquitectura MVVM.
   - **Recursos**: Puedes encontrar ejemplos de integración de Firebase en la [documentación oficial de Firebase](https://firebase.google.com/docs/android/setup) y tutoriales sobre la API de reconocimiento de voz de Android en la [documentación oficial de Android](https://developer.android.com/reference/android/speech/RecognizerIntent).

### 12. Virtual Reality Tour App:
   - **Descripción**: Una aplicación que permite a los usuarios explorar destinos turísticos utilizando tecnología de realidad virtual. Utiliza Firebase Authentication para autenticar usuarios, Firebase Realtime Database o Firestore para almacenar información sobre destinos y puntos de interés, y Google VR SDK para proporcionar experiencias de realidad virtual inmersivas.
   - **Conceptos Practicados**: Autenticación y autorización con Firebase, Integración de Firebase Realtime Database o Firestore, Google VR SDK, Arquitectura MVVM.
   - **Recursos**: Puedes encontrar ejemplos de integración de Firebase en la [documentación oficial de Firebase](https://firebase.google.com/docs/android/setup) y tutoriales sobre Google VR SDK en la [documentación oficial de Google VR](https://developers.google.com/vr/develop).

