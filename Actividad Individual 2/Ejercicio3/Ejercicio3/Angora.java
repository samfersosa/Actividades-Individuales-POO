public class Angora extends GatoPeloLargo {
    public Angora(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Gato Angora: " + nombre + ", Edad: " + edad + ", Color: " + color +
                           ", Altura salto: " + alturaSalto + "m, Longitud salto: " + longitudSalto + "m");
    }
}