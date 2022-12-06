package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.Data;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccColoniaCp;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsccColoniaCp} entity
 */
@Data
public class SsccColoniaCpDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1282627518206002142L;
	private final Integer id;
    @NotNull
    private final SsccMunicipioAlcaldiaDto cveMunicipioAlcaldia;
    @Size(max = 70)
    private final String refNomColoniaCp;
    @Size(max = 5)
    private final String refCp;
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