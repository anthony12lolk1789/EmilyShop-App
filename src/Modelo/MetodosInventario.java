package Modelo;

import javax.swing.*;


public interface MetodosInventario {
    void CargarDatos();


    void ModificarProducto(String descripcion , String talla , String modelo , String Color , String Codigo ,String Precio ,String cantidad,  int idinventario , int i );

    void EliminarProducto(int id);

    void AgregarProducto( JTextField marca , JTextField codigo ,JComboBox<String> talla , JComboBox<String> color , JTextField PrecioCosto ,JTextField PrecioVenta , JSpinner Cantidad , JTextField descripcion);

}
