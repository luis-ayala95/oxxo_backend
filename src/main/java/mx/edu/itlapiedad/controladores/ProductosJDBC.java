
package mx.edu.itlapiedad.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.models.Productos;

@Repository
public class ProductosJDBC implements ProductosDAO{
	@Autowired
	JdbcTemplate conexion;
	
	String sql;
	@Override
	public void insertarProductos(Productos pro) {
		// TODO Auto-generated method stub
	sql = "insert into productos (descripcion,precio,codigo_barras,existencia) values (?,?,?,?)";
	conexion.update(sql,pro.getDescripcion(),pro.getPrecio(), pro.getCodigo_barras(), pro.getExistencia());
	}


	
}
