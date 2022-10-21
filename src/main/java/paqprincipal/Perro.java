package paqprincipal;

public class Perro extends Animal{
    protected String raza;
    protected static int contador;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Perro.contador = contador +1;
    }

    public Perro(){
        Perro.contador++;
    }
    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }
}


