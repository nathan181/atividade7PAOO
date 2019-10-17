package veiculospringbootAula03_exercise.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import veiculospringbootAula03_exercise.model.utils.Calculadora;

@Configuration
public class AppConfig {
	
	@Bean
	public Calculadora getCalculadora() {
		return new Calculadora();
	}

}
