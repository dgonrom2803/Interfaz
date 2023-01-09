package Interfaz;

public class Consola implements Imprimible {
    String pagina;
    String color;

    public Consola(){pagina = Imprimible.pagina; color = Imprimible.color;}
    @Override
    public void Imprime() {
        System.out.println(pagina + ", " + color);

    }

    @Override
    public void Borrar() {
        System.out.println(Borrable.pagina + ", " + Borrable.color);

    }
}
