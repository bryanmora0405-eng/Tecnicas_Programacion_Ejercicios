class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El perro dice: Guau guau");
    }
}

class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El gato dice: Miau");
    }
}
