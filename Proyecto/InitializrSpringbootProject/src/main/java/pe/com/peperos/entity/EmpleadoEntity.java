package pe.com.peperos.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "EmpleadoEntity")
@Table(name = "Empleado",
        uniqueConstraints
        = @UniqueConstraint(columnNames = "coremp"))
public class EmpleadoEntity  implements Serializable{

    @Id
    @Column(name = "codemp")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nomemp")
    private String nombre;
    @Column(name = "apepemp")
    private String apellidopaterno;
    @Column(name = "apememp")
    private String apellidomaterno;
    @Column(name = "dniemp")
    private String dni;
    @Column(name = "diremp")
    private String direccion;
    @Column(name = "telemp")
    private String telefono;
    @Column(name = "celemp")
    private String celular;
    @Column(name = "coremp")
    private String correo;
    @Column(name = "sexemp")
    private String sexo;
    @Column(name = "claemp")
    private String clave;
    @ManyToMany(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    @JoinTable(
            name = "empleado_rol",
            joinColumns = @JoinColumn(
                    name = "codemp",
                    referencedColumnName = "codemp"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "codrol",
                    referencedColumnName = "codrol"
            )
    )
    private Collection<RolEntity> rol;
    //private boolean estado;
}


