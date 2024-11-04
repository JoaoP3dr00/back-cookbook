package com.back.cookbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.back.cookbook.business.Receita;
import com.back.cookbook.dataac.impl.ReceitaDAOImpl;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/receita")
public class ReceitaController {
    @Autowired(required = true)
    public ReceitaDAOImpl receitaDAO;
    
    @GetMapping("/")
    @ResponseBody
    public String getReceitas(){
        return "oi";
    }

    @PostMapping("/adicionar")
    public void adicionar(@RequestParam String nome, @RequestParam String modo_prep, @RequestParam String ingredientes, @RequestParam String tempo, @RequestParam String qtd_pessoas, @RequestParam String custo){
        Receita receita = new Receita(nome, modo_prep, ingredientes, tempo, qtd_pessoas, custo);
        
        receitaDAO.addReceita(receita);
    }
}
