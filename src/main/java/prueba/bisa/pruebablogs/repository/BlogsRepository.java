package prueba.bisa.pruebablogs.repository;

import org.springframework.stereotype.Repository;
import prueba.bisa.pruebablogs.models.Blog;

import java.util.List;

@Repository
public class BlogsRepository implements RepositoryImp<Blog> {

    private BaseDatosTemporal baseDatosTemporal;

    public BlogsRepository(BaseDatosTemporal baseDatosTemporal) {
        this.baseDatosTemporal = baseDatosTemporal;
    }

    @Override
    public Blog guardar(Blog blog) {
        return baseDatosTemporal.crearBlogs(blog);
    }

    @Override
    public List<Blog> lista() {
        return baseDatosTemporal.ListaBlogs();
    }

    @Override
    public Blog porId(Integer id) {
        return baseDatosTemporal.porIdBlog(id);
    }

    @Override
    public Blog editar(Blog blog) {
        return baseDatosTemporal.editarBlogs(blog);
    }


}
