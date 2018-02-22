import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Miguel-David Orrico Teruel on 20/02/2018.
 */
public class VisorListaPersonas {
    private VentanaPersona ventana;
    private ListaPersonas listaPersonas;
    private ListIterator<Persona> iterador;
    private int posicion=0;

    private JButton siguiente=new JButton("Siguiente");
    private JButton anterior=new JButton("Anterior");

    public VisorListaPersonas(ListaPersonas listaPersonas) {
        this.listaPersonas = listaPersonas;
        this.iterador=listaPersonas.iteradorPersonas();
        this.ventana=new VentanaPersona();
    }

    public JPanel anyadeVisor(){
        JPanel panel=new JPanel();
        panel.add(this.ventana.getPanel());
        this.ventana.setPersona(this.listaPersonas.getPersona(posicion));
        panel.add(this.siguiente);
        panel.add(this.anterior);
        this.siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                avanza();
            }
        });
        this.anterior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retrocede();
            }
        });

        return panel;
    }

    private void retrocede() {
        this.ventana.setPersona(this.listaPersonas.getPersona(--posicion));
        if(posicion==0){
            this.anterior.setEnabled(false);
        } else {
            this.siguiente.setEnabled(true);
        }
    }

    private void avanza() {
        this.ventana.setPersona(this.listaPersonas.getPersona(++posicion));
        if(posicion==this.listaPersonas.size()-1){
            this.siguiente.setEnabled(false);
        } else {
            this.anterior.setEnabled(true);
        }

    }

    public static void main(String[] args) {
        JFrame ventana=new JFrame("Personas");
        ventana.setSize(300,300);
        ventana.setLayout(new GridLayout(0,1));
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ListaPersonas listaPersonas= new ListaPersonas();

                listaPersonas.addPersona(new Persona("Ana","21/02/2015"));
                listaPersonas.addPersona(new Persona("Bea","3/6/1990"));
                listaPersonas.addPersona(new Persona("Calra","8/9/2000"));
                listaPersonas.addPersona(new Persona("Delia","2/2/2004"));

        VisorListaPersonas visor=new VisorListaPersonas(listaPersonas);
        ventana.add(visor.anyadeVisor());
        ListaPersonas listaPersonas2= new ListaPersonas();

                listaPersonas2.addPersona(new Persona("aaAna","21/02/2015"));
                listaPersonas2.addPersona(new Persona("aaBea","3/6/1990"));
                listaPersonas2.addPersona(new Persona("aaCalra","8/9/2000"));
                listaPersonas2.addPersona(new Persona("aaDelia","2/2/2004"));

        VisorListaPersonas visor2=new VisorListaPersonas(listaPersonas2);
        ventana.add(visor2.anyadeVisor());
        ventana.pack();
        ventana.setVisible(true);
    }

}
