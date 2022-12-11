
package pe.com.polleria_peperos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.polleria_peperos.entity.categoria_productosEntity;
import pe.com.polleria_peperos.repository.categoria_productosRepository;

@Service
public class categoria_productosServiceImpl implements categoria_productosService{

    @Autowired
    private categoria_productosRepository categoria_productosrepositorio;
    
    
    @Override
    public List<categoria_productosEntity> findAll() {
        return categoria_productosrepositorio.findAll();
    }

    @Override
    public Optional<categoria_productosEntity> findById(Long id) {
        return categoria_productosrepositorio.findById(id);
    }

    @Override
    public categoria_productosEntity add(categoria_productosEntity c) {
        return categoria_productosrepositorio.save(c);
    }

    @Override
    public categoria_productosEntity update(categoria_productosEntity c) {
        categoria_productosEntity objcurso=categoria_productosrepositorio.getById(c.getCodigo());

        BeanUtils.copyProperties(c, objcurso);
        return categoria_productosrepositorio.save(objcurso);
    }

    @Override
    public categoria_productosEntity delete(categoria_productosEntity c) {
        categoria_productosEntity objcurso=categoria_productosrepositorio.getById(c.getCodigo());
        objcurso.setEstado(false);
        return categoria_productosrepositorio.save(objcurso);
    }


    @Override
    public List<categoria_productosEntity> findAllCustom() {
        return categoria_productosrepositorio.findAllCustom();
    }
    
}

