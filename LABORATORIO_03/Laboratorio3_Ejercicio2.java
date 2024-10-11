import java.util.*;
public class Laboratorio3_Ejercicio2 {
	 public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        Random rand=new Random();
	        Soldado soldados[]=new Soldado[5];
	        for (int i=0;i<5;i++) {
	        	soldados[i]=new Soldado();
	        	System.out.print("Ingrese el nombre del soldado "+(i+1)+" : ");
	        	String nombre=scan.next();
	        	
	        	soldados[i].setNombre(nombre);
	        	soldados[i].setnivelVida(rand.nextInt(5)+1);
	        	soldados[i].setOrden(i+1);
	        }
	        System.out.println("===============================");
	        System.out.println("Datos de los soldados:");
	        for (int k=0;k<5;k++) {
	        	System.out.println(soldados[k]);
	        }
	    }
}
