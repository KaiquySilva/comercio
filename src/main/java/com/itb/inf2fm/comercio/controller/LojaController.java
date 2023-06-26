package com.itb.inf2fm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2fm.comercio.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	List<Produto> ListaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		Produto p1 = new Produto();
		p1.setId(20l);
		p1.setNome ( "Maquina de lavar Brastemp 15 1");
		p1.setCodigoBarras("1455JIFJDUE212456");
		p1.setDescricao("Produto Linha Branca Com painel digital");
		p1.setPreco(3215.89);
		

		Produto p2 = new Produto();
		p2.setId(20l);
		p2.setNome("Televisor 70");
		p2.setCodigoBarras("TLERD46589BVRD");
		p2.setDescricao("Televisor Tela Plana let Samsung");
		p2.setPreco(6326.12);
		
		Produto p3 = new Produto();
		p3.setId(20l);
		p3.setNome("Smartphone ");
		p3.setCodigoBarras("SADCOK4590OMNB");
		p3.setDescricao("Smartphone motorola g60");
		p3.setPreco(1700.99);
		
		// Adicionando os produtos a lista
		
		 ListaDeProdutos.add(p1);
		 ListaDeProdutos.add(p2);
		 ListaDeProdutos.add(p3);
		 
		 model.addAttribute("listaDeProdutos", ListaDeProdutos);
		 
		
		
		
		
		
		
		return "produtos";
		

   }
}
