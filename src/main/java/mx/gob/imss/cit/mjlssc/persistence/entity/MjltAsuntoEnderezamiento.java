package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "MJLT_ASUNTO_ENDEREZAMIENTO")
public class MjltAsuntoEnderezamiento implements Serializable {
    private static final long serialVersionUID = 866075114968849118L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVE_ASUNTO_ENDEREZAMIENTO", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_ASUNTO", nullable = false)
    private MjltAsunto cveAsunto;

    @Column(name = "IND_ENDEREZAMIENTO")
    private Boolean indEnderezamiento;

    @Column(name = "IND_AMPL_DEMANDA")
    private Boolean indAmplDemanda;

    @Column(name = "IND_CAUSA_SIN_DEM_EXTERNA")
    private Boolean indCausaSinDemExterna;

    @Column(name = "IND_CAUSA_SIN_DEM_INTERNA")
    private Boolean indCausaSinDemInterna;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FEC_AMPL_DEMANDA")
    private Date fecAmplDemanda;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_DOCUMENTO_DIGITALIZADO")
    private MjltDocumentoDigitalizado cveDocumentoDigitalizado;

    @Lob
    @Column(name = "REF_COMENTARIOS")
    private String refComentarios;

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

    public Boolean getIndEnderezamiento() {
        return indEnderezamiento;
    }

    public void setIndEnderezamiento(Boolean indEnderezamiento) {
        this.indEnderezamiento = indEnderezamiento;
    }

    public Boolean getIndAmplDemanda() {
        return indAmplDemanda;
    }

    public void setIndAmplDemanda(Boolean indAmplDemanda) {
        this.indAmplDemanda = indAmplDemanda;
    }

    public Boolean getIndCausaSinDemExterna() {
        return indCausaSinDemExterna;
    }

    public void setIndCausaSinDemExterna(Boolean indCausaSinDemExterna) {
        this.indCausaSinDemExterna = indCausaSinDemExterna;
    }

    public Boolean getIndCausaSinDemInterna() {
        return indCausaSinDemInterna;
    }

    public void setIndCausaSinDemInterna(Boolean indCausaSinDemInterna) {
        this.indCausaSinDemInterna = indCausaSinDemInterna;
    }

    public Date getFecAmplDemanda() {
        return fecAmplDemanda;
    }

    public void setFecAmplDemanda(Date fecAmplDemanda) {
        this.fecAmplDemanda = fecAmplDemanda;
    }

    public MjltDocumentoDigitalizado getCveDocumentoDigitalizado() {
        return cveDocumentoDigitalizado;
    }

    public void setCveDocumentoDigitalizado(MjltDocumentoDigitalizado cveDocumentoDigitalizado) {
        this.cveDocumentoDigitalizado = cveDocumentoDigitalizado;
    }

    public String getRefComentarios() {
        return refComentarios;
    }

    public void setRefComentarios(String refComentarios) {
        this.refComentarios = refComentarios;
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