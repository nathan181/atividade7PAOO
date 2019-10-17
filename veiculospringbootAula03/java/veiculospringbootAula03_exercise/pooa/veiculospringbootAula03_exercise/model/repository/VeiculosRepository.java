package veiculospringbootAula03_exercise.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import veiculospringbootAula03_exercise.model.beans.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{

}
