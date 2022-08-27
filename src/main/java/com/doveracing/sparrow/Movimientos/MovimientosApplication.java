package com.doveracing.sparrow.Movimientos;

import com.doveracing.sparrow.Movimientos.component.ComponentDependecy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovimientosApplication implements CommandLineRunner {

	private ComponentDependecy componentDependecy;

	public MovimientosApplication(@Qualifier("componentTwoImplements") ComponentDependecy componentDependecy){
		this.componentDependecy = componentDependecy;
	}

	public static void main(String[] args) {
		SpringApplication.run(MovimientosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependecy.saludar();
	}
}
