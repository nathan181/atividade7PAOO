package veiculospringbootAula02_exercise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import veiculospringbootAula02_exercise.model.beans.Veiculo;
import veiculospringbootAula02_exercise.model.repository.VeiculosRepository;

@Controller
public class VeiculosController {
	
	@Autowired
	private VeiculosRepository veiculosRepository;
	@GetMapping ("/veiculos")
	public ModelAndView listarVeiculo () {
		ModelAndView mv = new ModelAndView("lista_veiculos");
		mv.addObject(new Veiculo());
		List<Veiculo> veiculos = veiculosRepository.findAll();
		mv.addObject("veiculos", veiculos);
		
		return mv;
		
	}
	@PostMapping("/veiculos")
	public String salvar (Veiculo veiculo) {
		veiculosRepository.save(veiculo);
		return "redirect:/veiculos";
	}
}
