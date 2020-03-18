package py.edu.facitec.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import py.edu.facitec.model.Producto;
import py.edu.facitec.repository.ProductoRepository;
@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	//inicializar
	@Autowired
	private ProductoRepository productoRepository;
	

	@DeleteMapping("eliminar/{codigo}")
	public void eliminarproducto(@PathVariable Long codigo) {
		
		System.out.println("URL / producto /eliminar/3");
		
		productoRepository.deleteById(codigo);
	}
	
	@GetMapping
	public List<Producto> getProducto(){
		System.out.println("Listando Elemento Java a Json");
		
		return productoRepository.findAll();
		
	}
	
	    //suscritos/3
		@GetMapping(value = "/{codigo}")
		public Optional<Producto> getProducto(@PathVariable long codigo ){
			
			System.out.println("Recuprando un elemnto Java a Json ");
			
			Optional<Producto> retorno=productoRepository.findById(codigo);
			
			return retorno;		
	}
		
		@PostMapping()		 //Recibir Json que se convertira en Java
		public Producto guardar(@RequestBody Producto producto){
			
			System.out.println("Json a Jav");
		
		  Producto retorno=	productoRepository.save(producto);
		  
		  return retorno;
		}
		

}
