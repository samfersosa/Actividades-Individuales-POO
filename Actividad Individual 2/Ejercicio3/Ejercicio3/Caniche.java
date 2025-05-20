public class Caniche extends PerroPequeno {
    public Caniche(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color, peso, muerde);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Caniche: " + nombre + ", Edad: " + edad + ", Color: " + color +
                           ", Peso: " + peso + "kg, ¿Muerde?: " + muerde);
    }
}