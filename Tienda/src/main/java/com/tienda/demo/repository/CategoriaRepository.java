
package com.tienda.demo.repository;

/**
 *
 * @author ever1
 */
import com.tienda.demo.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer>{
    public List<Categoria> findByActivoTrue();

}
