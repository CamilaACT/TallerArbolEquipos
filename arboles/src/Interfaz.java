import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Interfaz extends JFrame {
    private JComboBox comboBox1;
    private JButton ingresarEquiposButton;
    private JPanel mainPanel;


public Interfaz() {

    ingresarEquiposButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int control;
            control=Integer.parseInt(comboBox1.getSelectedItem().toString());
            //arbol arbolPrincipal = null;
            arbol.setResultadoFinal("--EQUIPOS INGRESAN--"+"\n");
            // Crear los árboles y combinarlos
            for (int i = 0; i < control; i++) {
                //VALIDAR VALIDAR
                String valorIngresado = JOptionPane.showInputDialog(null, "Ingrese el Nombre equipo: "+ (i + 1)+": " );
                // Validar si el usuario ingresó un valor o canceló el cuadro de diálogo
                if (valorIngresado != null) {
                    arbol.setResultadoFinal(valorIngresado+"\n");
                    //System.out.println("Valor ingresado: " + valorIngresado);
                    NodosHoja.getInstancia().addArbol(new arbol(valorIngresado,valorIngresado));
                    System.out.println("Tamaño de la lista: "+ NodosHoja.getInstancia().getListaNodosHoja().size());
                } else {
                    // El usuario canceló el cuadro de diálogo
                    System.out.println("No se ingresó ningún valor.");
                    JOptionPane.showMessageDialog(null, "No se ingreso ningun valor, repita el proceso e ingrese correctamente");
                    i=control;
                    //VALIDAR QUE SE BORRE LA LISTA DE NODOS HOJA
                }

            }
            Partido p1= new Partido("Partidos");
            p1.setVisible(true);
            dispose();
        }
    });
}
    public JPanel getMainPanel() {
        return mainPanel;
    }
}
