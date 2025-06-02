package model

open class Rectangulo(var color: Int, var ancho: Int, var alto: Int, var x: Int, var y: Int) {
    //Coordenadas iniciales



    val dimensiones = Midimension(alto, ancho, x, y)



    //Comportamientos

    fun moverArriba(){
         //y -= 10
        dimensiones.y -= 10
    }

    fun moverAbajo(){
        //y += 10
        dimensiones.y += 10
    }

    fun moverDerecha(){
       //x += 10

        dimensiones.x += 10
    }

    fun moverIzquierda(){
       //x -= 10
        dimensiones.x -= 10
    }

    //Metodo para cambiar tamaño


    fun cambiarTamano( nuevoAncho: Int, nuevoAlto: Int){
        /*ancho = nuevoAncho
        alto = nuevoAlto */
        dimensiones.alto = nuevoAlto
        dimensiones.ancho = nuevoAncho
    }

    fun cambiarColor(nuevoColor: Int){
        color = nuevoColor
    }

}