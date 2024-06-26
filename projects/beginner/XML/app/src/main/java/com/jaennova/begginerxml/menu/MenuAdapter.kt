package com.jaennova.begginerxml.menu

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jaennova.begginerxml.R
import com.jaennova.begginerxml.bmicalculator.BMICalculatorActivity
import com.jaennova.begginerxml.superheroapp.SuperHeroListActivity
import com.jaennova.begginerxml.todolistapp.ToDoListActivity

class MenuAdapter(private val context: Context, private val menuItems: List<MenuItem>) :
    RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.menu_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val menuItem = menuItems[position]
        holder.bind(menuItem)
    }

    override fun getItemCount() = menuItems.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.tvTitleApp)
        private val iconImageView: ImageView = itemView.findViewById(R.id.ivIconApp)
        private val descriptionTextView: TextView = itemView.findViewById(R.id.tvDescriptionApp)

        fun bind(menuItem: MenuItem) {
            titleTextView.text = menuItem.title
            iconImageView.setImageResource(menuItem.iconResId)
            descriptionTextView.text = menuItem.description

            itemView.setOnClickListener {
                navigateToActivity(menuItem)
            }
        }

        private fun navigateToActivity(menuItem: MenuItem) {
            when (menuItem.title) {
                "Todo List" -> openActivity(ToDoListActivity::class.java)
                "BMI Calculator" -> openActivity(BMICalculatorActivity::class.java)
                "Super Hero App" -> openActivity(SuperHeroListActivity::class.java)
            }
        }

        private fun openActivity(activityClass: Class<*>) {
            val intent = Intent(context, activityClass)
            context.startActivity(intent)
        }
    }

}
