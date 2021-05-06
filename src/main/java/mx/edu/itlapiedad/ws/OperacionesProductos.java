package mx.edu.itlapiedad.ws;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.controladores.ProductosDAO;
import mx.edu.itlapiedad.models.Productos;


@RestController
@RequestMapping("/devops")
public class OperacionesProductos {
	@Autowired
	ProductosDAO repositorio;
	
	
	@PostMapping("/productos/")
	public void insertarSubscripcion(@RequestBody Productos pro) {
		repositorio.insertarProductos(pro);
	}
}
