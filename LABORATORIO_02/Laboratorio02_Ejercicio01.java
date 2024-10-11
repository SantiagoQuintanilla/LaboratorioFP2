import java.util.*;
public class Laboratorio02_Ejercicio01 {
   public static void main(String[] args){
       String ahor1= " +---+  \n"+
                     " |   |  \n"+
                     "     |  \n"+
                     "     |  \n"+
                     "     |  \n"+
                     "     |  \n"+
                     "========  ";
       String ahor2= " +---+  \n"+
                     " |   |  \n"+
                     " 0   |  \n"+
                     "     |  \n"+
                     "     |  \n"+
                     "     |  \n"+
                     "========  ";
       String ahor3= " +---+  \n"+
                     " |   |  \n"+
                     " 0   |  \n"+
                     " |   |  \n"+
                     "     |  \n"+
                     "     |  \n"+
                     "========  ";
       String ahor4= " +---+  \n"+
                     " |   |  \n"+
                     " 0   |  \n"+
                     "/|   |  \n"+
                     "     |  \n"+
                     "     |  \n"+
                     "========  ";
       String ahor5= " +---+  \n"+
                     " |   |  \n"+
                     " 0   |  \n"+
                     "/|\\ |  \n"+
                     "     |  \n"+
                     "     |  \n"+
                     "========  ";
       String ahor6= " +---+  \n"+
                     " |   |  \n"+
                     " 0   |  \n"+
                     "/|\\ |  \n"+
                     "/    |  \n"+
                     "     |  \n"+
                     "========  ";
       String ahor7= " +---+  \n"+
                     " |   |  \n"+
                     " 0   |  \n"+
                     "/|\\ |  \n"+
                     "/ \\ |  \n"+
                     "     |  \n"+
                     "========  ";
       String [] figuras={ahor1, ahor2, ahor3, ahor4, ahor5, ahor6, ahor7};
       int contador=1;
       String letra;
       String [] palabras= {"programacion", "java", "indentacion", "clases",
                               "objetos", "desarrollador", "pruebas"};
       boolean verif=true;
       String palSecreta= getPalabraSecreta(palabras);
       ArrayList<Character> letrasAdivinadas=new ArrayList<Character>();
       System.out.println(figuras[0]);
       mostrarBlancos(palSecreta);
       System.out.println("\n");
       String [] l=new String[palSecreta.length()];
       while (contador <=6){
           letra=ingreseLetra();
           if (letraEnPalabraSecreta(letra, palSecreta)){
        	   letrasAdivinadas.add(letra.charAt(0));
        	   mostrarBlancosActualizados(letra,palSecreta, letrasAdivinadas, l);
        	   if (todasLetrasAdivinadas(letrasAdivinadas, palSecreta)) {
        		   System.out.println("Usted Gano! Le tomó "+contador+" turnos");
        		   verif=false;
        	   }
           } else {
        	   contador++;
        	   System.out.println(figuras[contador]);
           }
       }
       if (verif) {
           System.out.println("Usted Perdio! La palabra a adivinar era: "+palSecreta);
           System.out.println("\n");
       }
   }
   public static String getPalabraSecreta(String [] lasPalabras){
       String palSecreta;
       int indiceMayor=lasPalabras.length-1;
       int ind=(int)(Math.random()*(indiceMayor+1));
       return lasPalabras[ind];
   }
   public static void mostrarBlancos(String palabra){
       for (int i=0; i<palabra.length(); i++)
           System.out.print("_ ");
   }
   public static String ingreseLetra(){
       String laLetra;
       Scanner sc=new Scanner(System.in);
       System.out.println("Ingrese letra: ");
       laLetra=sc.next();
       while(laLetra.length()!=1||!(Character.isLetter(laLetra.charAt(0)))){
           System.out.println("Incorrecto! Ingrese letra nuevamente: ");
           laLetra=sc.next();
       }
       return laLetra;
   }
   public static boolean letraEnPalabraSecreta(String letra, String palSecreta){
   	Character letter=letra.charAt(0);
   	for (int i=0;i< palSecreta.length();i++) {
   		Character verif=palSecreta.charAt(i);
   		if (verif==letter) {
   			return true;
   		}
   	}
       return false;
   }
   public static void mostrarBlancosActualizados(String letra, String palabra, ArrayList<Character> array, String[] l){
       System.out.println("PROCESANDO.....");
       Character letr=letra.charAt(0);
       for (int i=0;i<palabra.length();i++) {
    	   if (array.contains(palabra.charAt(i))&&l[i]==null) {
    		   l[i]=Character.toString(letr);
    	   }
    	   if (l[i].charAt(0)==palabra.charAt(i)) {
    		   System.out.print(l[i]+" ");
    	   } else { 
    		   System.out.print("_ ");
    	   }
       }
   }
   public static boolean todasLetrasAdivinadas(ArrayList<Character> array, String palabra) {
	   for (int i=0;i<palabra.length();i++) {
		   if (!array.contains(palabra.charAt(i))) {
			   return false;
		   }
	   }
	   return true;
   }
}
