package screens;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

    private JMenuBar menuBar;
    private JMenu menuAlumnos;
    private JMenuItem menuInsertarAlumnos;


    public VentanaPrincipal(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 700);
        initComponents();
    }

    private void initComponents(){
        menuBar = new JMenuBar();

        menuAlumnos = new JMenu();
        menuAlumnos.setText("Alumnos");

        menuInsertarAlumnos = new JMenuItem();
        menuInsertarAlumnos.setText("Insertar...");
    }
}
