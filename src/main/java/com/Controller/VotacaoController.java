package com.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.model.Candidato;
import com.services.CandidatoService;

@Controller
public class VotacaoController {

    @Autowired
    private CandidatoService candidatoService;

    @GetMapping("/")
    public String index(Model model) {
        List<Candidato> candidatos = candidatoService.buscarTodosOsCandidatos();
        model.addAttribute("candidatos", candidatos);
        return "/";     }
}
