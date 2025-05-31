package model

open class Rectangulo(var color: Int, var ancho: Int, var alto: Int, x1: Float, y1: Float) {
    //Coordenadas iniciales


    var x = x1
    var y = y1





    //Comportamientos

    fun moverArriba(){
        y -= 10
    }

    fun moverAbajo(){
        y += 10
    }

    fun moverDerecha(){
        x += 10
    }

    fun moverIzquierda(){
        x -= 10
    }

    //Metodo para cambiar tamaño

    fun cambiarTamano( nuevoAncho: Int, nuevoAlto: Int){
        ancho = nuevoAncho
        alto = nuevoAlto
    }

    fun cambiarColor(nuevoColor: Int){
        color = nuevoColor
    }

}