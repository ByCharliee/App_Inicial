package model

class Rectangulo(var color: Int, var ancho: Int, var alto: Int, var x: Float, var y: Float) {
    //Coordenadas iniciales

    //var x: Float
    //var y: Float

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