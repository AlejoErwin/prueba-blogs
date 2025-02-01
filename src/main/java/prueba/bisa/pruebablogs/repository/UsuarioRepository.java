package prueba.bisa.pruebablogs.repository;
import org.springframework.stereotype.Repository;
import prueba.bisa.pruebablogs.models.Usuario;

import java.util.List;

@Repository
public class UsuarioRepository implements RepositoryImp<Usuario> {

    private BaseDatosTemporal baseDatosTemporal;

    public UsuarioRepository(BaseDatosTemporal baseDatosTemporal) {
        this.baseDatosTemporal = baseDatosTemporal;
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return baseDatosTemporal.crearUsuario(usuario);
    }

    @Override
    public List<Usuario> lista() {
        return null;
    }

    @Override
    public Usuario porId(Integer id) {
        return null;
    }

    @Override
    public Usuario editar(Usuario usuario) {
        return null;
    }
}
