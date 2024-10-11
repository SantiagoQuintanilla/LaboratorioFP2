import java.util.*;
public class Ejercicio05 {
	 public static void main(String[] args) {
	        Random rand=new Random();
	        int n=rand.nextInt(5)+1;
	        int m=rand.nextInt(5)+1;
	        String ejercito01[]=inicializar(n);
	        String ejercito02[]=inicializar(m);
	        System.out.println("Datos del ejercito 1: ");
	       imprimir(ejercito01);
	        System.out.println("Datos del ejercito 2: ");
	       imprimir(ejercito02);
	       System.out.println("===============================");
	        System.out.println("El ejercito ganador fue: ");
	        if (n>m) {
	        	System.out.println("Ejercito 1!\nDatos del ejercito:");
	        	imprimir(ejercito01);
	        }
	        if (m>n) {
	        	System.out.println("Ejercito 2!\nDatos del ejercito:");
	        	imprimir(ejercito02);
	        }
	        if (m==n) {
	        	System.out.println("Hubo empate!\nDatos del ejercito 1: ");
	        	imprimir(ejercito01);
	        	System.out.println("Datos del ejercito 2: ");
	        	imprimir(ejercito02);
	        } 
	    }
	 public static void imprimir(String []arreglo) {
	        for (int k=0;k<arreglo.length;k++) {
	        	System.out.println("Soldado "+(k+1)+": \t-Nombre: "+arreglo[k]);
	        }
	 }
	 public static String[] inicializar(int x) {
		 String ejercito[]=new String[x];
		 for (int i=0;i<x;i++) {
			 ejercito[i]="soldado0"+(i+1);
	     }
		 return ejercito;	 
	 }
}
