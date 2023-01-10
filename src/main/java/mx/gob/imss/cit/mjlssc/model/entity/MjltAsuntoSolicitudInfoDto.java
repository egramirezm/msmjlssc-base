package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.mjlssc.persistence.entity.MjltAsuntoSolicitudInfo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link MjltAsuntoSolicitudInfo} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MjltAsuntoSolicitudInfoDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1755634137523546158L;
	private Integer id;
    @NotNull
    private MjltAsuntoDto cveAsunto;
    @Size(max = 32)
    private String numOficio;
    private Date fecOficioSolicitud;
    private Date fecSelloSolicitud;
    private Date fecSelloRecepcion;
    private SsccDelegacionDto cveDelegacion;
    @NotNull
    private SsccAreaResponsableInfoDto cveAreaResponsableInfo;
    private MjltDocumentoDigitalizadoDto cveDocumentoDigitalizado;
    private Boolean indSolicitudAtendida;
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