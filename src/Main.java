import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1- Identificar variables
        int a, b, total;
        Scanner s = new Scanner(System.in);

        //2- Imprimir el mensaje "ingrese a"
        System.out.println("Ingrese a");

        //3- Leer y almacenar en variable a
        a = s .nextInt();

        //4- imprimir el mensaje "ingrese b"
        System.out.println("Ingrese b");

        //5- Leer y almacenar en variable b
        b = s .nextInt();

        //6- Total = a * b
        total= a * b;

        //7- Imprimir el mensaje "El resultado es  "
        // al  valor total
        System.out.println("El resultado es " + total);



    }
}