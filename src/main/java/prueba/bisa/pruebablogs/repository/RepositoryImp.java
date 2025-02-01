package prueba.bisa.pruebablogs.repository;

import java.util.List;

public interface RepositoryImp<T> {

    T guardar(T t);

    List<T> lista();

    T porId(Integer id);

    T editar(T t);

}
