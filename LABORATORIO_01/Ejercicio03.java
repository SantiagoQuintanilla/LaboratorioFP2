import java.util.*;
public class Ejercicio03 {
	 public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        String nombres[]=new String[5];
	        for (int i=0;i<5;i++) {
	        	System.out.print("Ingrese el nombre del soldado "+(i+1)+" :");
	        	String nombre=scan.next();
	        	nombres[i]=nombre;
	        }
	        System.out.println("===============================");
	        System.out.println("Datos de los soldados:");
	        for (int k=0;k<5;k++) {
	        	System.out.println("Soldado "+(k+1)+": "+nombres[k]);
	        }
	    }
}
