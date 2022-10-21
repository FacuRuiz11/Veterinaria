package paqprincipal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        /**
         Animal Perro1 = new Perro();

         System.out.println("Ingrese su nombre: ");
         Perro1.setNombre(teclado.nextLine());

         System.out.println(Perro1.nombre);

         Gato gato1 = new Gato();

         System.out.println("Ingrese su nombre: ");
         Perro1.setNombre(teclado.nextLine());
         System.out.println("Ingrese su color: ");
         gato1.setColor((teclado.nextLine()));
         System.out.println(gato1.color);
         **/
        ArrayList<Animal> animales = new ArrayList<>();

        int opcion = 0;
        do {
            System.out.printf("Seleccione animal o salir\n");
            System.out.printf("1.Perro 2.Gato 3.Salir: ");
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
            }
        }while(opcion != 3) ;

            System.out.printf(animales.toString());

        }
    }

