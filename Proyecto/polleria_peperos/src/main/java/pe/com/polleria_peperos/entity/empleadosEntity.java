package pe.com.polleria_peperos.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder

@AllArgsConstructor

@NoArgsConstructor

@Data

@Entity(name = "empleadosEntity")

@Table(name = "empleados")

public class empleadosEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id

    @Column(name = "idemp")

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nomemp")
    private String nombre;
    @Column(name = "apematemp")
    private String apellido_materno;
    @Column(name = "apepatemp")
    private String apellido_paterno;
    @Column(name = "telemp")
    private int telefono;
    @Column(name = "direemp")
    private String direccion;
    @Column(name = "fechanacimiento_emp")
    private String fecha_de_nacimiento;
    @Column(name = "correoemp")
    private String correo;
    @Column(name = "estado_empleados")
    private boolean estado;

    @ManyToOne

    @JoinColumn(name = "idrol", nullable = false)
    private rolesEntity roles;
}
