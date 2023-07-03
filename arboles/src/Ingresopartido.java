import javax.swing.*;
import java.awt.event.*;
import java.util.List;

public class Ingresopartido extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JPanel paneGanar;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton equipo1Button;
    private JButton equipo2Button;
    private JLabel TXTfASE;
    private JLabel TXTPARTIDO;


    public Ingresopartido(int contadorPartidos,int contadorFase) {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        cargarComboBoxPARTIDOS(contadorFase);
        TXTfASE.setText(""+contadorFase);
        TXTPARTIDO.setText(""+contadorPartidos);
        arbol.setResultadoFinal("Partido"+contadorPartidos+"\n");
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        equipo1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //arbol A=new arbol( "Partido"+contadorPartidos);
                //System.out.println("Con que contador de fase se guarda"+contadorFase);
                arbol A=new arbol("Equipo: "+comboBox1.getSelectedItem().toString()+" Gano Partido: "+contadorPartidos,contadorFase);
                arbol.setResultadoFinal("Equipo Ganador: "+comboBox1.getSelectedItem().toString()+"\n");
                A.juntar(comboBox1.getSelectedItem().toString(),NodosHoja.getInstancia().busquedaEquipo(comboBox1.getSelectedItem().toString()),NodosHoja.getInstancia().busquedaEquipo(comboBox2.getSelectedItem().toString()));
                NodosHoja.getInstancia().addArbol(A);
                NodosHoja.getInstancia().borrarLista(NodosHoja.getInstancia().busquedaEquipo(comboBox1.getSelectedItem().toString()));
                NodosHoja.getInstancia().borrarLista(NodosHoja.getInstancia().busquedaEquipo(comboBox2.getSelectedItem().toString()));
                System.out.println("Tamaño del arreglo "+ NodosHoja.getInstancia().getListaNodosHoja().size());
                dispose();
                //cargarComboBoxPARTIDOS();
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    /*public static void main(String[] args) {
        Ingresopartido dialog = new Ingresopartido(NH);
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }*/
    private void cargarComboBoxPARTIDOS(int contadorFase) {
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        DefaultComboBoxModel<String> comboBoxModel2 = new DefaultComboBoxModel<>();
        comboBox1.setModel(comboBoxModel);
        comboBox2.setModel(comboBoxModel2);
        List<String> nombres = NodosHoja.getInstancia().detalleNombre(contadorFase-1);//gestion
        String nombre = "";
        for (int i = 0; i < nombres.size(); i++) {
            nombre = nombres.get(i);
            comboBoxModel.addElement(nombre);
            comboBoxModel2.addElement(nombre);
        }
    }
}
