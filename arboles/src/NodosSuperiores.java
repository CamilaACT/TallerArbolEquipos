import java.util.ArrayList;
import java.util.List;

public class NodosSuperiores {
    private List<nodoArbol> listaNodosHoja;
    public NodosSuperiores () {
        this.listaNodosHoja = new ArrayList<nodoArbol>();
    }
    public void addNodosSuperiores(nodoArbol ad){
        listaNodosHoja.add(ad);
    }
}
