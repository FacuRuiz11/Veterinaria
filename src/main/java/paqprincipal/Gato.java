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
