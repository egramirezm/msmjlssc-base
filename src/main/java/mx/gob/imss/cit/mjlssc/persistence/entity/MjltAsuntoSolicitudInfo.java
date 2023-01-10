package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "MJLT_ASUNTO_SOLICITUD_INFO")
public class MjltAsuntoSolicitudInfo implements Serializable {
    private static final long serialVersionUID = 8722737712741778595L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVE_ASUNTO_SOLICITUD_INFO", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_ASUNTO", nullable = false)
    private MjltAsunto cveAsunto;

    @Size(max = 32)
    @Column(name = "NUM_OFICIO", length = 32)
    private String numOficio;

    @Temporal(TemporalType.DATE)
    @Column(name = "FEC_OFICIO_SOLICITUD")
    private Date fecOficioSolicitud;

    @Temporal(TemporalType.DATE)
    @Column(name = "FEC_SELLO_SOLICITUD")
    private Date fecSelloSolicitud;

    @Temporal(TemporalType.DATE)
    @Column(name = "FEC_SELLO_RECEPCION")
    private Date fecSelloRecepcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_DELEGACION", referencedColumnName = "CVE_DELEGACION")
    private SsccDelegacion cveDelegacion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_AREA_RESPONSABLE_INFO", nullable = false, referencedColumnName = "CVE_AREA_RESPONSABLE_INFO")
    private SsccAreaResponsableInfo cveAreaResponsableInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_DOCUMENTO_DIGITALIZADO")
    private MjltDocumentoDigitalizado cveDocumentoDigitalizado;

    @Column(name = "IND_SOLICITUD_ATENDIDA")
    private Boolean indSolicitudAtendida;

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

    public MjltAsunto getCveAsunto() {
        return cveAsunto;
    }

    public void setCveAsunto(MjltAsunto cveAsunto) {
        this.cveAsunto = cveAsunto;
    }

    public String getNumOficio() {
        return numOficio;
    }

    public void setNumOficio(String numOficio) {
        this.numOficio = numOficio;
    }

    public Date getFecOficioSolicitud() {
        return fecOficioSolicitud;
    }

    public void setFecOficioSolicitud(Date fecOficioSolicitud) {
        this.fecOficioSolicitud = fecOficioSolicitud;
    }

    public Date getFecSelloSolicitud() {
        return fecSelloSolicitud;
    }

    public void setFecSelloSolicitud(Date fecSelloSolicitud) {
        this.fecSelloSolicitud = fecSelloSolicitud;
    }

    public Date getFecSelloRecepcion() {
        return fecSelloRecepcion;
    }

    public void setFecSelloRecepcion(Date fecSelloRecepcion) {
        this.fecSelloRecepcion = fecSelloRecepcion;
    }

    public SsccDelegacion getCveDelegacion() {
        return cveDelegacion;
    }

    public void setCveDelegacion(SsccDelegacion cveDelegacion) {
        this.cveDelegacion = cveDelegacion;
    }

    public SsccAreaResponsableInfo getCveAreaResponsableInfo() {
        return cveAreaResponsableInfo;
    }

    public void setCveAreaResponsableInfo(SsccAreaResponsableInfo cveAreaResponsableInfo) {
        this.cveAreaResponsableInfo = cveAreaResponsableInfo;
    }

    public MjltDocumentoDigitalizado getCveDocumentoDigitalizado() {
        return cveDocumentoDigitalizado;
    }

    public void setCveDocumentoDigitalizado(MjltDocumentoDigitalizado cveDocumentoDigitalizado) {
        this.cveDocumentoDigitalizado = cveDocumentoDigitalizado;
    }

    public Boolean getIndSolicitudAtendida() {
        return indSolicitudAtendida;
    }

    public void setIndSolicitudAtendida(Boolean indSolicitudAtendida) {
        this.indSolicitudAtendida = indSolicitudAtendida;
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