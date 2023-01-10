package mx.gob.imss.cit.mjlssc.model.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.mjlssc.persistence.entity.MjltAsuntoDesahogoaudPrueba;

/**
 * A DTO for the {@link MjltAsuntoDesahogoaudPrueba} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MjltAsuntoDesahogoaudPruebaDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -970877026797885399L;
	private Integer id;
    @NotNull
    private MjltAsuntoDesahogoaudDto cveAsuntoDesahogoaud;
    @NotNull
    private SsccTipoPruebaDto cveTipoPrueba;
    private Date fecOfrecPrueba;
    private Boolean indDesahogo;
    private Boolean indCausaSinDesExterna;
    private Boolean indCausaSinDesInterna;
    private Instant fecDesahogo;
    private MjltDocumentoDigitalizadoDto cveDocumentoDigitalizado;
    private String refComentarios;
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