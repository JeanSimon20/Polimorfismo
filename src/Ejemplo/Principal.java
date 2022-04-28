package Ejemplo;

public class Principal {
    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4]; //Arreglo y memoria para 4
        misVehiculos[0] = new Vehiculo("GH7", "Ferrari", "A89");
        misVehiculos[1] = new VehiculoTurismo(4, "78HJ", "Audi", "P14");
        misVehiculos[2] = new VehiculoDeportivo(500, "45HJ", "Toyota", "KJ8");
        misVehiculos[3] = new VehiculoFurgoneta(2000, "87HJ", "Halo", "PO4");  
        
        for(Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }
    }
}
