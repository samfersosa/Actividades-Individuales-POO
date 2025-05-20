public class PruebaTiendaMascotas {
    public static void main(String[] args) {

        // 🐶 Perros
        Caniche caniche = new Caniche("Luna", 3, "Blanco", 4.5, false);
        YorkshireTerrier yorkshire = new YorkshireTerrier("Max", 2, "Marrón", 3.2, false);

        // Llamada a método mostrarInfo() y sonido()
        System.out.println("=== Información de Perros ===");
        caniche.mostrarInfo();
        yorkshire.mostrarInfo();

        System.out.println();
        Perro.sonido(); // método estático

        // 🐱 Gatos
        Esfinge esfinge = new Esfinge("Nina", 4, "Beige", 1.2, 2.0);
        Angora angora = new Angora("Milo", 3, "Blanco", 1.0, 1.8);
        AzulRuso azulRuso = new AzulRuso("Zoe", 2, "Gris", 0.9, 1.5);

        System.out.println("\n=== Información de Gatos ===");
        esfinge.mostrarInfo();
        angora.mostrarInfo();
        azulRuso.mostrarInfo();

        System.out.println();
        Gato.sonido(); // método estático
    }
}
