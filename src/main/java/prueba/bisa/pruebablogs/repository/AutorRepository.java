package prueba.bisa.pruebablogs.repository;
import org.springframework.stereotype.Repository;
import prueba.bisa.pruebablogs.models.Autor;

import java.util.List;

@Repository
public class AutorRepository implements RepositoryImp<Autor> {

    private BaseDatosTemporal baseDatosTemporal;

    public AutorRepository(BaseDatosTemporal baseDatosTemporal) {
        this.baseDatosTemporal = baseDatosTemporal;
    }

    @Override
    public Autor guardar(Autor autor) {
        return baseDatosTemporal.crearAutor(autor);
    }

    @Override
    public List<Autor> lista() {
        return baseDatosTemporal.ListaAutor();
    }

    @Override
    public Autor porId(Integer id) {
        return baseDatosTemporal.porIdAutor(id);

    }

    @Override
    public Autor editar(Autor autor) {
        return null;
    }


}
