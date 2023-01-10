package mx.gob.imss.cit.mjlssc.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.mjlssc.persistence.entity.MjltAsuntoDesahogoaud;

/**
 * A DTO for the {@link MjltAsuntoDesahogoaud} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MjltAsuntoDesahogoaudDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7043243066072009157L;
	private Integer id;
    @NotNull
    private MjltAsuntoDto cveAsunto;
    private Boolean indDiferimiento;
    private SsccMotivoDiferimientoDto cveMotivoDiferimiento;
    private Date fecAudiencia;
    private MjltDocumentoDigitalizadoDto cveDocumentoDigitalizado;
    private String refObservacion;
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