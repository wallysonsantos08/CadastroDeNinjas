package com.primeirospring.CadastroDeNinja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
//ela é um cracha, avisa pro spring que essa classe é a controladora
@RequestMapping
//O ResquestMapping é como se fosse o mapa da sua rua, o mapa do meu sistema
public class Controller {

    @GetMapping("/boasVindas") //ele vai mostrar pro usuario os caminhos de rota, ele nao faz nada, é como se uma porta tivesse uma plaquinha informando onde essa porta vai, se voce não coloca o getmapping, sua porta fica sem placa e sem caminho, agora todo o mapa ta perdido e seu site vai dar erro
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }
    
}
