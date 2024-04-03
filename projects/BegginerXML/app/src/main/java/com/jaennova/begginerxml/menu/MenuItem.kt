package com.jaennova.begginerxml.menu

import com.jaennova.begginerxml.R

data class MenuItem(val title: String, val iconResId: Int, val description: String)

val menuItems = listOf(
    MenuItem(
        "Todo List",
        R.drawable.ic_to_do_list_app,
        "Aplicación simple de lista de tareas"
    ),
    MenuItem(
        "BMI Calculator",
        R.drawable.ic_bmi_app,
        "Aplicación que calcula el Índice de Masa Corporal (IMC)"
    ),
)
