package prueba.bisa.pruebablogs.repository;

import org.springframework.stereotype.Repository;
import prueba.bisa.pruebablogs.models.Comentario;

import java.util.List;

@Repository
public class ComentarioRepository implements RepositoryImp<Comentario>{

    private BaseDatosTemporal baseDatosTemporal;

    public ComentarioRepository(BaseDatosTemporal baseDatosTemporal) {
        this.baseDatosTemporal = baseDatosTemporal;
    }


    @Override
    public Comentario guardar(Comentario comentario) {
        return baseDatosTemporal.crearComentario(comentario);
    }

    @Override
    public List<Comentario> lista() {
        return baseDatosTemporal.listaComentario();
    }

    @Override
    public Comentario porId(Integer id) {
        return null;
    }

    @Override
    public Comentario editar(Comentario comentario) {
        return null;
    }
}
