import java.util.*;
public class Ejercicio04 {
	 public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        Random rand=new Random();
	        String nombres[]=new String[5];
	        int vida[]=new int[5];
	        for (int i=0;i<5;i++) {
	        	System.out.print("Ingrese el nombre del soldado "+(i+1)+" : ");
	        	String nombre=scan.next();
	        	nombres[i]=nombre;
	        	vida[i]=rand.nextInt(5)+1;
	        }
	        System.out.println("===============================");
	        System.out.println("Datos de los soldados:");
	        for (int k=0;k<5;k++) {
	        	System.out.println("Soldado "+(k+1)+": \n-Nombre: "+nombres[k]+"\t-Nivel de VIda: "+vida[k]);
	        }
	    }
}
