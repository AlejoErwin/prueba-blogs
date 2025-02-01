package prueba.bisa.pruebablogs.services;

import org.springframework.stereotype.Service;
import prueba.bisa.pruebablogs.models.Autor;
import prueba.bisa.pruebablogs.models.request.NuevoAutorRequest;
import prueba.bisa.pruebablogs.repository.AutorRepository;
import prueba.bisa.pruebablogs.repository.RepositoryImp;

import java.util.List;

@Service
public class AutorService {

    private RepositoryImp<Autor> repository;

    public AutorService(RepositoryImp<Autor> repository) {
        this.repository = repository;
    }

    public Autor crearNuevoAutor(NuevoAutorRequest autor) {

        return repository.guardar(new Autor(autor.getNombre(),
                                            autor.getApellidoPaterno(),
                                            autor.getApellidoMaterna(),
                                            autor.getFechaNacimiento(),
                                            autor.getPaisResidencia(),
                                            autor.getCorreo()));
    }

    public List<Autor> listaAutor() {
        return repository.lista();
    }


    public Autor porIdAutor(Integer id) {
        return repository.porId(id);
    }
}
