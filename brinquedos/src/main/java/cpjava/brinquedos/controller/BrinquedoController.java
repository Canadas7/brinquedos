package cpjava.brinquedos.controller;

import cpjava.brinquedos.model.Brinquedo;
import cpjava.brinquedos.repository.BrinquedoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    private final BrinquedoRepository repository;

    public BrinquedoController(BrinquedoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Brinquedo> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Brinquedo buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Brinquedo cadastrar(@RequestBody Brinquedo brinquedo) {
        return repository.save(brinquedo);
    }

    @PutMapping("/{id}")
    public Brinquedo atualizar(@PathVariable Long id,
                               @RequestBody Brinquedo brinquedo) {

        brinquedo.setId(id);

        return repository.save(brinquedo);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {

        repository.deleteById(id);

        return "Brinquedo removido com sucesso!";
    }
}