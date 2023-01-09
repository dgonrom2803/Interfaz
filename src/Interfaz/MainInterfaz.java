package Interfaz;

public class MainInterfaz {
    public static void main(String[] args) {
        Imprimible impresora1 = new Impresora();
        Imprimible consola1 = new Consola();
        Borrable impresora2 = new Impresora();
        Borrable consola2 = new Consola();
        impresora1.Imprime();
        consola1.Imprime();
        impresora2.Borrar();
        consola2.Borrar();
    }
}
