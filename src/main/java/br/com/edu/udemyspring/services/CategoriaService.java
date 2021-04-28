package br.com.edu.udemyspring.services;

import br.com.edu.udemyspring.domain.Categoria;
import br.com.edu.udemyspring.repositories.CategoriaRepository;
import br.com.edu.udemyspring.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(
                () -> new ObjectNotFoundException("Categoria não encontrada! Id: " + id + ", Tipo: " + Categoria.class.getSimpleName())
        );
    }
}
