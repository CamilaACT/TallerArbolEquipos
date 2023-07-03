import java.util.ArrayList;
import java.util.List;

public class NodosHoja {
    private static NodosHoja instancia;
    private List<arbol> listaNodosHoja;
    public static NodosHoja getInstancia() {
        if (instancia == null) {
            instancia  =new NodosHoja();
        }
        return instancia;
    }
    private NodosHoja() {
        this.listaNodosHoja = new ArrayList<arbol>();
    }

    public void addArbol(arbol ad){
        listaNodosHoja.add(ad);
    }

    public List<arbol> getListaNodosHoja() {
        return listaNodosHoja;
    }
    public arbol busquedaEquipo(String nombre){
        for (arbol arbol1 : listaNodosHoja) {
            if(arbol1.getNombre().equals(nombre)){
                return arbol1;
            }
        }
        return null;
    }
    public boolean borrarLista(arbol ar){
        if (listaNodosHoja.contains(ar)) {
            listaNodosHoja.remove(listaNodosHoja.indexOf(ar));
            System.out.println("Objeto eliminado: " + ar);
            return true;
        } else {
            System.out.println("El objeto no está en la lista.");
            return false;
        }
    }
    public List<String> detalleNombre(int Estado){
        List<String> nombres=new ArrayList<String>();
        for (arbol arbol1 :listaNodosHoja ) {
            if(arbol1.getEstado()==Estado){
                nombres.add(arbol1.getNombre());
            }
        }
        return nombres;
    }


}
