
package pe.com.polleria_peperos.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.polleria_peperos.entity.pedidosEntity;
import pe.com.polleria_peperos.repository.pedidosRepository;

@Service
public class pedidosServiceImpl implements pedidosService{

    @Autowired
    private pedidosRepository pedidosrepositorio;
    
    
    @Override
    public List<pedidosEntity> findAll() {
        return pedidosrepositorio.findAll();
    }

    @Override
    public Optional<pedidosEntity> findById(Long id) {
        return pedidosrepositorio.findById(id);
    }

    @Override
    public pedidosEntity add(pedidosEntity c) {
        return pedidosrepositorio.save(c);
    }

    @Override
    public pedidosEntity update(pedidosEntity c) {
        pedidosEntity objcurso=pedidosrepositorio.getById(c.getCodigo());

        BeanUtils.copyProperties(c, objcurso);
        return pedidosrepositorio.save(objcurso);
    }

    @Override
    public pedidosEntity delete(pedidosEntity c) {
        pedidosEntity objcurso=pedidosrepositorio.getById(c.getCodigo());
        objcurso.setEstado(false);
        return pedidosrepositorio.save(objcurso);
    }


    @Override
    public List<pedidosEntity> findAllCustom() {
        return pedidosrepositorio.findAllCustom();
    }
    
}
