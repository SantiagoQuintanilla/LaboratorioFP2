public class Soldado {
    private String nombre;
    private int puntosVida;
    private int fila;
    private int columna;
    private boolean ocupado;
    private int numEjer;
    public Soldado(){
    }
    public void setNombre(String n){
        nombre=n;
    }
    public void setNivelVida(int v) {
        puntosVida=v;
    }
    public void setFila(int f) {
        fila=f;
    }
    public void setColumna (int c) {
        columna=c;
    }
    public void setOcupado (boolean o) {
        ocupado=o;
    }
    public void setNumEjercito (int e){
        numEjer=e;
    }
    public String getNombre(){
        return nombre;
    }
    public int getNivelVida() {
        return puntosVida;
    }
    public int getFila() {
        return fila;
    }
    public int getColumna() {
        return columna;
    }
    public boolean getOcupado() {
        return ocupado;
    }
    public int getNumEjercito(){
        return numEjer;
    }
    public String toString() {
        return "-Nombre: "+nombre+"\t-Posición: ("+fila+","+columna+")\t-Nivel de Vida: "+puntosVida;
    }
}
