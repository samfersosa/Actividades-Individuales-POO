public class YorkshireTerrier extends PerroPequeno {
    public YorkshireTerrier(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color, peso, muerde);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Yorkshire Terrier: " + nombre + ", Edad: " + edad + ", Color: " + color +
                           ", Peso: " + peso + "kg, ¿Muerde?: " + muerde);
    }
}