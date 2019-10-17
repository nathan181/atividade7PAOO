package veiculospringbootAula03_exercise.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import veiculospringbootAula03_exercise.model.beans.Veiculo;
import veiculospringbootAula03_exercise.model.repository.VeiculosRepository;
import veiculospringbootAula03_exercise.model.utils.Calculadora;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository veiculosRep;
	
	@Autowired
	private Calculadora calculadora;
	
	public void salvar(Veiculo veiculo) {
		veiculosRep.save(veiculo);
	}
	
	public List <Veiculo> listarTodos(){
		List<Veiculo> veiculos = veiculosRep.findAll();
		for (Veiculo veiculo : veiculos) {
			veiculo.setTotal(calculadora.calculaConsumo(veiculo.getLitro(), veiculo.getKm()));
		}
		return veiculos;
	}
}
