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