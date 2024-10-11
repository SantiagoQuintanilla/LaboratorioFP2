package Laboratorio4;
import java.util.*;
public class DemoBatalla {
    public static void main(String[] args){
        Nave [] misNaves=new Nave[5];
        Scanner sc=new Scanner(System.in);
        String nomb, col; 
        int fil, punt;
        boolean est;
        
        for (int i=0; i<misNaves.length;i++) {
            System.out.println("Nave "+(i+1));
            System.out.print("Nombre: ");
            nomb=sc.next();
            System.out.print("Fila: ");
            fil=sc.nextInt();
            System.out.print("Columna: "); 
            col=sc.next();
            System.out.print("Estado: ");
            est=sc.nextBoolean();
            System.out.print("Puntos: "); 
            punt=sc.nextInt();
            
            misNaves[i]=new Nave();
            
            misNaves[i].setNombre(nomb);
            misNaves[i].setFila(fil);
            misNaves[i].setColumna(col);
            misNaves[i].setEstado(est);
            misNaves[i].setPuntos(punt);
        }
        System.out.println("\nNaves creadas: ");
        mostrarNaves(misNaves);
        mostrarPorNombre(misNaves);
        mostrarPorPuntos(misNaves);
        System.out.println("\nNave con mayor número de puntos: \n-->"+mostrarMayorPuntos(misNaves));
        
        System.out.println("Ingrese el nombre a buscar: ");
        String nombre=sc.next();
      
        int pos=busquedaLinealNombre(misNaves,nombre);
        if (pos==-1) {
        	System.out.println("no encontrado");
        } else {
        	System.out.println(misNaves[pos]);
        }
        
        ordenarPorPuntosBurbuja(misNaves);
        mostrarNaves(misNaves);
        ordenarPorNombreBurbuja(misNaves);
        mostrarNaves(misNaves);
        pos=busquedaBinariaNombre(misNaves,nombre);
        
        ordenarPorPuntosSeleccion(misNaves);
        mostrarNaves(misNaves);
        ordenarPorNombreSeleccion(misNaves);
        mostrarNaves(misNaves);
        ordenarPorPuntosInsercion(misNaves);
        mostrarNaves(misNaves);
        ordenarPorNombreInsercion(misNaves);
        mostrarNaves(misNaves); 
        
        imprimir(metodoAleatorio(misNaves));
    }
    public static void mostrarNaves(Nave[] flota){
        System.out.println("Naves de la flota: "); 
        for (int i=0;i<flota.length;i++){
            System.out.println("-->"+flota[i]);
        }
    }
    public static void mostrarPorNombre(Nave[] flota){
        Scanner scan=new Scanner(System.in); 
        System.out.print("Nombre de la nave: ");
        String nomb=scan.next();
        Boolean verif=true;
        for (int i=0;i<flota.length;i++){
            if (nomb.equals(flota[i].getNombre())){
                System.out.println("-->"+flota[i]);
                verif=false;
            }
        }
        if (verif){
            System.out.println("No se encontro nave"); 
        }
    }
    public static void mostrarPorPuntos(Nave[] flota){
        Scanner scan=new Scanner(System.in); 
        System.out.print("Ingrese límite de puntos: ");
        int puntos=scan.nextInt();
        Boolean verif=true;
        for (int i=0;i<flota.length;i++){
            int comparacion=flota[i].getPuntos();
            if (comparacion<=puntos){
                System.out.println("-->"+flota[i]);
                verif=false;
            }
        }
        if (verif){
            System.out.println("No se encontro nave"); 
        }  
    }
    public static Nave mostrarMayorPuntos(Nave[] flota){
        int mayor=0, id=0;
        for (int i=0;i<flota.length;i++){
            int comparacion=flota[i].getPuntos();
            if (comparacion>mayor){
                mayor=comparacion;
                id=i;
            }
        }
        Nave naveMayor=flota[id];
        return naveMayor;
    }  
    public static Nave[] metodoAleatorio(Nave[] flota){
    	Random rand=new Random();
    	Nave [] Aleatorio=new Nave[flota.length];
    	ArrayList<Integer> indices=new ArrayList<Integer>();
    	for (int i=0;i<flota.length;i++) {
    		int indice=rand.nextInt(flota.length);
    		while (indices.contains(indice)) {
    			indice=rand.nextInt(flota.length);
    		}
    		indices.add(indice);
    		Aleatorio[i]=flota[indice];
    	} 
    	return Aleatorio;
    } 
    public static void imprimir(Nave[] flota) {
    	for (int i=0;i<flota.length;i++) {
    		System.out.println(flota[i]);
    	}
    }
    public static int busquedaLinealNombre(Nave[] flota, String s) {
    	for (int i=0;i<flota.length;i++) {
    		if (flota[i].equals(s)) {
    			return i;
    		}
    	}
    	return -1;

    }
    public static void ordenarPorPuntosBurbuja(Nave[] flota) {
    	boolean cambio;
    	for (int i=1;i<=flota.length;i++) {
    		cambio=false;
    		for (int j=0;j<=flota.length;j++){
    			if (flota[j].getPuntos()>flota[j+1].getPuntos()) {
    				int temp;
    				temp=flota[i].getPuntos();
    				flota[i].setPuntos(flota[j].getPuntos());
    				flota[j].setPuntos(temp);
    				cambio=true;
    			}
    		}
    		if (cambio=false) {
    			break;
    		}
    	}
    }
    public static void ordenarPorNombreBurbuja(Nave[] flota) {
    	for (int i=1;i<flota.length;i++) {
    		for (int j=0;j<flota.length;j++){
    			if ((flota[j].getNombre()).compareTo(flota[j+1].getNombre())>0) {
    				String temp;
    				temp=flota[i].getNombre();
    				flota[i].setNombre(flota[j].getNombre());
    				flota[j].setNombre(temp);
    			}
    		}
    	}
    }
    public static int busquedaBinariaNombre(Nave[] flota, String s) {
    	int alta, baja, media; 
    	baja=0;
    	alta=flota.length-1;
    	while(baja<=alta) {
    		media=(alta+baja)/2;
    		if (flota[media].getNombre().equals(s)) {
    			return media;
    		} else if (s.compareTo(flota[media].getNombre())<0){
    			alta=media-1;
    		} else { 
    			baja=media+1;
    		}
    	}
    	return -1;
    }
    public static void ordenarPorPuntosSeleccion(Nave[] flota) {
    	int n=0;
    	for (int i=0; i<flota.length-1;i++) {
    		int menor=i;
    		n++;
    		for (int j=n;j<flota.length;j++) {
    			if (flota[j].getPuntos()<flota[menor].getPuntos()) {
    				menor=j;
    			}
    		}
    		int temp=flota[menor].getPuntos();
    		flota[menor].setPuntos(flota[i].getPuntos());
    		flota[i].setPuntos(temp);
    	}
    }
    public static void ordenarPorNombreSeleccion(Nave[] flota) {
       	int n=0;
    	for (int i=0; i<flota.length-1;i++) {
    		int menor=i;
    		n++;
    		for (int j=n;j<flota.length;j++) {
    			if (flota[j].getNombre().compareTo(flota[menor].getNombre())<0) {
    				menor=j;
    			}
    		}
    		String temp=flota[menor].getNombre();
    		flota[menor].setNombre(flota[i].getNombre());
    		flota[i].setNombre(temp);
    	}
    }
    public static void ordenarPorPuntosInsercion(Nave[] flota) {
    	for (int i=1;i<flota.length;i++) {
    		int temp=flota[i].getPuntos();
    		int comparacion=i-1;
    		while (comparacion>=0&&flota[comparacion].getPuntos()>temp) {
    			flota[comparacion+1].setPuntos(flota[comparacion].getPuntos());
    			comparacion--;
    		}
    		flota[comparacion+1].setPuntos(temp);
    	}
    }
    public static void ordenarPorNombreInsercion(Nave[] flota) {
    	for (int i=1;i<flota.length;i++) {
    		String temp=flota[i].getNombre();
    		int comparacion=i-1;
    		while (comparacion>=0&&(flota[comparacion].getNombre().compareTo(temp)>0)) {
    			flota[comparacion+1].setNombre(flota[comparacion].getNombre());
    			comparacion--;
    		}
    		flota[comparacion+1].setNombre(temp);
    	}
    } 
}
