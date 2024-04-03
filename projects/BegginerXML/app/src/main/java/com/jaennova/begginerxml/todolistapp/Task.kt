package com.jaennova.begginerxml.todolistapp

data class Task(
    val name: String,
    val category: TaskCategories,
    var isSelected: Boolean = false
)

val listTasks = mutableListOf(
    Task("Comprar medicna", TaskCategories.Personal),
    Task("Llamar a mamá", TaskCategories.Work, true),
    Task("Comprar leche", TaskCategories.Shopping),
    Task("Aprender Kotlin", TaskCategories.Learning),
)