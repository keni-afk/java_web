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
@Entity(name = "rolesEntity")
@Table(name = "roles")
public class rolesEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id

    @Column(name = "idrol")

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "produccion_rol")
    private String area1;
    @Column(name = "administracion_rol")
    private String area2;
    @Column(name = "atencion_rol")
    private String area3;
    @Column(name = "servicio_rol")
    private String area4;
    @Column(name = "estado_roles")
    private boolean estado;
}
