package DIP2

interface Motor {
    fun encender()
}

class MotorGasolina : Motor {
    override fun encender(){
        println("Motor de gasolina encendido")
    }
}
class MotorElectrico : Motor{
    override fun encender() {
        println("Motor electrico encendido")
    }
}

class Vehiculo(private val motor: Motor) {
    fun arrancar() {
        motor.encender()
    }
}
fun main(){
    val motorElectrico = MotorElectrico()
    val motorGasolina = MotorGasolina()
    val vehiculo1 = Vehiculo(motorGasolina)
    val vehiculo2 = Vehiculo(motorElectrico)
    vehiculo1.arrancar()
    vehiculo2.arrancar()
}