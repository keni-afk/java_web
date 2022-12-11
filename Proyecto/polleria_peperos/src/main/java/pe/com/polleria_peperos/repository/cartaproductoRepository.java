
package pe.com.polleria_peperos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.polleria_peperos.entity.cartaproductoEntity;

public interface cartaproductoRepository extends JpaRepository<cartaproductoEntity, Long>{
        @Query("select c from cartaproductoEntity c where c.estado=1")
    List<cartaproductoEntity> findAllCustom();    
}
