package paqprincipal;

public class Gato extends Animal{
    protected String color;
    protected static int contador;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Gato.contador = contador +1;
    }

    public Gato() {
        Gato.contador++;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }
}
