
package mx.edu.itlapiedad.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.dao.ProductoDAO;
import mx.edu.itlapiedad.models.Producto;



@RestController
@RequestMapping("/devops")
public class mensaje {
<<<<<<< HEAD
	@Autowired
	ProductoDAO repositorio;
=======

	
>>>>>>> f32cb91a378a8e9989e728796171eaffb4cb0db3
	@GetMapping("/Hola")
	public String mostrarHola(@RequestParam String nombre) {
		return "hola"+ nombre;
		
	}
<<<<<<< HEAD
	@GetMapping("consulta")
	public List<Producto>consultarProductos(){
		return repositorio.consultar();
	}
=======



>>>>>>> f32cb91a378a8e9989e728796171eaffb4cb0db3
}
