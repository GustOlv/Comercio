package com.itb.inf2dm.comercio.controller;

 

import java.util.ArrayList;
import java.util.List;

 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

 

import com.itb.inf2dm.comercio.model.Produto;

 

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {

    List<Produto> listaDeProdutos = new ArrayList<Produto>();

    @GetMapping("/listar")
    public String listarProdutos(Model model) {

 

        Produto p1 = new Produto();
        p1.setId (20l);
        p1.setNome("Mouse");
        p1.setCodigoBarras("ADB2PWQZ19NM");
        p1.setPreco(299.99);
        p1.setDescricao(null);
        p1.setCod_Status(true);

        Produto p2 = new Produto();
        p2.setId(20l);
        p2.setNome("Teclado");
        p2.setCodigoBarras("MA8199NQCVPI");
        p2.setPreco(249.99);
        p2.setDescricao(null);
        p2.setCod_Status(true);


        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);

        model.addAttribute("listaDeProdutos", listaDeProdutos);

        return "produtos";
    }

    @GetMapping("/novo-prod")
    public String novoProduto() {
        return "novo-prod";
    }

}