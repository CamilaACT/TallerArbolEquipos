public class nodoArbol {

    private int clave;
    private nodoArbol izq;
    private nodoArbol der;
    public nodoArbol(){
        clave =0;//clase equipo
        izq=null;
        der=null;
    }
    public nodoArbol(int dato){
        clave =dato;
        izq=null;
        der=null;
    }

    public nodoArbol(int dato, nodoArbol izq, nodoArbol der){
        clave =dato;
        this.izq=izq;
        this.der=der;
    }

    public int getClave() {
        return clave;
    }

    public nodoArbol getIzq() {
        return izq;
    }

    public nodoArbol getDer() {
        return der;
    }
}
