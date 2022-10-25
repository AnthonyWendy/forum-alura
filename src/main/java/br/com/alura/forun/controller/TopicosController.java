package br.com.alura.forun.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forun.controller.dto.TopicoDto;
import br.com.alura.forun.modelo.Curso;
import br.com.alura.forun.modelo.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	@ResponseBody 	
	public List<TopicoDto> lista(){
		Topico topico = new Topico("Duvida", "Duvida sobre Sping", new Curso("Spring", "programação"));
		
		return TopicoDto.converter(Arrays.asList(topico));
	}

}
