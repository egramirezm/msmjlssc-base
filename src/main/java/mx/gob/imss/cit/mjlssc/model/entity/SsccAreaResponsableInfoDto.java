package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccAreaResponsableInfo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsccAreaResponsableInfo} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SsccAreaResponsableInfoDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -89119956493000717L;
	private Integer id;
    @NotNull
    private SsccDelegacionDto cveDelegacion;
    @Size(max = 200)
    @NotNull
    private String desNomAreaResponsableInfo;
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