
package com.tienda.demo.repository;

/**
 *
 * @author ever1
 */
import com.tienda.demo.domain.Ruta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RutaRepository extends JpaRepository<Ruta, Integer> {
    List<Ruta> findAllByOrderByRequiereRolAsc();
}
