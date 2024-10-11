import java.util.*;
public class Laboratorio3_Ejercicio3 {
	 public static void main(String[] args) {
	        Random rand=new Random();
	        int n=rand.nextInt(5)+1;
	        int m=rand.nextInt(5)+1;
	        Soldado ejercito01[]=inicializar(n);
	        Soldado ejercito02[]=inicializar(m);
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
	 public static void imprimir(Soldado []arreglo) {
	        for (int k=0;k<arreglo.length;k++) {
	        	System.out.println(arreglo[k]);
	        }
	 }
	 public static Soldado[] inicializar(int x) {
		 Random rand=new Random();
		 Soldado ejercito[]=new Soldado[x];
		 for (int i=0;i<x;i++) {
			 ejercito[i]=new Soldado();
			 ejercito[i].setNombre("soldado"+i);
			 ejercito[i].setnivelVida(rand.nextInt(5)+1);
			 ejercito[i].setOrden(i+1);
	     }
		 return ejercito;	 
	 }
}
