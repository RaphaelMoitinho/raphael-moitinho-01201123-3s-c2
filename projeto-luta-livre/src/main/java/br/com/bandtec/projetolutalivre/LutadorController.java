package br.com.bandtec.projetolutalivre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/lutadores")
public class LutadorController {

    @Autowired
    private LutadorRepository repository;

    @GetMapping
    public List<Lutador> getLutadores(){
        return repository.findAll();
    }

    @PostMapping
    @Transactional
    public ResponseEntity postLutadores(@RequestBody @Valid Lutador novoLutador){
        repository.save(novoLutador);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/contagem-vivos")
    public 

}
