# To Do List App

Una aplicación simple de lista de tareas que permite al usuario agregar, editar y eliminar tareas. Es una herramienta básica para organizar y gestionar tareas pendientes.

## Paso a paso

1. Buscar la UI que se desea implementar, con [dribbble](https://dribbble.com/shots/18579924-To-Do-List-app)

2. Creacion de la paleta de colore en `colors.xml` con ayuda de [aicolors](https://aicolors.co/)

<details>
  <summary>Codigo</summary>
  
  ```xml
  <?xml version="1.0" encoding="utf-8"?>
<resources>
<!--To Do App-->
    <!-- Colores primarios -->
    <color name="todoPrimary">#0085ff</color>
    <color name="todoPrimaryDark">#5a85ae</color>
    <color name="colorPrimaryLight">#e0ffff</color>

    <!-- Colores de acento -->
    <color name="todoAccent">#006fff</color>
    <color name="todoAccentLight">#e1ffff</color>

    <!-- Colores de texto -->
    <color name="todoTextPrimary">#FFFFFF</color>
    <color name="todoTextSecondary">#9e9e9e</color>

    <!-- Colores de fondo -->
    <color name="todoBackgroundPrimary">#1E1E1E</color>
    <color name="todoBackgroundSecondary">#2d2d2d</color>
    <color name="todoBackgroundTertiary">#454545</color>

<!--    Colores de categorias-->
    <color name="todo_personal">#4e86c6</color>
    <color name="todo_learning">#8f6dab</color>
    <color name="todo_work">#5da894</color>
    <color name="todo_shopping">#e56c70</color>
    <color name="todo_personal_selected">#0c1a2a</color>
    <color name="todo_learning_selected">#2d1e2a</color>
    <color name="todo_work_selected">#0e1e17</color>
    <color name="todo_shopping_selected">#421b1c</color>

</resources>

  ```
  </details>

<br>

3. Agrega los strings necesarios en el archivo `strings.xml` en la carperta de recursos

<details>
  <summary>Codigo</summary>

  ```xml
  <resources>
    <string name="app_name">BegginerXML</string>
    <!--To Do App-->
    <string name="todo_title_screen">Bienvenido, Jaen!</string>
    <string name="todo_categories">Categorias</string>
    <string name="todo_tasks">Tareas</string>
    <string name="fab_add_task">Agregar Tarea</string>
    <string name="todo_add_task">Agregar tarea</string>
    <string name="todo_work">Trabajo</string>
    <string name="todo_personal">Personal</string>
    <string name="todo_learning">Aprendizaje</string>
    <string name="todo_shopping">Compras</string>
</resources>
  ```

</details>

<br>

4. agregar los iconos a la carpeta drawable
2. crear un nuevo theme en el archivo `themes.xml`para la app, agregarlo al android manifest

<details>

<summary>Codigo</summary>

```xml
<resources xmlns:android="http://schemas.android.com/apk/res/android" xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Base.Theme.BegginerXML" parent="Theme.Material3.DayNight.NoActionBar">
        <!-- Customize your light theme here. -->
        <!-- <item name="colorPrimary">@color/my_light_primary</item> -->
    </style>

    <style name="Theme.ToDoApp" parent="Theme.Material3.DayNight.NoActionBar">
        <!-- Customize your light theme here. -->
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/todoPrimary</item>
        <item name="colorPrimaryVariant">@color/colorPrimaryLight</item>
        <item name="colorOnPrimary">@color/todoPrimaryDark</item>
        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/todoBackgroundSecondary</item>
        <item name="colorSecondaryVariant">@color/todoTextSecondary</item>
        <!-- Status bar color. -->
        <item name="android:statusBarColor">@color/todoBackgroundPrimary</item>
        <!-- Customize your theme here. -->
    </style>

    <style name="ToDoSubtitle">
        <item name="android:layout_marginBottom">8dp</item>
        <item name="android:layout_marginHorizontal">32dp</item>
        <item name="android:textColor">@color/todoTextSecondary</item>
        <item name="android:textSize">18sp</item>
    </style>

    <style name="Theme.BegginerXML" parent="Theme.ToDoApp" />
</resources>
```
</details>
3. Crea un archivo `Task.kt` para definir una clase Task que represente una tarea en tu lista. Puedes incluir propiedades como title (título), description (descripción), isCompleted (estado de finalización) y priority (prioridad). Adicionalmente puedes crear un listado con las tareas, como ejemplo.

<details>

<summary>Codigo</summary>

```kt
package com.jaennova.begginerxml.todolistapp

data class Task(
    val name: String,
    val category: TaskCategories,
    var isSelected: Boolean = false
)

val listTasks = mutableListOf(
    Task("Buy groceries", TaskCategories.Personal),
    Task("Call mom", TaskCategories.Work, true),
    Task("Buy milk", TaskCategories.Shopping),
    Task("Learn Kotlin", TaskCategories.Learning),
)
```
</details>


4. Crea un archivo `TaskCategories.kt` para definir una clase TaskCategories que represente una tarea en tu lista. Puedes incluir propiedades como Work (Trabajo), Learning (aprendiendo), Personal (personal) y Shopping (compras).

<details>

<summary>Codigo</summary>

```kt
package com.jaennova.begginerxml.todolistapp

sealed class TaskCategories(var isSelected: Boolean = true) {
    data object Work : TaskCategories()
    data object Learning : TaskCategories()
    data object Personal : TaskCategories()
    data object Shopping : TaskCategories()
}

val listCategories = listOf(
    TaskCategories.Work,
    TaskCategories.Personal,
    TaskCategories.Shopping,
    TaskCategories.Learning
)
```
</details>


5. Diseña la interfaz de usuario para la actividad principal de tu aplicación utilizando el archivo `activity_todo.xml`. Puedes utilizar un `FrameLayout` como contenedor principal y agregar un `LinearLayout` para almacenar los elementos de la interfaz de usuario. Dentro del `LinearLayout`, agrega dos `TextView` para el título y el subtítulo, dos `RecyclerView` para las categorías y las tareas, y un `ExtendedFloatingActionButton` para agregar nuevas tareas.

<details>

<summary>Codigo</summary>

```xml
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">


    <LinearLayout
        android:id="@+id/main"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/todoBackgroundPrimary"
        android:orientation="vertical"
        tools:context=".todolistapp.ToDoListActivity">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginHorizontal="32dp"
            android:layout_marginVertical="40dp"
            android:text="@string/todo_title_screen"
            android:textColor="@color/todoTextPrimary"
            android:textSize="32sp" />

        <TextView
            style="@style/ToDoSubtitle"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/todo_categories" />

        <androidx.recyclerview.widget.RecyclerView
            android:id="@+id/rvCategories"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />

        <TextView
            style="@style/ToDoSubtitle"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="20dp"
            android:text="@string/todo_tasks" />

        <androidx.recyclerview.widget.RecyclerView
            android:id="@+id/rvTasks"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginHorizontal="16dp"
            android:layout_marginTop="8dp" />

    </LinearLayout>

    <com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
        android:id="@+id/fabAddTask"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="end|bottom"
        android:layout_margin="20dp"
        android:backgroundTint="@color/todoPrimaryDark"
        android:text="@string/fab_add_task"
        android:textColor="@color/todoTextPrimary"
        app:icon="@drawable/ic_add_task"
        app:iconTint="@color/todoTextPrimary" />

</FrameLayout>
```
</details>

<br>

6.  Crea un `Layout Resource File` para los elementos de la lista de tareas, `todo_item_task.xml`. Utiliza un `CardView` como contenedor principal y agrega un `LinearLayout` para almacenar un `CheckBox` y un `TextView` para el nombre de la tarea.

<details>

<summary>Codigo</summary>

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.cardview.widget.CardView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_marginVertical="4dp"
    app:cardBackgroundColor="@color/todoBackgroundSecondary"
    app:cardCornerRadius="16dp">

    <LinearLayout
        android:paddingVertical="16dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <CheckBox
            android:id="@+id/cbTask"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />

        <TextView
            android:id="@+id/tvTask"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/todoTextPrimary"
            android:textSize="18sp"
            tools:text="Prueba" />
    </LinearLayout>
</androidx.cardview.widget.CardView>
```
</details>

<br>

7.  Crea un `Layout Resource File` para el diálogo de agregar tareas, `todo_dialog_task.xml`. Utiliza un `LinearLayout` como contenedor principal y agrega un `EditText` para el nombre de la tarea, un `RadioGroup` para las categorías y un botón para agregar la tarea.

<details>

<summary>Codigo</summary>

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="250dp"
    android:layout_height="wrap_content"
    android:background="@color/todoBackgroundSecondary"
    android:orientation="vertical"
    android:padding="24dp">

    <EditText
        android:id="@+id/etTask"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:autofillHints=""
        android:backgroundTint="@color/todoPrimaryDark"
        android:hint="@string/todo_add_task"
        android:inputType="text"
        android:textColor="@color/todoTextSecondary"
        android:textColorHint="@color/todoTextSecondary"
        tools:ignore="DuplicateSpeakableTextCheck" />

    <RadioGroup
        android:id="@+id/rgCategories"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <RadioButton
            android:id="@+id/rbWork"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:buttonTint="@color/todo_work"
            android:text="@string/todo_work"
            android:textColor="@color/todoTextPrimary" />

        <RadioButton
            android:id="@+id/rbLearning"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:buttonTint="@color/todo_learning"
            android:text="@string/todo_learning"
            android:textColor="@color/todoTextPrimary" />

        <RadioButton
            android:id="@+id/rbPersonal"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:buttonTint="@color/todo_personal"
            android:checked="true"
            android:text="@string/todo_personal"
            android:textColor="@color/todoTextPrimary" />

        <RadioButton
            android:id="@+id/rbShopping"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:buttonTint="@color/todo_shopping"
            android:text="@string/todo_shopping"
            android:textColor="@color/todoTextPrimary" />

    </RadioGroup>

    <Button
        android:id="@+id/btnAddTask"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:backgroundTint="@color/todoPrimaryDark"
        android:text="@string/todo_add_task"
        android:textColor="@color/todoTextPrimary" />
</LinearLayout>
```
</details>

<br>

8.  Crea un `Layout Resource File` para los elementos de las categorias, `to_do_item_task_category.xml`. Utiliza un `Card View` como contenedor principal y agrega un `Linear Layout` para almacenar un `Text View` para el nombre del la categoria y un `View` para una linea divisora.

<details>

<summary>Codigo</summary>

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.cardview.widget.CardView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/cardCategory"
    android:layout_width="160dp"
    android:layout_height="90dp"
    android:layout_marginHorizontal="8dp"
    android:layout_marginVertical="16dp"
    app:cardBackgroundColor="@color/todoBackgroundTertiary"
    app:cardCornerRadius="16dp">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_margin="16dp"
        android:gravity="center_vertical"
        android:orientation="vertical">

        <TextView
            android:id="@+id/tvCategoryName"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="@color/todoTextPrimary"
            android:textSize="19sp"
            tools:text="Work" />

        <View
            android:id="@+id/divider"
            android:layout_width="match_parent"
            android:layout_height="2dp"
            android:layout_marginTop="8dp"
            android:background="@color/todoPrimary" />
    </LinearLayout>
</androidx.cardview.widget.CardView>
```
</details>

<br>

9.  Dentro del archivo `TodoActivity.kt` inicializa las vistas y los adaptadores para las categorías y las tareas, y configura los controladores de eventos para el botón de agregar tareas y los elementos de la lista de tareas.

<details>

<summary>Codigo</summary>

```kt

// Inicializacion de variables
    private lateinit var rvCategories: RecyclerView
    private lateinit var rvTasks: RecyclerView
    private lateinit var fabAddTask: ExtendedFloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do_list)
        initComponents()
        initUI()
        initListeners()
    }
     private fun initListeners() {
        fabAddTask.setOnClickListener {  } //se crea despues
    }
    private fun initComponents() {
        rvCategories = findViewById(R.id.rvCategories)
        rvTasks = findViewById(R.id.rvTasks)
        fabAddTask = findViewById(R.id.fabAddTask)
    }

    private fun initUI() {
        categoriesAdapter =
            CategoriesAdapter(listCategories) { position -> updateCategories(position) }
        rvCategories.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter

        taskAdapter = TaskAdapter(listTasks) { position -> onItemSelected(position) }
        rvTasks.layoutManager = LinearLayoutManager(this)
        rvTasks.adapter = taskAdapter
    }
```
</details>

<br>

10. Crea un archivo Kotlin para el adaptador de las categorías, `CategoriesAdapter.kt`. Este adaptador debe extender la clase RecyclerView.Adapter e implementar los métodos necesarios para mostrar las categorías en la lista.

<details>

<summary>Codigo</summary>

```kt
package com.jaennova.begginerxml.todolistapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jaennova.begginerxml.R

class CategoriesAdapter(private val categories: List<TaskCategories>,  private val onItemSelected:(Int) -> Unit) :
    RecyclerView.Adapter<CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.to_do_item_task_category, parent, false)
        return CategoriesViewHolder(view)
    }


    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.render(categories[position],onItemSelected)
    }

    override fun getItemCount() = categories.size
}
```
</details>

<br>

11. Crea un archivo Kotlin para el adaptador de las tareas, `TasksAdapter.kt`. Este adaptador debe extender la clase RecyclerView.Adapter e implementar los métodos necesarios para mostrar las tareas en la lista.

<details>

<summary>Codigo</summary>

```kt
package com.jaennova.begginerxml.todolistapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jaennova.begginerxml.R

class TaskAdapter(var task: List<Task>, private val onTaskSelected: (Int) -> Unit) :
    RecyclerView.Adapter<TaskViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.to_do_item_task, parent, false)
        return TaskViewHolder(view)
    }


    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.render(task[position])
        holder.itemView.setOnClickListener { onTaskSelected(position) }
    }

    override fun getItemCount() = task.size
}
```
</details>

<br>

12. Crea un archivo Kotlin para el controlador de vistas de las tareas, `TasksViewHolder.kt`. Este controlador de vistas debe extender la clase RecyclerView.ViewHolder e implementar los métodos necesarios para mostrar y manipular los elementos de la lista de tareas.

<details>

<summary>Codigo</summary>

```kt
package com.jaennova.begginerxml.todolistapp

import android.content.res.ColorStateList
import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.jaennova.begginerxml.R

class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvTask: TextView = view.findViewById(R.id.tvTask)
    private val cbTask = view.findViewById<CheckBox>(R.id.cbTask)
    fun render(task: Task) {
        if (task.isSelected) {
            tvTask.paintFlags = tvTask.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        } else {
            tvTask.paintFlags = tvTask.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }

        tvTask.text = task.name
        cbTask.isChecked = task.isSelected
        val color = when (task.category) {
            TaskCategories.Shopping -> R.color.todo_shopping
            TaskCategories.Personal -> R.color.todo_personal
            TaskCategories.Work -> R.color.todo_work
            TaskCategories.Learning -> R.color.todo_learning
        }

        cbTask.buttonTintList = ColorStateList.valueOf(
            ContextCompat.getColor(cbTask.context, color)
        )
    }
}
```
</details>

<br>

13. Crea un archivo Kotlin para el controlador de vistas de las tareas, `CategoriesViewHolder.kt`. Este controlador de vistas debe extender la clase RecyclerView.ViewHolder e implementar los métodos necesarios para mostrar y manipular los elementos de la lista de categorias.

<details>

<summary>Codigo</summary>

```kt
package com.jaennova.begginerxml.todolistapp

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.jaennova.begginerxml.R

class CategoriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvCategoryName: TextView = view.findViewById(R.id.tvCategoryName)
    private val divider: View = view.findViewById(R.id.divider)
    private val viewContainer: CardView = view.findViewById(R.id.cardCategory)

    fun render(category: TaskCategories, onItemSelected: (Int) -> Unit) {

        val color = if (category.isSelected) {
            R.color.todoBackgroundSecondary
        } else {
            R.color.todoBackgroundTertiary
        }
        viewContainer.setCardBackgroundColor(ContextCompat.getColor(viewContainer.context, color))

        itemView.setOnClickListener { onItemSelected(layoutPosition) }
        when (category) {
            TaskCategories.Work -> {
                tvCategoryName.text = "Work"
                divider.setBackgroundResource(R.color.todo_work)
//                viewContainer.setCardBackgroundColor(viewContainer.context.getColor(R.color.todo_work))
            }

            TaskCategories.Personal -> {
                tvCategoryName.text = "Personal"
                divider.setBackgroundResource(R.color.todo_personal)
//                viewContainer.setCardBackgroundColor(viewContainer.context.getColor(R.color.todo_personal))
            }

            TaskCategories.Shopping -> {
                tvCategoryName.text = "Shopping"
                divider.setBackgroundResource(R.color.todo_shopping)
//                viewContainer.setCardBackgroundColor(viewContainer.context.getColor(R.color.todo_shopping))
            }

            TaskCategories.Learning -> {
                tvCategoryName.text = "Learning"
                divider.setBackgroundResource(R.color.todo_learning)
//                viewContainer.setCardBackgroundColor(viewContainer.context.getColor(R.color.todo_learning))
            }
        }
    }
}
```
</details>

<br>


14.  Crea una funcion para la creacion del dialog para usarse en la accion del FAB.
     
<details>

<summary>Codigo</summary>

```kt
    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.to_do_dialog_task)
        val btnAddTask = dialog.findViewById<Button>(R.id.btnAddTask)
        val etTask = dialog.findViewById<EditText>(R.id.etTask)
        val rgCategories = dialog.findViewById<RadioGroup>(R.id.rgCategories)

        btnAddTask.setOnClickListener {
            val currentTask = etTask.text.toString()
            if (currentTask.isNotEmpty()) {

                val selectedId = rgCategories.checkedRadioButtonId
                val selectedRadioButton: RadioButton = rgCategories.findViewById(selectedId)
                val currentCategory: TaskCategories = when (selectedRadioButton.text) {
                    "Trabajo" -> Work
                    "Aprendiendo" -> Learning
                    "Compras" -> Shopping
                    else -> Personal
                }
                listTasks.add(Task(currentTask, currentCategory))
                updateTasks()
                dialog.hide()
            }
        }
        dialog.show()
    }
```
</details>
<br>
posteriormente agrega la funcion a la accion del FAB.

<details>

<summary>Accion FAB</summary>

```kt
 fabAddTask.setOnClickListener { showDialog() }
```
</details>

<br>


15. Crea las funciones `onItemSelected`, `updateCategories`, `UpdateTasks` para actualizar los recyclers views al hacer un cambio

<details>

<summary>Codigo</summary>

```kt
    private fun onItemSelected(position: Int) {
        listTasks[position].isSelected = !listTasks[position].isSelected
        updateTasks()
    }

    private fun updateCategories(position: Int) {
        listCategories[position].isSelected = !listCategories[position].isSelected
        categoriesAdapter.notifyItemChanged(position)
        updateTasks()
    }

    private fun updateTasks() {
        val selectedCategories: List<TaskCategories> = listCategories.filter { it.isSelected }
        val newTasks = listTasks.filter { selectedCategories.contains(it.category) }
        taskAdapter.task = newTasks
        taskAdapter.notifyDataSetChanged()
    }
```
</details>

<br>
