import java.util.*;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random rand=new Random();
        String soldado1, soldado2, soldado3, soldado4, soldado5;
        int vida1, vida2, vida3, vida4, vida5;
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
        vida1=rand.nextInt(5)+1;
        vida2=rand.nextInt(5)+1;
        vida3=rand.nextInt(5)+1;
        vida4=rand.nextInt(5)+1;
        vida5=rand.nextInt(5)+1;
        System.out.println("===============================");
        System.out.println("\nDatos de los soldados:");
        System.out.println("Soldado 1: \nNombre: " + soldado1+"\tNivel de Vida: "+vida1);
        System.out.println("Soldado 2: \nNombre: " + soldado2+"\tNivel de Vida: "+vida2);
        System.out.println("Soldado 3: \nNombre: " + soldado3+"\tNivel de Vida: "+vida3);
        System.out.println("Soldado 4: \nNombre: " + soldado4+"\tNivel de Vida: "+vida4);
        System.out.println("Soldado 5: \nNombre: " + soldado5+"\tNivel de Vida: "+vida5);
    }
}
