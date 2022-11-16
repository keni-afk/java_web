package pe.com.peperos.servicio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.peperos.dto.EmpleadoRegistroDTO;
import pe.com.peperos.entity.EmpleadoEntity;
import pe.com.peperos.entity.RolEntity;
import pe.com.peperos.repositorio.EmpleadoRepository;

@Service

public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadorepositorio;

    /*public EmpleadoServiceImpl(EmpleadoRepository empleadorepositorio) {
        this.empleadorepositorio = empleadorepositorio;
    }*/
    @Override
    public List<EmpleadoEntity> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<EmpleadoEntity> findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EmpleadoEntity add(EmpleadoRegistroDTO e) {
        EmpleadoEntity objempleado = new EmpleadoEntity();
        RolEntity objrol = new RolEntity();
        objempleado.setCodigo(e.getCodigo());
        objempleado.setNombre(e.getNombre());
        objempleado.setApellidopaterno(e.getApellidopaterno());
        objempleado.setApellidomaterno(e.getApellidomaterno());
        objempleado.setDni(e.getDni());
        objempleado.setDireccion(e.getDireccion());
        objempleado.setTelefono(e.getTelefono());
        objempleado.setCelular(e.getCelular());
        objempleado.setCorreo(e.getCorreo());
        objempleado.setSexo(e.getSexo());
        objempleado.setClave(e.getClave());

        objrol.setNombre("usuario");
        objempleado.setRol((Collection<RolEntity>) objrol);

        return empleadorepositorio.save(objempleado);
    }

    @Override
    public EmpleadoEntity update(EmpleadoEntity e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EmpleadoEntity delete(EmpleadoEntity e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<EmpleadoEntity> findAllCustom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
