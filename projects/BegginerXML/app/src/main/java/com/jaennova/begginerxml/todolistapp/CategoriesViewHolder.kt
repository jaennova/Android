package com.jaennova.begginerxml.todolistapp

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getString
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
                tvCategoryName.text = getString(itemView.context, R.string.todo_work)
                divider.setBackgroundResource(R.color.todo_work)
//                viewContainer.setCardBackgroundColor(viewContainer.context.getColor(R.color.todo_work))
            }

            TaskCategories.Personal -> {
                tvCategoryName.text = getString(itemView.context, R.string.todo_personal)
                divider.setBackgroundResource(R.color.todo_personal)
//                viewContainer.setCardBackgroundColor(viewContainer.context.getColor(R.color.todo_personal))
            }

            TaskCategories.Shopping -> {
                tvCategoryName.text = getString(itemView.context, R.string.todo_shopping)
                divider.setBackgroundResource(R.color.todo_shopping)
//                viewContainer.setCardBackgroundColor(viewContainer.context.getColor(R.color.todo_shopping))
            }

            TaskCategories.Learning -> {
                tvCategoryName.text = getString(itemView.context, R.string.todo_learning)
                divider.setBackgroundResource(R.color.todo_learning)
//                viewContainer.setCardBackgroundColor(viewContainer.context.getColor(R.color.todo_learning))
            }
        }
    }
}