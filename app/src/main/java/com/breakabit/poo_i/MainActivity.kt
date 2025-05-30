package com.breakabit.poo_i

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import model.Rectangulo
import kotlin.math.floor
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        val rectanguloView:View = findViewById(R.id.rectangulo)


        rectanguloView.post {
            val rectangulo = Rectangulo(ContextCompat.getColor(this, R.color.red), rectanguloView.layoutParams.width, rectanguloView.layoutParams.height, rectanguloView.x, rectanguloView.y)


            val btnArriba:Button = findViewById(R.id.btnArriba)
            val btnAbajo:Button = findViewById(R.id.btnAbajo)
            val btnIzquierda:Button = findViewById(R.id.btnIzquierda)
            val btnDerecha:Button = findViewById(R.id.btnDerecha)
            val btnCambiarTamano:Button = findViewById(R.id.btnCambiarTamano)
            val btnCambiarColor:Button = findViewById(R.id.btnCambiarColor)



            btnArriba.setOnClickListener {
                rectangulo.moverArriba()

                actualizarVista(rectanguloView, rectangulo)
            }

            btnAbajo.setOnClickListener {
                rectangulo.moverAbajo()

                actualizarVista(rectanguloView, rectangulo)

            }

            btnDerecha.setOnClickListener {
                rectangulo.moverDerecha()

                actualizarVista(rectanguloView, rectangulo)

            }

            btnIzquierda.setOnClickListener {
                rectangulo.moverIzquierda()

                actualizarVista(rectanguloView, rectangulo)

            }

            btnCambiarTamano.setOnClickListener {
                val lado = floor(Math.random()*150) +100
                rectangulo.cambiarTamano(lado.toInt(), lado.toInt())

                actualizarVista(rectanguloView, rectangulo)

            }

            btnCambiarColor.setOnClickListener {
                //rectangulo.cambiarColor(ContextCompat.getColor(this, R.color.blue))

                rectangulo.cambiarColor(generarColor())
                actualizarVista(rectanguloView, rectangulo)

            }
        }



    }

    fun generarColor(): Int{
        val random = Random.Default
        val red = random.nextInt(256)
        val green = random.nextInt(256)
        val blue = random.nextInt(256)

        return Color.rgb(red, green, blue)

    }

    private fun actualizarVista(rectanguloView: View, rectangulo:Rectangulo){
        rectanguloView.layoutParams.height = rectangulo.alto
        rectanguloView.layoutParams.width = rectangulo.ancho

        rectanguloView.setBackgroundColor(rectangulo.color)

        rectanguloView.x=rectangulo.x.toFloat()
        rectanguloView.y=rectangulo.y.toFloat()

        rectanguloView.requestLayout()

    }


}