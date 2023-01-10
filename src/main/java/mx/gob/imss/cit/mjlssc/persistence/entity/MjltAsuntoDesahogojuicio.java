package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "MJLT_ASUNTO_DESAHOGOJUICIO")
public class MjltAsuntoDesahogojuicio implements Serializable {
    private static final long serialVersionUID = 7755708951955404038L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVE_ASUNTO_DESAHOGOJUICIO", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_ASUNTO", nullable = false)
    private MjltAsunto cveAsunto;

    @Column(name = "IND_DIFERIMIENTO")
    private Boolean indDiferimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_MOTIVO_DIFERIMIENTO", referencedColumnName = "CVE_MOTIVO_DIFERIMIENTO")
    private SsccMotivoDiferimiento cveMotivoDiferimiento;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FEC_AUDIENCIA")
    private Date fecAudiencia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_DOCUMENTO_DIGITALIZADO")
    private MjltDocumentoDigitalizado cveDocumentoDigitalizado;

    @Lob
    @Column(name = "REF_OBSERVACION")
    private String refObservacion;

    @Column(name = "FEC_ALTA")
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

    public MjltAsunto getCveAsunto() {
        return cveAsunto;
    }

    public void setCveAsunto(MjltAsunto cveAsunto) {
        this.cveAsunto = cveAsunto;
    }

    public Boolean getIndDiferimiento() {
        return indDiferimiento;
    }

    public void setIndDiferimiento(Boolean indDiferimiento) {
        this.indDiferimiento = indDiferimiento;
    }

    public SsccMotivoDiferimiento getCveMotivoDiferimiento() {
        return cveMotivoDiferimiento;
    }

    public void setCveMotivoDiferimiento(SsccMotivoDiferimiento cveMotivoDiferimiento) {
        this.cveMotivoDiferimiento = cveMotivoDiferimiento;
    }

    public Date getFecAudiencia() {
        return fecAudiencia;
    }

    public void setFecAudiencia(Date fecAudiencia) {
        this.fecAudiencia = fecAudiencia;
    }

    public MjltDocumentoDigitalizado getCveDocumentoDigitalizado() {
        return cveDocumentoDigitalizado;
    }

    public void setCveDocumentoDigitalizado(MjltDocumentoDigitalizado cveDocumentoDigitalizado) {
        this.cveDocumentoDigitalizado = cveDocumentoDigitalizado;
    }

    public String getRefObservacion() {
        return refObservacion;
    }

    public void setRefObservacion(String refObservacion) {
        this.refObservacion = refObservacion;
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