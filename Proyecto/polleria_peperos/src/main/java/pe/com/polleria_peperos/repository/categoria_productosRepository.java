
package pe.com.polleria_peperos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.polleria_peperos.entity.categoria_productosEntity;

public interface categoria_productosRepository extends JpaRepository<categoria_productosEntity, Long> {
        @Query("select c from categoria_productosEntity c where c.estado=1")
    List<categoria_productosEntity> findAllCustom();
}
