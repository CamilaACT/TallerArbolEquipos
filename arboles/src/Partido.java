import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Partido extends JFrame{
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton equipo1Button;
    private JPanel panelPartidos;
    private JButton EMPEZARFASEButton;
    private JPanel paneGanar;
    private JLabel txtTitulo;
    private JButton busquedaPreordenButton;
    private JButton historialDePartidosButton;
    private JTextArea textArea1;
    private JPanel panelMostrar;


    public Partido(String title) {
    super(title);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(panelPartidos);
    this.pack();
    panelMostrar.setVisible(false);


    EMPEZARFASEButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Tamaño del arreglo que me pasan: "+NodosHoja.getInstancia().getListaNodosHoja().size());
            int controlTama=NodosHoja.getInstancia().getListaNodosHoja().size();

            int contadorFases=0;
            int fases=0;
            while(controlTama!=1){
                //cargarComboBoxPARTIDOS();
                fases=controlTama/2;
                contadorFases++;
                txtTitulo.setText("PARTIDOS FASE "+contadorFases);
                int contadorPartidos=0;
                while(NodosHoja.getInstancia().getListaNodosHoja().size()>  fases){
                    contadorPartidos++;
                    arbol.setResultadoFinal("Fase torneo: "+contadorFases+"\n");
                    Ingresopartido ig=new Ingresopartido(contadorPartidos,contadorFases);
                    ig.setVisible(true);
                    System.out.println("Tamaño de la lista dentro del while"+NodosHoja.getInstancia().getListaNodosHoja().size());

                }
                controlTama=NodosHoja.getInstancia().getListaNodosHoja().size();
                System.out.println("Variable control trama: "+controlTama);
                JOptionPane.showMessageDialog(null, "Continua a la siguiente Fase");

            }
            JOptionPane.showMessageDialog(null, "Finalizo fases del torneo");
            panelMostrar.setVisible(true);


        }
    });
        busquedaPreordenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(NodosHoja.getInstancia().getListaNodosHoja().get(0).preOrden());

            }
        });
        historialDePartidosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(arbol.getResultadoFinal());
            }
        });
    }

    /*private void cargarComboBoxPARTIDOS(){
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBox1.setModel(comboBoxModel);
        List<String> nombres= NH.detalleNombre();//gestion
        String nombre="";
        for (int i=0;i<nombres.size();i++) {
            nombre=nombres.get(i);
            comboBoxModel.addElement(nombre);
        }

    }*/
}
