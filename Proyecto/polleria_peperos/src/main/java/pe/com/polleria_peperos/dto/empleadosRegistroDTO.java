package pe.com.polleria_peperos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class empleadosRegistroDTO {
    private long codigo;
    private String nombre;
    private String apellido_materno;
    private String apellido_paterno;
    private int telefono;
    private String direccion;
    private String fecha_de_nacimiento;
    private String correo;
    private boolean estado;

}
