
package pe.com.polleria_peperos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.polleria_peperos.entity.detalle_pedidosEntity;


public interface detalle_pedidosRepository extends JpaRepository<detalle_pedidosEntity, Long> {
        @Query("select c from detalle_pedidosEntity c where c.estado=1")
    List<detalle_pedidosEntity> findAllCustom();
}
