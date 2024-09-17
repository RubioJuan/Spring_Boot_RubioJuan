package EjMotor;

public class Main {
    public static void main(String[] args) {
        Motor motorGasolina = new MotorGasolina();
        Vehiculo miCarro = new Vehiculo(motorGasolina);

        miCarro.iniciar();
    }
    //// ClaseB.java
    //public class ClaseB {
    //    // Implementación de ClaseB
    //}
    //
    //// ClaseA.java
    //public class ClaseA {
    //    private ClaseB objetoB;  // Declaración de la dependencia
    //
    //    // Constructor que acepta un objeto de ClaseB como parámetro
    //    public ClaseA(ClaseB objetoB) {
    //        this.objetoB = objetoB;
    //    }
    //
    //    // Resto de la implementación de ClaseA que utiliza objetoB
    //}
}
