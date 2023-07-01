import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Interfaz {
    private JComboBox comboBox1;
    private JButton ingresarEquiposButton;
    private NodosHoja listNodo;
    private NodosSuperiores listSuperior;

public Interfaz() {
    ingresarEquiposButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int control;
            control=Integer.parseInt(comboBox1.getSelectedItem().toString());
            for(int i=0;i<=control;i++){
                listNodo.addNodoHoja(new nodoArbol(i++));
            }
            for(int i=0;i<=control;i++){
                listSuperior.addNodosSuperiores(new nodoArbol());
            }


        }
    });
}
}
