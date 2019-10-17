package veiculospringbootAula02_exercise.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import veiculospringbootAula02_exercise.model.beans.Veiculo;

public interface VeiculosRepository extends JpaRepository<Veiculo, Long>{

}
