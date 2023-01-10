package mx.gob.imss.cit.mjlssc.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "MJLT_ASUNTO_DESAHOGOAUD_PRUEBA")
public class MjltAsuntoDesahogoaudPrueba implements Serializable {
    private static final long serialVersionUID = -507966759902141388L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CVE_ASUNTO_DESAHOGOAUD_PRUEBA", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_ASUNTO_DESAHOGOAUD", nullable = false)
    private MjltAsuntoDesahogoaud cveAsuntoDesahogoaud;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CVE_TIPO_PRUEBA", nullable = false, referencedColumnName = "CVE_TIPO_PRUEBA")
    private SsccTipoPrueba cveTipoPrueba;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FEC_OFREC_PRUEBA")
    private Date fecOfrecPrueba;

    @Column(name = "IND_DESAHOGO")
    private Boolean indDesahogo;

    @Column(name = "IND_CAUSA_SIN_DES_EXTERNA")
    private Boolean indCausaSinDesExterna;

    @Column(name = "IND_CAUSA_SIN_DES_INTERNA")
    private Boolean indCausaSinDesInterna;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FEC_DESAHOGO")
    private Date fecDesahogo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_DOCUMENTO_DIGITALIZADO")
    private MjltDocumentoDigitalizado cveDocumentoDigitalizado;

    @Lob
    @Column(name = "REF_COMENTARIOS")
    private String refComentarios;

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

    public MjltAsuntoDesahogoaud getCveAsuntoDesahogoaud() {
        return cveAsuntoDesahogoaud;
    }

    public void setCveAsuntoDesahogoaud(MjltAsuntoDesahogoaud cveAsuntoDesahogoaud) {
        this.cveAsuntoDesahogoaud = cveAsuntoDesahogoaud;
    }

    public SsccTipoPrueba getCveTipoPrueba() {
        return cveTipoPrueba;
    }

    public void setCveTipoPrueba(SsccTipoPrueba cveTipoPrueba) {
        this.cveTipoPrueba = cveTipoPrueba;
    }

    public Date getFecOfrecPrueba() {
        return fecOfrecPrueba;
    }

    public void setFecOfrecPrueba(Date fecOfrecPrueba) {
        this.fecOfrecPrueba = fecOfrecPrueba;
    }

    public Boolean getIndDesahogo() {
        return indDesahogo;
    }

    public void setIndDesahogo(Boolean indDesahogo) {
        this.indDesahogo = indDesahogo;
    }

    public Boolean getIndCausaSinDesExterna() {
        return indCausaSinDesExterna;
    }

    public void setIndCausaSinDesExterna(Boolean indCausaSinDesExterna) {
        this.indCausaSinDesExterna = indCausaSinDesExterna;
    }

    public Boolean getIndCausaSinDesInterna() {
        return indCausaSinDesInterna;
    }

    public void setIndCausaSinDesInterna(Boolean indCausaSinDesInterna) {
        this.indCausaSinDesInterna = indCausaSinDesInterna;
    }

    public Date getFecDesahogo() {
        return fecDesahogo;
    }

    public void setFecDesahogo(Date fecDesahogo) {
        this.fecDesahogo = fecDesahogo;
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