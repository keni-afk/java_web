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

@Entity(name = "detalle_pedidosEntity")

@Table(name = "detalle_pedidos")

public class detalle_pedidosEntity implements Serializable {

    //agregamos el id de serializacion
    private static final long serialVersionUID = 1L;

    @Id

    @Column(name = "iddepe")

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "cantdepe")
    private String cantidad_pedidos;
    @Column(name = "preciodepe")
    private String precio;
    @Column(name = "estado_de_pedidos")
    private boolean estado;

    @ManyToOne

    @JoinColumn(name = "idped", nullable = false)
    private pedidosEntity pedidos;

    @ManyToOne

    @JoinColumn(name = "idcarta", nullable = false)
    private cartaproductoEntity cartaproducto;
}
