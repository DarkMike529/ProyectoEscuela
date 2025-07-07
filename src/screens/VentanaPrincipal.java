package screens;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

    private JMenuBar menuBar;
    private JMenu menuAlumnos;
    private JMenuItem menuInsertarAlumnos;
    private JMenuItem menuVerAlumnos;
    private JMenuItem menuEliminarAlumnos;

    private JMenu menuBachilleratos;
    private JMenuItem menuVerBachilleratos;


    public VentanaPrincipal(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents(){
        menuBar = new JMenuBar();

        menuAlumnos = new JMenu();
        menuAlumnos.setText("Alumnos");

        menuInsertarAlumnos = new JMenuItem();
        menuInsertarAlumnos.setText("Insertar...");

        menuVerAlumnos = new JMenuItem("Ver todos lo alumnos...");

        menuEliminarAlumnos = new JMenuItem("Dar de baja al alumno...");

        //
        menuBachilleratos = new JMenu();
        menuBachilleratos.setText("Bachilleratos");
        //
        menuVerBachilleratos = new JMenuItem("Ver todos los bachilleratos...")

        //
        menuAlumnos.add(menuVerAlumnos);
        menuAlumnos.add(menuInsertarAlumnos);
        menuAlumnos.add(menuEliminarAlumnos);
        menuBar.add(menuAlumnos);
        //this.add(menuBar);
        this.setJMenuBar(menuBar);

        //
        menuBachilleratos.add(menuVerBachilleratos);
        menuBar.add(menuAlumnos);


        pack();
    }
}
