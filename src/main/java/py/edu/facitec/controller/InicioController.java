package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {
	
	//Responder a la raiz del proyecto
	@RequestMapping("/")
	public String index() {
		
		
		System.out.println("Cargando página de inicio");
		
		//El prefijo y sufijo se configuro dentro de 
		//appication.properties
		
		     //página
		return "inicio";
	}
	

}

