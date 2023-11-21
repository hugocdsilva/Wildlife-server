package Love.WildLife.Model;

import lombok.Data;

@Data
public class Funcionarios {

    public class Funcionario {
        private String nome;
        private String usuario;
        private String password;
        private String nascimento;
        private String telefone;
        private String email;
        private String cargo;
    }
}