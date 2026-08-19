
class Rey {
    private String nombre;

    public Rey(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

public class juego_trono {
    public static void main(String[] args) {
        // Instanciación dentro del método main
        Rey soberano = new Rey("El Profesor");
        System.out.println("En el trono está: " + soberano.getNombre());
    }
}
