package mx.gob.imss.cit.mjlssc.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.mjlssc.persistence.entity.MjltAsuntoEnderezamiento;

/**
 * A DTO for the {@link MjltAsuntoEnderezamiento} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MjltAsuntoEnderezamientoDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5106295371078993102L;
	private Integer id;
    @NotNull
    private MjltAsuntoDto cveAsunto;
    private Boolean indEnderezamiento;
    private Boolean indAmplDemanda;
    private Boolean indCausaSinDemExterna;
    private Boolean indCausaSinDemInterna;
    private Date fecAmplDemanda;
    private MjltDocumentoDigitalizadoDto cveDocumentoDigitalizado;
    private String refComentarios;
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