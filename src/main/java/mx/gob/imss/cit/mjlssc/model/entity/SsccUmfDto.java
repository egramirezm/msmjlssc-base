
package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.Data;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccUmf;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link SsccUmf} entity
 */
@Data
public class SsccUmfDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8474062930320167040L;
	private final Integer id;
    @Size(max = 200)
    private final String desUmf;
    @Size(max = 20)
    private final String refClues;
    @Size(max = 13)
    private final String refRegion;
    @Size(max = 15)
    private final String refClavePersonal;
    @Size(max = 11)
    private final String refUnidadDeInformacionPrei;
    @Size(max = 11)
    private final String refClaveUbicacionAdmin;
    @Size(max = 13)
    private final String refClavePresupuestal;
    @Size(max = 2)
    private final String refClaveDelegacionOUmae;
    @Size(max = 29)
    private final String refNombreDelegacionOUmae;
    @Size(max = 19)
    private final String refRelacionDelegacionUmae;
    @Size(max = 4)
    private final String refUnidadPresupuestal;
    @Size(max = 13)
    private final String refNivelDeAtencion;
    @Size(max = 2)
    private final String refTipoDeServicio;
    @Size(max = 8)
    private final String refDescripcionTipoServicio;
    @Size(max = 3)
    private final String refNumeroDeUnidad;
    @Size(max = 49)
    private final String refNombreUnidad;
    @Size(max = 26)
    private final String refUbicacionODenominacion;
    @Size(max = 25)
    private final String refTipoDeVialidad;
    @Size(max = 92)
    private final String refNombreDeVialidad;
    @Size(max = 12)
    private final String refNumeroExterior;
    @Size(max = 21)
    private final String refTipoDeAsentamiento;
    @Size(max = 47)
    private final String refNombreDelAsentamiento;
    @Size(max = 5)
    private final String refCodigoPostal;
    @Size(max = 3)
    private final String refClaveMunicipioDelegacion;
    @Size(max = 49)
    private final String refMunicipioDelegacion;
    @Size(max = 4)
    private final String refClaveLocalidad;
    @Size(max = 45)
    private final String refLocalidad;
    @Size(max = 2)
    private final String refClaveEntidadFederativa;
    @Size(max = 32)
    private final String refEntidadFederativa;
    @Size(max = 2)
    private final String refClaveJurisdiccionSanitar;
    @Size(max = 27)
    private final String refJurisdiccionSanitaria;
    @Size(max = 13)
    private final String refLatitud;
    @Size(max = 14)
    private final String refLongitud;
    @Size(max = 26)
    private final String refInicioDeProductividad;
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