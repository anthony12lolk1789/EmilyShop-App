package Vista;

import Utilitario.BotonPersonalizado;
import Utilitario.ManagerPath;
import Utilitario.PanelDegradadoAzul;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class gestionUsuarioVista extends JFrame {
    // Barra de menú y menús

    JLabel lblbienvenida;
    JPanel panelusuario;
    
    JTable tablaUsuario;
    DefaultTableModel modeloUsuario;

    JLabel lblusuario, lblnombre, lbltelefono;
    JTextField txtusuario, txtnombre, txttelefono;
    
    JButton btneliminar, btnactualizar , btnCrearUsuario;
    
    public gestionUsuarioVista() {
        setTitle("Menu Calzados Emily´s");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1140, 840);
        setResizable(false);
        //-----------panel bienvenido----------
        panelusuario = new PanelDegradadoAzul();
        panelusuario.setBounds(0,70,1140,540);
        panelusuario.setLayout(null);
        add(panelusuario);
        
        //------------dentro de panel bienvenido----------
        lblbienvenida= new JLabel("GESTION DE USUARIO");
        lblbienvenida.setBounds(360,75,580,60);
        lblbienvenida.setForeground(Color.WHITE); // Color del texto
        lblbienvenida.setFont(new Font("Times New Roman", Font.BOLD, 35)); // Estilo de fuente
        panelusuario.add(lblbienvenida);

        modeloUsuario = new DefaultTableModel(new String[]{"Nombre", "Teléfono", "Usuario"}, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Solo lectura de los datos
            }
        };
        tablaUsuario = new JTable(modeloUsuario);

        
        tablaUsuario.setBackground( new Color(255, 182, 193)); // Fondo rosa claro
        tablaUsuario.setSelectionBackground(new Color(219, 112, 147)); // Fondo palo rosa para fila seleccionada
        tablaUsuario.setSelectionForeground(Color.WHITE); // Texto azul marino para fila seleccionada
        //Configuración del encabezado de la tabla
        tablaUsuario.getTableHeader().setBackground(new Color(25, 43, 57)); // Azul marino
        tablaUsuario.getTableHeader().setForeground(Color.WHITE); // Color de texto blanco
        tablaUsuario.getTableHeader().setFont(new Font("Arial", Font.BOLD, 15));
        tablaUsuario.getTableHeader().setReorderingAllowed(false);
        tablaUsuario.getTableHeader().setEnabled(false);
        JScrollPane scrollPane = new JScrollPane(tablaUsuario);
        scrollPane.setBounds(600, 140, 500, 340);
        panelusuario.add(scrollPane);


        btnactualizar = new BotonPersonalizado("Actualizar", ManagerPath.getRuta("actualizar.png"),null);
        btnactualizar.setBounds(70, 340, 200, 40);
        panelusuario.add(btnactualizar);
       
        btneliminar = new BotonPersonalizado("Eliminar",ManagerPath.getRuta("tachito.png"),null);
        btneliminar.setBounds(300,340,140,40);
        panelusuario.add(btneliminar);

        btnCrearUsuario = new BotonPersonalizado("Crear Usuario" , ManagerPath.getRuta("nuevousuario.png") , null);
        btnCrearUsuario.setBounds(200 , 400 , 200 , 40);
        panelusuario.add(btnCrearUsuario);
        
        lblnombre= new JLabel("Nombre y Apellido");
        lblnombre.setBounds(25,160,200,30);
        lblnombre.setForeground(Color.WHITE);
        lblnombre.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panelusuario.add(lblnombre);
        
        txtnombre= new JTextField();
        txtnombre.setBounds(220,160,250,30);
        panelusuario.add(txtnombre);
        
        lbltelefono= new JLabel("Telefono");
        lbltelefono.setBounds(25,200,200,30);
        lbltelefono.setForeground(Color.WHITE);
        lbltelefono.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panelusuario.add(lbltelefono);
        
        txttelefono= new JTextField();
        txttelefono.setBounds(220,200,250,30);
        panelusuario.add(txttelefono);

        lblusuario= new JLabel("Usuario");
        lblusuario.setBounds(25,240,200,30);
        lblusuario.setForeground(Color.WHITE);
        lblusuario.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panelusuario.add(lblusuario);
        
        txtusuario= new JTextField();
        txtusuario.setBounds(220,240,250,30);
        panelusuario.add(txtusuario);

        
    }
    public JPanel getPanelusuario(){
        return panelusuario;
    }
    public JButton getBtneliminar(){
        return btneliminar;
    }
    public JButton getBtnactualizar(){
        return btnactualizar;
    }
    public JTable getTablaUsuario(){
        return tablaUsuario;
    }
    public JTextField getTxtnombre(){
        return txtnombre;
    }
    public JTextField getTxttelefono(){
        return txttelefono;
    }
    public JTextField getTxtusuario(){
        return txtusuario;
    }
    public DefaultTableModel getModeloUsuario(){
        return modeloUsuario;
    }
    public JButton getBtnCrearUsuario(){return btnCrearUsuario;}

}



