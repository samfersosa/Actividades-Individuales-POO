public class AzulRuso extends GatoPeloCorto {
    public AzulRuso(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Gato Azul Ruso: " + nombre + ", Edad: " + edad + ", Color: " + color +
                           ", Altura salto: " + alturaSalto + "m, Longitud salto: " + longitudSalto + "m");
    }
}