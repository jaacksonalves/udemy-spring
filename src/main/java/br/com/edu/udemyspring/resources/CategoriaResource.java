package br.com.edu.udemyspring.resources;

import br.com.edu.udemyspring.domain.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {


    @GetMapping
    public List<Categoria> listar() {
        Categoria cat1 = new Categoria("Informática");
        Categoria cat2 = new Categoria("Móveis");

        List<Categoria> lista = new ArrayList<>();

        lista.add(cat1);
        lista.add(cat2);

        return lista;
    }
}
