package com.Controller;

import com.model.Candidato;
import com.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CandidatoController {

    @Autowired
    private CandidatoRepository candidatoRepository;

    // Mapeia a requisição GET para mostrar o formulário de cadastro
    @GetMapping("/candidatos/cadastro")
    public String showCadastroForm(Model model) {
        return "candidatos/cadastro"; // Diretório relativo para a página cadastro.html
    }

    // Mapeia a requisição POST para cadastrar um novo candidato
    @PostMapping("/candidatos")
    public String cadastrarCandidato(@RequestParam String nome, @RequestParam(required = false) Boolean voto) {
        Candidato candidato = new Candidato(voto != null && voto, nome);
        candidatoRepository.save(candidato);
        return "redirect:/candidatos/cadastro"; // Redireciona de volta para o formulário após o cadastro
    }
}
