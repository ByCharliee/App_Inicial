package model

class RectanguloConBorde(color: Int, ancho: Int, alto: Int,x1: Float, y1: Float, var bordeColor: Int): Rectangulo(color, ancho, alto,x1, y1) {

    fun cambiarBorde(nuevoBorde: Int){
        bordeColor = nuevoBorde
    }

}