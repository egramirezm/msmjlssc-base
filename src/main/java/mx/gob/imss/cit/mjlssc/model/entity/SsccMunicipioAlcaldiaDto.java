package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.Data;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccMunicipioAlcaldia;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsccMunicipioAlcaldia} entity
 */
@Data
public class SsccMunicipioAlcaldiaDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3001598257688472213L;
	private final Integer id;
    @NotNull
    private final SsccEstadoDto cveEstado;
    @Size(max = 55)
    private final String refNomMunicipioAlcaldia;
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