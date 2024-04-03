package com.jaennova.begginerxml.bmicalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.slider.RangeSlider
import com.jaennova.begginerxml.R
import com.jaennova.begginerxml.bmicalculator.BMICalculatorActivity.Companion.IMC_KEY
import kotlin.math.roundToInt

class BmiCalculatorResultActivity : AppCompatActivity() {

    private lateinit var tvResultMini: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView
    private lateinit var btnRecalculate: Button
    private lateinit var viewRecommendation: CardView
    private lateinit var rsBMIResult: RangeSlider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator_result)

        initComponents()
        initUI()
        initListeners()
    }

    private fun initComponents() {
        tvIMC = findViewById(R.id.tvBMI)
        tvResultMini = findViewById(R.id.tvBMIResulMini)
        tvDescription = findViewById(R.id.tvBMIResulDetail)
        btnRecalculate = findViewById(R.id.btnRecalculate)
        viewRecommendation = findViewById(R.id.viewRecomendation)
        rsBMIResult = findViewById(R.id.rsBMIResult)
    }

    private fun initUI() {
        val result: Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        tvIMC.text = result.toString()
        rsBMIResult.isEnabled = false

        val resultIMC = result.toFloat()
        configureRangeSlider(resultIMC)
        setRecommendation(result)
    }

    private fun initListeners() {
        btnRecalculate.setOnClickListener { onBackPressedDispatcher }
    }

    private fun configureRangeSlider(resultIMC: Float) {
        val rsMinValue = 17.0f
        val rsMaxValue = 50.0f
        val rsStepSize = 0.1f
        val rsSetValue =
            ((resultIMC - rsMinValue) / rsStepSize).roundToInt() * rsStepSize + rsMinValue
        rsBMIResult.valueFrom = rsMinValue
        rsBMIResult.valueTo = rsMaxValue
        rsBMIResult.stepSize = rsStepSize
        rsBMIResult.values = listOf(rsSetValue)
    }

    private fun setRecommendation(result: Double) {
        val color = getRecommendationColor(result)
        val recommendationTextResId = getRecommendationTextResId(result)
        val descriptionTextResId = getRecommendationDescriptionTextResId(result)

//        viewRecommendation.setCardBackgroundColor(ContextCompat.getColor(this, color))
        tvResultMini.text = getString(recommendationTextResId)
        tvDescription.text = getString(descriptionTextResId)
    }

    private fun getRecommendationColor(result: Double): Int {
        return when (result) {
            in 0.00..18.50 -> R.color.bmi_colorUnderweight
            in 18.51..24.99 -> R.color.bmi_colorNormal
            in 25.00..29.99 -> R.color.bmi_colorOverweight
            in 30.00..99.00 -> R.color.bmi_colorObesity
            else -> R.color.bmi_colorError
        }
    }

    private fun getRecommendationTextResId(result: Double): Int {
        return when (result) {
            in 0.00..18.50 -> R.string.bmi_underweight
            in 18.51..24.99 -> R.string.bmi_normal
            in 25.00..29.99 -> R.string.bmi_overweight
            in 30.00..99.00 -> R.string.bmi_obesity
            else -> R.string.bmi_error_category_invalid
        }
    }

    private fun getRecommendationDescriptionTextResId(result: Double): Int {
        return when (result) {
            in 0.00..18.50 -> R.string.bmi_underweight_recomendation
            in 18.51..24.99 -> R.string.bmi_normal_recomendation
            in 25.00..29.99 -> R.string.bmi_overweight_recomendation
            in 30.00..99.00 -> R.string.bmi_obesity_recomendation
            else -> R.string.bmi_error_recommendation_unknown
        }
    }
}
