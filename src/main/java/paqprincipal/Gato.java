package paqprincipal;

public class Gato extends Animal{
    public String color;

    public String getColor() {
        return color;
    }



    public void setColor(String color) {
        this.color = color;
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
