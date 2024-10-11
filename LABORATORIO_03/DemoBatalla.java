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
}
