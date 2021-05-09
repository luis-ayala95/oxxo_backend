package mx.edu.itlapiedad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.models.Producto;

@Repository
public class ProductoJDBC implements ProductoDAO {
@Autowired
JdbcTemplate conexion;
String sql;
	@Override
	public List<Producto> consultar() {
		sql = "SELECT * FROM productos";
		return conexion.query(sql, new ProductoRM());
	}
	@Override
	public void insertarProducto(Producto pro) {
		// TODO Auto-generated method stub
	sql = "insert into productos (descripcion,precio,codigo_barras,existencia) values (?,?,?,?)";
	conexion.update(sql,pro.getDescripcion(),pro.getPrecio(), pro.getCodigo_barras(), pro.getExistencia());
	}
	
	
	
	
}
