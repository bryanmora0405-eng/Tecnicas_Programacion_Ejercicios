abstract class Forma {
    // Método abstracto (no tiene cuerpo, la hija debe decidir cómo se hace)
    abstract void dibujar();
}

class Circulo extends Forma {
    void dibujar() {
        System.out.println("Dibujando un círculo perfectamente redondo.");
    }
}
