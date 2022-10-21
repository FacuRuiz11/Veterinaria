package paqprincipal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Animal> animales = new ArrayList<>();

        int opcion = 0;
        do {
            System.out.println("Seleccione animal a agregar");
            System.out.println("1.Perro 2.Gato 3.Salir: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion == 1) {
                Perro p = new Perro();
                System.out.println("Ingrese nombre: ");
                p.setNombre(teclado.nextLine());
                System.out.println("Ingrese peso");
                p.setPeso(Float.parseFloat(teclado.nextLine()));
                System.out.println("Ingrese raza");
                p.setRaza(teclado.nextLine());
                animales.add(p);
                System.out.printf("\n");
            }
            if (opcion == 2) {
                Gato p = new Gato();
                System.out.println("Ingrese nombre");
                p.setNombre(teclado.nextLine());
                System.out.println("Ingrese peso");
                p.setPeso(Float.parseFloat(teclado.nextLine()));
                System.out.println("Ingrese color");
                p.setColor(teclado.nextLine());
                animales.add(p);
                System.out.printf("\n");
            }
        }while(opcion != 3) ;

            System.out.printf(animales.toString()+"\n");
            System.out.printf("Cantidad de perros:" + Perro.contador + "\n");
            System.out.printf("Cantidad de gatos:" + Gato.contador);

        }
    }

