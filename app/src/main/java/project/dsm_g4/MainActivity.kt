package project.dsm_g4

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {

    private lateinit var radioBoton1: RadioButton
    private lateinit var radioBoton2: RadioButton
    private lateinit var constraintLayout1: ConstraintLayout
    private lateinit var constraintLayout2: ConstraintLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hu12_resumen_compra)
      /*  radioBoton1 = findViewById(R.id.botonCredito)
        radioBoton2 = findViewById(R.id.botonDebito)
        constraintLayout1 = findViewById(R.id.metodoPago1)
        constraintLayout2 = findViewById(R.id.metodoPago2)
        radioBoton1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                showView1()
            }
        }

        radioBoton2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                showView2()
            }
        }*/

    }
    private fun showView1() {
        val constraintSet = ConstraintSet()
        constraintSet.clone(constraintLayout1)
        constraintSet.setVisibility(R.id.metodoPago1, ConstraintSet.VISIBLE)
        constraintSet.setVisibility(R.id.metodoPago2, ConstraintSet.GONE)
        constraintSet.applyTo(constraintLayout1)
    }

    private fun showView2() {
        val constraintSet = ConstraintSet()
        constraintSet.clone(constraintLayout1)
        constraintSet.setVisibility(R.id.metodoPago1, ConstraintSet.GONE)
        constraintSet.setVisibility(R.id.metodoPago2, ConstraintSet.VISIBLE)
        constraintSet.applyTo(constraintLayout1)

    }
}