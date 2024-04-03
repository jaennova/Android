package com.jaennova.begginerxml.bmicalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.material.slider.RangeSlider
import com.jaennova.begginerxml.R
import com.jaennova.begginerxml.bmicalculator.BMICalculatorActivity.Companion.IMC_KEY
import kotlin.math.roundToInt

class BmiCalculatorResultActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
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
        tvResult = findViewById(R.id.tvBMIResult)
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
        setResultBmi(result)
    }

    private fun initListeners() {
        btnRecalculate.setOnClickListener { onBackPressed() }
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

    private fun setResultBmi(result: Double) {
        val recommendationTextResId = getTitleResult(result)
        val descriptionTextResId = getDescriptionResult(result)
        tvResult.text = getString(recommendationTextResId)
        tvDescription.text = getString(descriptionTextResId)
    }

    private fun getTitleResult(result: Double): Int {
        return when (result) {
            in 0.00..18.50 -> R.string.bmi_underweight
            in 18.51..24.99 -> R.string.bmi_normal
            in 25.00..29.99 -> R.string.bmi_overweight
            in 30.00..99.00 -> R.string.bmi_obesity
            else -> R.string.bmi_error_category_invalid
        }
    }

    private fun getDescriptionResult(result: Double): Int {
        return when (result) {
            in 0.00..18.50 -> R.string.bmi_underweight_recomendation
            in 18.51..24.99 -> R.string.bmi_normal_recomendation
            in 25.00..29.99 -> R.string.bmi_overweight_recomendation
            in 30.00..99.00 -> R.string.bmi_obesity_recomendation
            else -> R.string.bmi_error_recommendation_unknown
        }
    }
}
