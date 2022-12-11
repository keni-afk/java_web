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

@Entity(name = "cartaproductoEntity")

@Table(name = "cartaproducto")
public class cartaproductoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "idcarta")

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nompro")
    private String nombre;
    @Column(name = "numpro")
    private int numero_producto;
    @Column(name = "precio")
    private int costo;
    @Column(name = "estado_cartaproducto")
    private boolean estado;

    @ManyToOne

    @JoinColumn(name = "idcate_pro", nullable = false)
    private categoria_productosEntity categoria_productos;
}
