import java.util.*;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String soldado1, soldado2, soldado3, soldado4, soldado5;
        System.out.print("Ingrese el nombre del soldado 1: ");
        soldado1 = scan.next();
        System.out.print("Ingrese el nombre del soldado 2: ");
        soldado2 = scan.next();
        System.out.print("Ingrese el nombre del soldado 3: ");
        soldado3 = scan.next();
        System.out.print("Ingrese el nombre del soldado 4: ");
        soldado4 = scan.next();
        System.out.print("Ingrese el nombre del soldado 5: ");
        soldado5 = scan.next();
        System.out.println("===============================");
        System.out.println("\nDatos de los soldados:");
        System.out.println("Soldado 1: " + soldado1);
        System.out.println("Soldado 2: " + soldado2);
        System.out.println("Soldado 3: " + soldado3);
        System.out.println("Soldado 4: " + soldado4);
        System.out.println("Soldado 5: " + soldado5);
    }
}