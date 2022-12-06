package mx.gob.imss.cit.mjlssc.persistence.entity;

import lombok.Data;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccDelegacion;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsccDelegacion} entity
 */
@Data
public class SsccDelegacionDto implements Serializable {
    private final Integer id;
    @Size(max = 30)
    private final String desDelegacion;
    @Size(max = 3)
    private final String refAbreviacion;
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