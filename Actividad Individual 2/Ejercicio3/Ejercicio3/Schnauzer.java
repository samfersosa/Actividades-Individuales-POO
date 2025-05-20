public class Schnauzer extends PerroPequeno {
    public Schnauzer(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color, peso, muerde);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Schnauzer: " + nombre + ", Edad: " + edad + ", Color: " + color +
                           ", Peso: " + peso + "kg, ¿Muerde?: " + muerde);
    }
}