package Love.WildLife.Controller;

import Love.WildLife.Model.Funcionarios;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerFuncionarios {

    @GetMapping("/funcionarios/Cadastro")
        public String cadastro(){
            return "Funcinario/Index";
        }






}
