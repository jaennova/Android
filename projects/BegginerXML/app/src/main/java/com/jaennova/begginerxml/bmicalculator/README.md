# BMI Calculator

Una aplicación que calcula el Índice de Masa Corporal (IMC) de un usuario basado en su peso y altura ingresados.

![screens body mass index with https://www.collage.es/](/projects/screens/screens_bmi.png)
## Paso a paso

- Buscar la UI que se desea implementar, con [dribbble](https://dribbble.com/shots/22451667-BMI-Calculator-Mobile-App-UI-Design) o cualquier otra fuente de inspiración.

- Crear la paleta de colores en colors.xml con ayuda de [aicolors](https://aicolors.co/) o cualquier otra herramienta de generación de paletas de colores.

- Agregar los strings necesarios en el archivo [strings.xml](/projects/BegginerXML/app/src/main/res/values/strings.xml) en la carpeta de recursos.

- Agregar los iconos a la carpeta drawable. con ayuda de [inloop](https://inloop.github.io/svg2android/).

- Crear un nuevo theme en el archivo themes.xml para la app, agregarlo al AndroidManifest.xml.

- Diseña la interfaz de usuario para la actividad principal de tu aplicación utilizando el archivo [activity_bmi_calculator.xml](/projects/BegginerXML/app/src/main/res/layout/activity_bmi_calculator.xml).

- Crea un nuevo empty activity y en el layout generado crea la interfaz de usuario para mostrar el resultado del calculo del IMC, posteriormente, diseña la interfaz de usuario para la actividad de resultado de tu aplicación utilizando el archivo [activity_bmi_calculator_result.xml](/projects/BegginerXML/app/src/main/res/layout/activity_bmi_calculator_result.xml)

- Dentro de la Activity principal, inicializa las variables de los componentes, las variables para inicializar la altura, peso y edad, tambien las variables para comprobar cuando un genero (hombre, mujer) es seleccionado

<details>
<summary>Codigo</summary>

```kt
    private var isMaleSelected: Boolean = true
    private var isFemaleSelected: Boolean = false
    private var currentWeight: Int = 70
    private var currentAge: Int = 30
    private var currentHeight: Int = 120

    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView
    private lateinit var tvHeight: TextView
    private lateinit var rsHeight: RangeSlider
    private lateinit var btnSubtractWeight: FloatingActionButton
    private lateinit var btnPlusWeight: FloatingActionButton
    private lateinit var tvWeight: TextView
    private lateinit var btnSubtractAge: FloatingActionButton
    private lateinit var btnPlusAge: FloatingActionButton
    private lateinit var tvAge: TextView
    private lateinit var btnCalculate: Button
```

</details>

- agrega un companion object para almacenar la constante que se usará para enviar el valor calculado del IMC a traves de un intent.

<details>
<summary>Codigo</summary>

```kt
    companion object {
        const val IMC_KEY = "IMC_RESULT"
    }
```

</details>

- Crea la funcion `initComponents` para inicializar los componentes e inicializala dentro del onCreate

<details>
<summary>Codigo</summary>

```kt
    private fun initComponents() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)
        btnSubtractWeight = findViewById(R.id.btnSubtractWeight)
        btnPlusWeight = findViewById(R.id.btnPlusWeight)
        tvWeight = findViewById(R.id.tvWeight)
        btnSubtractAge = findViewById(R.id.btnSubtractAge)
        btnPlusAge = findViewById(R.id.btnPlusAge)
        tvAge = findViewById(R.id.tvAge)
        btnCalculate = findViewById(R.id.btnCalculate)
    }
```

</details>

- Crea las funciones `getBackgroundColor` y `setGenderColor` para obtener el color de la card dependiendo si es seleccionada; `setAge` para cambiar la edad en el `TextView` de la edad; `setWeight` para cambiar el valor del peso en el `TextView`; `changeGender` para cambiar el estado de las cards de generos si alguna es seleccionada.

<details>
<summary>Codigo</summary>

```kt
    private fun getBackgroundColor(isSelectedComponent: Boolean): Int {

        val colorReference = if (isSelectedComponent) {
            R.color.bmi_colorBackgroundTertiary
        } else {
            R.color.bmi_colorBackgroundSecondary
        }

        return ContextCompat.getColor(this, colorReference)
    }
        private fun setGenderColor() {
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }
     
         private fun setAge() {
        tvAge.text = currentAge.toString()
    }

    private fun setWeight() {
        tvWeight.text = currentWeight.toString()
    }

    private fun changeGender() {
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }

```

</details>

- Crea la funcion `calculateIMC` para hacer el calculo del IMC y la funcion `navigateToResult` que reciba como valor el double que devuelva la funcion de `calculateIMC` y con un intent mande ese valor a la pantalla de resultado.

<details>
<summary>Codigo</summary>

```kt
    private fun navigateToResult(result: Double) {
        val intent = Intent(this, BmiCalculatorResultActivity::class.java)
        intent.putExtra(IMC_KEY, result)
        startActivity(intent)
    }

    private fun calculateIMC(): Double {
        val df = DecimalFormat("#.##")
        val imc = currentWeight / (currentHeight.toDouble() / 100 * currentHeight.toDouble() / 100)
        return df.format(imc).toDouble()
    }
```

</details>

- crea la funcion `initListeners` para agregar los listeners de todos los botones y sus respectivas funcionalidades

<details>
<summary>Codigo</summary>

```kt
    private fun initListeners() {
        viewMale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        viewFemale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        rsHeight.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##")
            currentHeight = df.format(value).toInt()
            tvHeight.text = "$currentHeight cm"
        }
        btnPlusWeight.setOnClickListener {
            currentWeight += 1
            setWeight()
        }
        btnSubtractWeight.setOnClickListener {
            currentWeight -= 1
            setWeight()
        }
        btnPlusAge.setOnClickListener {
            currentAge += 1
            setAge()
        }
        btnSubtractAge.setOnClickListener {
            currentAge -= 1
            setAge()
        }
        btnCalculate.setOnClickListener {
            val result = calculateIMC()
            navigateToResult(result)
        }
    }
```

</details>

- Crea la funcion initUI para inicializar los valores de los componentes

<details>
<summary>Codigo</summary>

```kt
    private fun initUI() {
        setGenderColor()
        setWeight()
        setAge()
    }
```

</details>

- Dentro de la activity de resultado, inicializa las variables de los componentes

<details>
<summary>Codigo</summary>

```kt
    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView
    private lateinit var btnRecalculate: Button
    private lateinit var viewRecommendation: CardView
    private lateinit var rsBMIResult: RangeSlider
```

</details>

- Crea la funcion `initComponentes` para inicializar los componentes y la funcion `initListeners` para agregar el listener del boton para recalcular

<details>
<summary>Codigo</summary>

```kt
    private fun initComponents() {
        tvIMC = findViewById(R.id.tvBMI)
        tvResult = findViewById(R.id.tvBMIResult)
        tvDescription = findViewById(R.id.tvBMIResulDetail)
        btnRecalculate = findViewById(R.id.btnRecalculate)
        viewRecommendation = findViewById(R.id.viewRecomendation)
        rsBMIResult = findViewById(R.id.rsBMIResult)
    }
        private fun initListeners() {
        btnRecalculate.setOnClickListener { onBackPressed() }
    }
```

</details>

- Crea las funciones `getTitleResult` y `getDescriptionResult` para asignar valores a los TextViews dependiendo del rango del IMC

<details>
<summary>Codigo</summary>

```kt
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
```

</details>

- Crea la Funcion `setResultBmi` para establecer los TextViews usando las funciones anteriores

<details>
<summary>Codigo</summary>

```kt
    private fun setResultBmi(result: Double) {
        val recommendationTextResId = getTitleResult(result)
        val descriptionTextResId = getDescriptionResult(result)
        tvResult.text = getString(recommendationTextResId)
        tvDescription.text = getString(descriptionTextResId)
    }
```

</details>

- Crea una funcion para establecer el rango del range slider dependiendo del resultado del IMC calculado y mostrarlo en el range slider y un textview

<details>
<summary>Codigo</summary>

```kt
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
```

</details>


- crea la funcion `initUI` y colocala antes de llamar a la funcion `initListeners` que reciba el valor del IMC calculado en la Activity anterior para que dependiendo del resultado, muestre una informacion en especifico.

<details>
<summary>Codigo</summary>

```kt
    private fun initUI() {
        val result: Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        tvIMC.text = result.toString()
        rsBMIResult.isEnabled = false

        val resultIMC = result.toFloat()
        configureRangeSlider(resultIMC)
        setResultBmi(result)
    }
```

</details>
