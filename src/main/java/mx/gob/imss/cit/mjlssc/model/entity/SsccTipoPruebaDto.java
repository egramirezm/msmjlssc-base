package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccTipoPrueba;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsccTipoPrueba} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SsccTipoPruebaDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2333753882568733760L;
	private Integer id;
    @Size(max = 60)
    private String desTipoPrueba;
    @NotNull
    private Date fecAlta;
    private Date fecBaja;
    private Date fecModifica;
    @Size(max = 60)
    @NotNull
    private String cveUsuarioAlta;
    @Size(max = 60)
    private String cveUsuarioBaja;
    @Size(max = 60)
    private String cveUsuarioModifica;
}