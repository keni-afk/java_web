package pe.com.polleria_peperos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.polleria_peperos.entity.cartaproductoEntity;
import pe.com.polleria_peperos.repository.cartaproductoRepository;

@Service
public class cartaproductoServiceImpl implements cartaproductoService {

    @Autowired
    private cartaproductoRepository cartaproductorepositorio;

    @Override
    public List<cartaproductoEntity> findAll() {
        return cartaproductorepositorio.findAll();
    }

    @Override
    public Optional<cartaproductoEntity> findById(Long id) {
        return cartaproductorepositorio.findById(id);
    }

    @Override
    public cartaproductoEntity add(cartaproductoEntity c) {
        return cartaproductorepositorio.save(c);
    }

    @Override
    public cartaproductoEntity update(cartaproductoEntity c) {
        cartaproductoEntity objcurso = cartaproductorepositorio.getById(c.getCodigo());

        BeanUtils.copyProperties(c, objcurso);
        return cartaproductorepositorio.save(objcurso);
    }

    @Override
    public cartaproductoEntity delete(cartaproductoEntity c) {
        cartaproductoEntity objcurso = cartaproductorepositorio.getById(c.getCodigo());
        objcurso.setEstado(false);
        return cartaproductorepositorio.save(objcurso);
    }

    @Override
    public List<cartaproductoEntity> findAllCustom() {
        return cartaproductorepositorio.findAllCustom();
    }

}
