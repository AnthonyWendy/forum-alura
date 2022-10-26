package br.com.alura.forun.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forun.controller.dto.TopicoDto;
import br.com.alura.forun.modelo.Curso;
import br.com.alura.forun.modelo.Topico;
import br.com.alura.forun.repository.TopicoRepository;

@RestController
public class TopicosController {
    
    @Autowired
    private TopicoRepository topicoRepository;
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){
		List<Topico> topicos = topicoRepository.findAll();
		
		return TopicoDto.converter(topicos);
	}

}
