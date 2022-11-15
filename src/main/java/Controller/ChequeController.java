package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ChequeController {

    @GetMapping("/teste")
    String Teste(){
        return "teste aqui";
    }







}
