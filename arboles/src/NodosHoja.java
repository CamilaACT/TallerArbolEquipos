import java.util.ArrayList;
import java.util.List;

public class NodosHoja {
    private List<nodoArbol> listaNodosHoja;
    public NodosHoja() {
        this.listaNodosHoja = new ArrayList<nodoArbol>();
    }

    public void addNodoHoja(nodoArbol ad){
        listaNodosHoja.add(ad);
    }

}
