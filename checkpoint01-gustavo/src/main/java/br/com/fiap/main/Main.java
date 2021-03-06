package br.com.fiap.main;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Query;

import br.com.fiap.entity.*;

import br.com.fiap.service.*;
import br.com.fiap.dao.*;
import br.com.fiap.dao.impl.*;
import br.com.fiap.service.impl.LivroServiceImpl;

public class Main {

	public static void main(String[] args) {
		LivroServiceImpl livroService = LivroServiceImpl.getInstance();
		
		livroService.inserir(new Livro("Todos os Contos","Clarice Lispector","0-4456-7287-0", LocalDate.of(2015, 6, 1)));
		livroService.inserir(new Livro("Why persona is the best game","Muller","0-9075-4377-4", LocalDate.of(2008, 6, 10)));
		Livro livro3 = new Livro("Top 10 frases gura: A","Gustavo","0-9186-6872-7", LocalDate.of(2019, 7, 4));
		

		livroService.remover(1L);
		
		livro3.setDataPublicacao(LocalDate.of(2022, 3, 10));
		livroService.atualizar(livro3);
		
		List<Livro> livros = livroService.listar();
		for(Livro item : livros) {
			System.out.println(item);
		}
		 
		



		

		
	}
}
