public class arbol {

    private nodoArbol raiz;
    private String nombre;

    public arbol() {
        raiz = null;
        nombre = null;
    }
    public arbol(int dato) {
        raiz = new nodoArbol(dato, null, null);
    }

    public arbol(int dato, String nombre ) {
        raiz = new nodoArbol(dato, null, null);
        this.nombre = nombre;

    }
    static void preOrden (nodoArbol arbol){
        if (arbol!=null){
            System.out.println(arbol.getClave());
            preOrden(arbol.getIzq());
            preOrden(arbol.getDer());

        }

    }

    public void preOrden(){
        preOrden(raiz);
    }

    static void postOrden (nodoArbol arbol){
        if (arbol!=null){

            postOrden(arbol.getIzq());
            postOrden(arbol.getDer());
            System.out.println(arbol.getClave());
        }

    }

    public void postOrden(){
        postOrden(raiz);
    }


    static void ordenCentral (nodoArbol arbol){
        if (arbol!=null){

            ordenCentral(arbol.getIzq());
            System.out.println(arbol.getClave());
            ordenCentral(arbol.getDer());

        }

    }

    public void ordenCentral(){
        ordenCentral(raiz);
    }

    public boolean juntar (int dato, arbol a1, arbol a2){
        if(a1.raiz==a2.raiz && a1.raiz!=null) {
            System.out.println("no se puede mezclar los árboles");
            return false;
        }
        raiz =new nodoArbol(dato, a1.raiz,a2.raiz);
        return true;
    }

    public nodoArbol getRaiz() {
        return raiz;
    }
}
