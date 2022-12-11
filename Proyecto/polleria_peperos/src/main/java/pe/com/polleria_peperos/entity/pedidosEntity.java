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
@Entity(name = "pedidosEntity")
@Table(name = "pedidos")

public class pedidosEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id

    @Column(name = "idped")

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "fechaped")
    private String nombre;
    @Column(name = "numped")
    private String apellido_materno;
    @Column(name = "descuped")
    private String apellido_paterno;
    @Column(name = "telcli")
    private int telefono;
    @Column(name = "direcli")
    private int direccion;
    @Column(name = "fechanac_cli ")
    private String fecha_de_nacimiento;
    @Column(name = "correocli")
    private String correo;
    @Column(name = "estado_pedidos")
    private boolean estado;

    @ManyToOne

    @JoinColumn(name = "idcliente", nullable = false)
    private clientesEntity clientes;

    @ManyToOne
    @JoinColumn(name = "idemp", nullable = false)
    private empleadosEntity empleados;
}
