
package pe.com.polleria_peperos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.polleria_peperos.entity.pedidosEntity;


public interface pedidosRepository extends JpaRepository<pedidosEntity, Long> {
        @Query("select c from pedidosEntity c where c.estado=1")
    List<pedidosEntity> findAllCustom();
}
