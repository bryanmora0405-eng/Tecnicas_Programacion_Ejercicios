// Clase Padre
class Vehiculo {
    String marca = "Toyota";
    void tocarBocina() {
        System.out.println("¡Beep beep!");
    }
}

// Clase Hija que hereda de Vehiculo
class Auto extends Vehiculo {
    String modelo = "Corolla";
    public static void main(String[] args) {
        Auto miAuto = new Auto();
        miAuto.tocarBocina(); // Usa el método del padre
        System.out.println(miAuto.marca + " " + miAuto.modelo);
    }
}
