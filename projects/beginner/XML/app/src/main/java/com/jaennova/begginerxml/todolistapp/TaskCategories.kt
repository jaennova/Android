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