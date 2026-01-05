public class Persona {
    private String nombre; // Privado: nadie fuera de esta clase puede verlo

    // Getter (Para obtener el nombre)
    public String getNombre() {
        return nombre;
    }

    // Setter (Para asignar el nombre de forma segura)
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
}
