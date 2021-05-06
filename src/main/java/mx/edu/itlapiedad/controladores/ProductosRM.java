package mx.edu.itlapiedad.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import mx.edu.itlapiedad.models.Productos;



public class ProductosRM  implements RowMapper<Productos>{
	@Override
	public Productos mapRow(ResultSet rs, int rowNum) throws SQLException {
		Productos pro= new Productos();
		pro.setId(rs.getInt("id"));
		pro.setDescripcion(rs.getString("descripcion"));
	    pro.setPrecio(rs.getFloat("precio"));
		pro.setCodigo_barras(rs.getString("codigo_barras"));
		pro.setExistencia(rs.getInt("existencia"));
		return pro;
	}
}
