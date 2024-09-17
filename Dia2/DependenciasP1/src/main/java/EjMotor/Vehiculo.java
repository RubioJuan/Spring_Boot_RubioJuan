package EjMotor;

public class Vehiculo {
    private final Motor motor;

    public Vehiculo(Motor motor) {
        this.motor = motor;
    }

    public void iniciar(){
        System.out.println("Iniciando el vehículo...");
        motor.arrancar();
    }

}
