import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Miguel-David Orrico Teruel on 20/02/2018.
 */
public class VentanaPersona {
    private Persona persona;
    private JPanel panel=new JPanel();
    private JLabel etiquetaNombre=new JLabel("Nombre:");
    private JLabel etiquetaFechaNacimiento=new JLabel("Fecha de Nacimiento:");
    private JTextField nombre=new JTextField();
    private JTextField nacimiento=new JTextField();

    public VentanaPersona() {
        this.panel=new JPanel();
        this.panel.setLayout(new GridLayout(2,0));
        this.panel.setSize(300,100);
        this.panel.add(this.etiquetaNombre);
        this.panel.add(this.nombre);
        this.panel.add(this.etiquetaFechaNacimiento);
        this.panel.add(this.nacimiento);
        nombre.setText("");
        nacimiento.setText("");
        this.persona=null;
    }
    public void setPersona(Persona p){
        if(p!=null){
            this.nombre.setText(p.getNombre());
            this.nacimiento.setText(p.cadenaFecha());
        } else {
            this.nombre.setText("");
            this.nacimiento.setText("");
        }
    }

    public Persona getPersona() {
        return persona;
    }

    public JPanel getPanel() {
        return panel;
    }

    public static void main(String[] args) {
        JFrame ventana=new JFrame("Personas");
        ventana.setSize(300,300);
        ventana.setLayout(new GridLayout(2,0));
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VentanaPersona ventanaPersona=new VentanaPersona();
        ventana.add(ventanaPersona.getPanel());
        ventanaPersona.setPersona(new Persona("ana","21/02/2015"));

        ventana.pack();
        ventana.setVisible(true);
    }
}
