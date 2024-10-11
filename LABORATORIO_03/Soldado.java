public class Soldado {
    private String nombre;
    private int nivelVida;
    private int orden;

    public void setNombre(String n){
        nombre=n;
    }
    public void setnivelVida(int v) {
    	nivelVida=v;
    }
    public void setOrden(int o) {
    	orden=o;
    }
    public String getNombre(){
        return nombre;
    }
    public int getnivelVida() {
    	return nivelVida;
    }
    public int getOrden() {
    	return orden;
    }
    public String toString() {
    	return "Soldado "+orden+": \n-Nombre: "+nombre+"\t-Nivel de Vida: "+nivelVida;
    }
}
