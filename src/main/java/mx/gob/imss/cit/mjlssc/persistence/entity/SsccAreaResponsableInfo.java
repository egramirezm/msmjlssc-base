package mx.gob.imss.cit.mjlssc.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import mx.gob.imss.cit.mjlssc.component.DataBaseShemaConf;

@Entity
@Table(name = "SSCC_AREA_RESPONSABLE_INFO", catalog = DataBaseShemaConf.SCHEMANML)
public class SsccAreaResponsableInfo implements Serializable {
	
	private static final long serialVersionUID = -4155054451395019691L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CVE_AREA_RESPONSABLE_INFO", nullable = false)
	private Integer id;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "CVE_DELEGACION", nullable = false)
	private SsccDelegacion cveDelegacion;

	@Size(max = 200)
	@NotNull
	@Column(name = "DES_NOM_AREA_RESPONSABLE_INFO", nullable = false, length = 200)
	private String desNomAreaResponsableInfo;

	@NotNull
	@Column(name = "FEC_ALTA", nullable = false)
	private Date fecAlta;

	@Column(name = "FEC_BAJA")
	private Date fecBaja;

	@Column(name = "FEC_MODIFICA")
	private Date fecModifica;

	@Size(max = 60)
	@NotNull
	@Column(name = "CVE_USUARIO_ALTA", nullable = false, length = 60)
	private String cveUsuarioAlta;

	@Size(max = 60)
	@Column(name = "CVE_USUARIO_BAJA", length = 60)
	private String cveUsuarioBaja;

	@Size(max = 60)
	@Column(name = "CVE_USUARIO_MODIFICA", length = 60)
	private String cveUsuarioModifica;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SsccDelegacion getCveDelegacion() {
		return cveDelegacion;
	}

	public void setCveDelegacion(SsccDelegacion cveDelegacion) {
		this.cveDelegacion = cveDelegacion;
	}

	public String getDesNomAreaResponsableInfo() {
		return desNomAreaResponsableInfo;
	}

	public void setDesNomAreaResponsableInfo(String desNomAreaResponsableInfo) {
		this.desNomAreaResponsableInfo = desNomAreaResponsableInfo;
	}

	public Date getFecAlta() {
		return fecAlta;
	}

	public void setFecAlta(Date fecAlta) {
		this.fecAlta = fecAlta;
	}

	public Date getFecBaja() {
		return fecBaja;
	}

	public void setFecBaja(Date fecBaja) {
		this.fecBaja = fecBaja;
	}

	public Date getFecModifica() {
		return fecModifica;
	}

	public void setFecModifica(Date fecModifica) {
		this.fecModifica = fecModifica;
	}

	public String getCveUsuarioAlta() {
		return cveUsuarioAlta;
	}

	public void setCveUsuarioAlta(String cveUsuarioAlta) {
		this.cveUsuarioAlta = cveUsuarioAlta;
	}

	public String getCveUsuarioBaja() {
		return cveUsuarioBaja;
	}

	public void setCveUsuarioBaja(String cveUsuarioBaja) {
		this.cveUsuarioBaja = cveUsuarioBaja;
	}

	public String getCveUsuarioModifica() {
		return cveUsuarioModifica;
	}

	public void setCveUsuarioModifica(String cveUsuarioModifica) {
		this.cveUsuarioModifica = cveUsuarioModifica;
	}

}