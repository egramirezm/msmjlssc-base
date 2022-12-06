package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.Data;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccEstado;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsccEstado} entity
 */
@Data
public class SsccEstadoDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2337303875416979672L;
	private final Integer id;
    @Size(max = 35)
    private final String refNomEstado;
    private final Boolean indEstatus;
    @NotNull
    private final Date fecAlta;
    private final Date fecBaja;
    private final Date fecModifica;
    @Size(max = 60)
    @NotNull
    private final String cveUsuarioAlta;
    @Size(max = 60)
    private final String cveUsuarioBaja;
    @Size(max = 60)
    private final String cveUsuarioModifica;
}