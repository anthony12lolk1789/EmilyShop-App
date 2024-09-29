package Projecto_Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inventario extends JFrame implements ActionListener{
    JLabel lblinventario,lblcodigo,lbldatos,lblmodelo,lbltalla,lblmensaje;
    JTextField txtcodigo;
    JButton btnregistrar, btnreporte, btneliminar, btnvolver;
    ButtonGroup grupotallas;
    JComboBox cbmodelo;
    JPanel panelTallas;
    JTextArea area;
    JScrollPane jspbarra;


    public Inventario(){
        setTitle("INVENTARIO...");
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        lblinventario= new JLabel("INVENTARIO");
        lblinventario.setFont(new Font("Times New Roman",Font.BOLD,30));
        lblinventario.setBounds(200,20,300,35);
        add(lblinventario);

        lblmodelo=new JLabel("MODELO");
        lblmodelo.setBounds(30,60,100,30);
        add(lblmodelo);

        cbmodelo= new JComboBox();
        cbmodelo.setBounds(120,60,100,30);
        cbmodelo.addItem("Nike");
        cbmodelo.addItem("Adidas");
        cbmodelo.addItem("Quellin");
        cbmodelo.addItem("I-Run");
        add(cbmodelo);

        lblcodigo=new JLabel("CODIGO");
        lblcodigo.setBounds(30,100,100,30);
        add(lblcodigo);

        txtcodigo=new JTextField();
        txtcodigo.setBounds(120,100,100,30);
        add(txtcodigo);

        lbltalla=new JLabel("Talla");
        lbltalla.setBounds(30,140,100,30);
        add(lbltalla);

        panelTallas = new JPanel(new GridLayout(3, 3, 10, 10));
        panelTallas.setBounds(120, 140, 200, 100);
        add(panelTallas);

        String[] tallas = {"35", "36", "37", "38", "39", "40", "41", "42", "43"};
        ButtonGroup groupTallas = new ButtonGroup();

        for (String talla : tallas) {
            JToggleButton btnTalla = new JToggleButton(talla);
            groupTallas.add(btnTalla);
            panelTallas.add(btnTalla);
        }

        btnregistrar=new JButton("REGISTRAR");
        btnregistrar.setBounds(30,260,100,30);
        btnregistrar.addActionListener(this);
        add(btnregistrar);

        btnreporte= new JButton("REPORTE");
        btnreporte.setBounds(140,260,100,30);
        btnreporte.addActionListener(this);
        add(btnreporte);

        btneliminar= new JButton("ELIMINAR");
        btneliminar.setBounds(250,260,100,30);
        btneliminar.addActionListener(this);
        add(btneliminar);

        lblmensaje = new JLabel("");
        lblmensaje.setBounds(120, 290, 300, 20);
        lblmensaje.setForeground(Color.RED);
        add(lblmensaje);

        lbldatos = new JLabel("DATOS");
        lbldatos.setBounds(445,60,100,30);
        add(lbldatos);

        area= new JTextArea();
        area.setBounds(380,90,180,250);
        add(area);

        jspbarra=new JScrollPane();
        jspbarra.setViewportView(area);
        add(area);

        btnvolver= new JButton("VOLVER");
        btnvolver.setBounds(460,370,100,30);
        add(btnvolver);

    }


    public static void main(String[] args) {
        Inventario ventana= new Inventario();
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnregistrar) {

            lblmensaje.setText("REGISTRADO CORRECTAMENTE");
        }else if(e.getSource() == btnreporte){
            lblmensaje.setText("REPORTE MOSTRADO");
        }else if(e.getSource() == btneliminar){
            lblmensaje.setText("ELIMINADO CORRECTAMENTE");
        }

    }

}
