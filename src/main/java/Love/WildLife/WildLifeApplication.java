package Love.WildLife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import Love.WildLife.Model.Funcionarios.Funcionario;
import lombok.Data;

import org.springframework.stereotype.Controller;
@SpringBootApplication
public class WildLifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WildLifeApplication.class, args);
        Funcionario u = new cadastro();

		u.setNome("Evysson");
        u.setUsuario("evysson00");
        u.setPassword("8040");
        u.setNascimento("08061995");
        u.setTelefone("81975203420");
        u.setEmail("evysson@outlook.com");
        u.setCargo("programador");

		new WildLifeApplication().cadastro(u);


	}





}
