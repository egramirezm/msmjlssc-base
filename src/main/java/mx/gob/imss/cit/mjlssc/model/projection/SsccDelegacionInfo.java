package mx.gob.imss.cit.mjlssc.model.projection;

import java.util.Date;

public interface SsccDelegacionInfo {

    Integer getId();

    String getDesDelegacion();

    Date getFecAlta();

    Date getFecBaja();

    Date getFecModifica();

    String getCveUsuarioAlta();

    String getCveUsuarioBaja();

    String getCveUsuarioModifica();
}