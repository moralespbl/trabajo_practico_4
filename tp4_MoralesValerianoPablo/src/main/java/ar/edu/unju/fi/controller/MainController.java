package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller	//este contenedor se dedica a recibr peticiones y a retornar una pagina
public class MainController {
	
	@GetMapping("/homePage") // renderizado de la pagina, no siempre coinciden con el nombre de la pagina, es lo que escribo en el navegador
	public String getIndexPage() {
		return "index"; //lo que retorna tiene q estar en la carpeta de template entre comilals"nombreHTML"
	}
	
}
