package br.com.bandtec.projetolutalivre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Lutadores")
public class LutadorController {

    @Autowired
    private LutadorRepository repository;

    @GetMapping
    public List<Lutador> getLutadores(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity postLutadores(@RequestBody Lutador novoLutador){
        repository.save(novoLutador);
        return ResponseEntity.status(201).build();
    }


}
