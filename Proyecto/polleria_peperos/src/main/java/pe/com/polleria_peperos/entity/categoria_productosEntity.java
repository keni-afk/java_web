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

@Entity(name = "categoria_productosEntity")

@Table(name = "categoria_productos")

public class categoria_productosEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id

    @Column(name = "idcate_pro")

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "bebidas")
    private String bebidas;
    @Column(name = "pollos")
    private String pollos;
    @Column(name = "parrillas")
    private String parrillas;
    @Column(name = "complementos")
    private String complementos;
    @Column(name = "estado_catpro")
    private boolean estado;

}
