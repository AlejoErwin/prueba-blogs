package prueba.bisa.pruebablogs.services;

import org.springframework.stereotype.Service;
import prueba.bisa.pruebablogs.models.Usuario;
import prueba.bisa.pruebablogs.repository.RepositoryImp;

@Service
public class UsuarioService {


    private RepositoryImp<Usuario> repository;

    public UsuarioService(RepositoryImp<Usuario> repository) {
        this.repository = repository;
    }

    public Usuario crearNuevoAutor(Usuario usuario) {
        return repository.guardar(usuario);
    }
}
