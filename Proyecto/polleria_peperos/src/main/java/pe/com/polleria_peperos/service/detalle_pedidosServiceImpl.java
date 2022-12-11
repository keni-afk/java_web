
package pe.com.polleria_peperos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.polleria_peperos.entity.detalle_pedidosEntity;
import pe.com.polleria_peperos.repository.detalle_pedidosRepository;

@Service
public class detalle_pedidosServiceImpl implements detalle_pedidosService{

    @Autowired
    private detalle_pedidosRepository detalle_pedidosrepositorio;
    
    
    @Override
    public List<detalle_pedidosEntity> findAll() {
        return detalle_pedidosrepositorio.findAll();
    }

    @Override
    public Optional<detalle_pedidosEntity> findById(Long id) {
        return detalle_pedidosrepositorio.findById(id);
    }

    @Override
    public detalle_pedidosEntity add(detalle_pedidosEntity c) {
        return detalle_pedidosrepositorio.save(c);
    }

    @Override
    public detalle_pedidosEntity update(detalle_pedidosEntity c) {
        detalle_pedidosEntity objcurso=detalle_pedidosrepositorio.getById(c.getCodigo());

        BeanUtils.copyProperties(c, objcurso);
        return detalle_pedidosrepositorio.save(objcurso);
    }

    @Override
    public detalle_pedidosEntity delete(detalle_pedidosEntity c) {
        detalle_pedidosEntity objcurso=detalle_pedidosrepositorio.getById(c.getCodigo());
        objcurso.setEstado(false);
        return detalle_pedidosrepositorio.save(objcurso);
    }


    @Override
    public List<detalle_pedidosEntity> findAllCustom() {
        return detalle_pedidosrepositorio.findAllCustom();
    }
    
}
