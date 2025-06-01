package model

import android.graphics.Color

class RectanguloConBorde(color: Int, ancho: Int, alto: Int,x1: Float, y1: Float, var bordeColor: Int): Rectangulo(color, ancho, alto,x1, y1) {

    class ManejoColor{
        companion object{
            val azul = Color.BLUE
            val verde = Color.GREEN
            val morado = Color.MAGENTA
            val negro = Color.BLACK

            fun mostrarColor(): Int{
                val color = listOf(azul, verde, negro, morado)

                return color.random()
            }

        }
    }


    fun cambiarBorde(nuevoBorde: Int){
        bordeColor = nuevoBorde
    }

}