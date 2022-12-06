package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.Data;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccCentroConciliacion;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsccCentroConciliacion} entity
 */
@Data
public class SsccCentroConciliacionDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5697374761605667670L;
	private final Integer id;
    @Size(max = 100)
    private final String desCentroConciliacion;
    private final Integer cveAlcance;
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
    private final Integer cveCentroConciliacionAnterior;
}