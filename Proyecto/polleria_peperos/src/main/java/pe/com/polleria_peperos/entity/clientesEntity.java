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

@Entity(name = "clientesEntity")

@Table(name = "clientes")

public class clientesEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id

    @Column(name = "idcliente")

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nomcli")
    private String nombre;
    @Column(name = "apematcli")
    private String apellido_materno;
    @Column(name = "apepatcli")
    private String apellido_paterno;
    @Column(name = "telcli")
    private int telefono;
    @Column(name = "direcli")
    private String direccion;
    @Column(name = "fechanac_cli ")
    private String fecha_de_nacimiento;
    @Column(name = "correocli")
    private String correo;
    @Column(name = "estado_clientes")
    private boolean estado;

    @ManyToOne

    @JoinColumn(name = "codigo_distrito", nullable = false)
    private distritoEntity distrito;
}
