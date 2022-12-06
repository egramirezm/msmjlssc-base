package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.Data;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccAccionReclamada;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * A DTO for the {@link SsccAccionReclamada} entity
 */
@Data
public class SsccAccionReclamadaDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3393495948850794366L;
	private final Integer id;
    @Size(max = 120)
    private final String desAccionReclamada;
    private final BigDecimal impEstimado;
    @NotNull
    private final Integer cveClasAccionReclamada;
    private final BigDecimal numFactorCalculo;
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