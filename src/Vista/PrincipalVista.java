package Vista;

import Utilitario.ManagerPath;

import javax.swing.*;
import java.awt.*;

public class PrincipalVista extends JFrame {
    // Barra de menú y menús
    private final String names;
    JLabel lblimagennike, lblimagenadidas, lblimagenquelind, lblimagenpuma, lblimagenmarcas, lblimagenreebok,lblimagenirun, lblilogoempresa2;
    JLabel lblbienvenida, lblmensaje1, lblmensaje6;
    JMenuBar menuBar;
    JMenu usuarioMenu, inventarioMenu, ventasMenu, reporteMenu, cerrarMenu;

    JMenuItem gestionUsuario;
    JMenuItem registrarProducto, gestionarInventario;
    JMenuItem registrarVenta, gestionarVentas;
    JMenuItem reporte;
    JMenuItem cerrarSesion;


    JPanel panelprincipal;

    public PrincipalVista(String names) {
        this.names = names;
        Iniciar();
    }
    public void Iniciar(){
        setTitle("Menu Calzados Emily´s");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1140, 840);
        setResizable(false);
        setLocationRelativeTo(null);

        // -------Crear la barra de menú-------------
        menuBar = new JMenuBar();
        menuBar.setBackground(new Color(15, 33, 47));

        // Menú Usuario
        usuarioMenu = new JMenu("    USUARIO    ");
        usuarioMenu.setForeground(Color.WHITE);
        usuarioMenu.setFont(new Font("Arial", Font.BOLD, 20));
        gestionUsuario = new JMenuItem("Gestionar Usuario");
        gestionUsuario.setFont(new Font("Arial", Font.BOLD, 17));

        usuarioMenu.add(gestionUsuario);

        // Menú Inventario
        inventarioMenu = new JMenu("    INVENTARIO    ");
        inventarioMenu.setForeground(Color.WHITE);
        inventarioMenu.setFont(new Font("Arial", Font.BOLD, 20));
        registrarProducto = new JMenuItem(" Registrar Producto  ");
        registrarProducto.setFont(new Font("Arial", Font.BOLD, 17));
        gestionarInventario = new JMenuItem(" Gestionar Inventario  ");
        gestionarInventario.setFont(new Font("Arial", Font.BOLD, 17));
        inventarioMenu.add(registrarProducto);
        inventarioMenu.add(gestionarInventario);

        // Menú Ventas
        ventasMenu = new JMenu("    VENTAS    ");
        ventasMenu.setForeground(Color.WHITE);
        ventasMenu.setFont(new Font("Arial", Font.BOLD, 20));
        registrarVenta = new JMenuItem(" Registrar Venta");
        registrarVenta.setFont(new Font("Arial", Font.BOLD, 17));
        gestionarVentas = new JMenuItem(" Gestionar Ventas");
        gestionarVentas.setFont(new Font("Arial", Font.BOLD, 17));

        ventasMenu.add(registrarVenta);
        ventasMenu.add(gestionarVentas);

        // Menú Reporte General
        reporteMenu = new JMenu("    REPORTE GENERAL    ");
        reporteMenu.setForeground(Color.WHITE);
        reporteMenu.setFont(new Font("Arial", Font.BOLD, 20));
        reporte = new JMenuItem(" Reportes");
        reporte.setFont(new Font("Arial", Font.BOLD, 17));
        reporteMenu.add(reporte);


        cerrarMenu = new JMenu("    CERRAR SESIÓN    ");
        cerrarMenu.setForeground(Color.WHITE);
        cerrarMenu.setFont(new Font("Arial", Font.BOLD, 20));
        cerrarSesion = new JMenuItem(" Cerrar   ");
        cerrarSesion.setFont(new Font("Arial", Font.BOLD, 17));
        cerrarMenu.add(cerrarSesion);

        // Agregar los menús a la barra de menú
        menuBar.add(usuarioMenu);
        menuBar.add(inventarioMenu);
        menuBar.add(ventasMenu);
        menuBar.add(reporteMenu);
        menuBar.add(cerrarMenu);
        setJMenuBar(menuBar);

        // Imágenes superiores
        lblimagennike = createImageLabel(ManagerPath.getRuta("nike.jpeg"), 190, 70, 0, 0);
        lblimagenadidas = createImageLabel(ManagerPath.getRuta("adidas.jpeg"), 190, 70, 190, 0);
        lblimagenquelind = createImageLabel(ManagerPath.getRuta("quelind.jpeg"), 190, 70, 380, 0);
        lblimagenpuma = createImageLabel(ManagerPath.getRuta("puma.jpeg"), 190, 70, 570, 0);
        lblimagenreebok = createImageLabel(ManagerPath.getRuta("reebok.jpeg"), 190, 70, 760, 0);
        lblimagenirun = createImageLabel(ManagerPath.getRuta("irun.jpeg"), 190, 70, 950, 0);

        add(lblimagennike);
        add(lblimagenadidas);
        add(lblimagenquelind);
        add(lblimagenpuma);
        add(lblimagenreebok);
        add(lblimagenirun);

        // Imágenes inferiores
        lblimagenmarcas = createImageLabel(ManagerPath.getRuta("marcas.jpeg"), 760, 190, 0, 580);
        JLabel lblimagenmarcas2 = createImageLabel(ManagerPath.getRuta("marcas2.jpeg"), 380, 190, 760, 580);

        add(lblimagenmarcas);
        add(lblimagenmarcas2);

        // Panel principal con imagen de fondo
        panelprincipal = new JPanel() {
            private final Image imagenFondo = new ImageIcon(ManagerPath.getRuta("nuevofondo5.jpeg")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panelprincipal.setBounds(0, 70, 1140, 540);
        panelprincipal.setLayout(null);
        add(panelprincipal);

        // Componentes del panel principal
        lblbienvenida = createLabel("BIENVENIDO \n "+ names, 120, 150, 900, 60, 45);
        lblmensaje1 = createLabel("Seleccione la opción que desea realizar", 390, 160, 580, 150, 20);
        lblmensaje6 = createLabel("Calzados Emily´s", 480, 470, 300, 30, 16);
        lblilogoempresa2 = createImageLabel(ManagerPath.getRuta("nuevologo.png"), 230, 230, 430, 260);

        panelprincipal.add(lblbienvenida);
        panelprincipal.add(lblmensaje1);
        panelprincipal.add(lblmensaje6);
        panelprincipal.add(lblilogoempresa2);
    }
    public JMenuItem getRegistrarProducto(){
        return registrarProducto;
    }
    public JMenuItem getGestionarInventario(){
        return gestionarInventario;
    }
    public JMenuItem getRegistrarVenta(){
        return registrarVenta;
    }
    public JMenuItem getGestionarVentas(){
        return gestionarVentas;
    }
    public JMenuItem getReporte(){
        return reporte;
    }
    public JMenuItem getCerrarSesion(){
        return cerrarSesion;
    }
    public JMenuItem getGestionUsuario(){
        return gestionUsuario;
    }
    public JPanel getPanelprincipal(){
        return panelprincipal;
    }
    private JLabel createImageLabel(String imagePath, int width, int height, int x, int y) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        JLabel label = new JLabel(new ImageIcon(image));
        label.setBounds(x, y, width, height);
        return label;
    }

    // Método auxiliar para crear JLabels de texto
    private JLabel createLabel(String text, int x, int y, int width, int height, int fontSize) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, width, height);
        label.setForeground(Color.LIGHT_GRAY);
        label.setFont(new Font("Times New Roman", Font.BOLD, fontSize));
        return label;
    }


}
