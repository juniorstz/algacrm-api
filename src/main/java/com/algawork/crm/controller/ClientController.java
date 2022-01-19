package com.algawork.crm.controller;

import com.algawork.crm.model.cliente;
import com.algawork.crm.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //É um controlador Rest, é uma classe aonde vamos receber nossos EndPoints Rest
@RequestMapping("/Clientes") //Essa anotação aonde vai mappear  os EndPoints quando receber requisões com /Clientes
public class ClientController {

    @Autowired //AutoWired vai injetar uma instânca de clienteRepository ali(Instanciar automáticamente) Uma implementação em tempo de execução.
    private ClienteRepository ClienteRepository;

    @GetMapping //Quando chegar um verbo HTTP Get na URI /Clintes é o método de baixo que vai responder a requição
    public List<cliente> listar(){
        return ClienteRepository.findAll();


    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public cliente adicionar(@RequestBody cliente cliente){
        return ClienteRepository.save(cliente);
    }

}
