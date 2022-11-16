
package pe.com.peperos.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmpleadoRegistroDTO {
    private long codigo;
    private String nombre;
    private String apellidopaterno;
    private String apellidomaterno;
    private String dni;
    private String direccion;
    private String telefono;
    private String celular;
    private String correo;
    private String sexo;
    private String clave;
}
