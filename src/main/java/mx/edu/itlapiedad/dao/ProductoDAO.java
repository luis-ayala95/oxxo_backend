package mx.edu.itlapiedad.dao;

import java.util.List;

import mx.edu.itlapiedad.models.Producto;

public interface ProductoDAO {

	

	public List<Producto> consultar();
	void insertarProducto(Producto pro);
	public Producto buscarProducto(int id_producto);
}
