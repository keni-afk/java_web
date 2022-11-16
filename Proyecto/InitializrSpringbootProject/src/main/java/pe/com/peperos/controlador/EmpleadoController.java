
package pe.com.peperos.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.com.peperos.dto.EmpleadoRegistroDTO;
import pe.com.peperos.servicio.EmpleadoService;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
     @Autowired
    private EmpleadoService empleadoservicio;

    @ModelAttribute("empleado")
    public EmpleadoRegistroDTO RegistroEmpleadoDTO() {
        return new EmpleadoRegistroDTO();
    }

    @GetMapping
    public String MostrarFormularioRegistro() {
        //es el nombre que tendra la pagina web
        return "registroempleado";
    }

    @PostMapping
    public String RegistroEmpleadoNuevo(
            @ModelAttribute("empleado") EmpleadoRegistroDTO e) {
        empleadoservicio.add(e);
        return "redirect:/empleado?correcto";
    }
}
