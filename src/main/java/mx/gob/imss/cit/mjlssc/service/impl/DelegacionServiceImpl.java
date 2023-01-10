/**
 * 
 */
package mx.gob.imss.cit.mjlssc.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.gob.imss.cit.mjlssc.model.assembler.DelegacionMapper;
import mx.gob.imss.cit.mjlssc.model.entity.MjlcTipoFlujoExcepcionDto;
import mx.gob.imss.cit.mjlssc.model.entity.SsccDelegacionDto;
import mx.gob.imss.cit.mjlssc.model.entity.SsccTipoPruebaDto;
import mx.gob.imss.cit.mjlssc.model.projection.SsccDelegacionInfo;
import mx.gob.imss.cit.mjlssc.persistence.entity.MjlcTipoFlujoExcepcion;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccCentroConciliacion;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccDelegacion;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccTipoPrueba;
import mx.gob.imss.cit.mjlssc.persistence.entity.SsccUmf;
import mx.gob.imss.cit.mjlssc.persistence.repository.MjlcTipoFlujoExcepcionRepository;
import mx.gob.imss.cit.mjlssc.persistence.repository.SsccCentroConciliacionRepository;
import mx.gob.imss.cit.mjlssc.persistence.repository.SsccDelegacionRepository;
import mx.gob.imss.cit.mjlssc.persistence.repository.SsccTipoPruebaRepository;
import mx.gob.imss.cit.mjlssc.persistence.repository.SsccUmfRepository;
import mx.gob.imss.cit.mjlssc.service.DelegacionService;
import mx.gob.imss.cit.mjlssc.utils.ObjectMapperUtils;

/**
 * @author
 *
 */
@Log4j2
@Service
public class DelegacionServiceImpl implements DelegacionService {

	@Autowired
	private DelegacionMapper delegacionMapper;

	@Autowired
	private SsccDelegacionRepository ssccDelegacionRepository;

	@Autowired
	private MjlcTipoFlujoExcepcionRepository mjlcTipoFlujoExcepcionRepository;

	@Autowired
	private SsccCentroConciliacionRepository ssccCentroConciliacionRepository;

	@Autowired
	private SsccUmfRepository ssccUmfRepository;

	@Autowired
	private SsccTipoPruebaRepository tipoPruebaRepository;

	/*
	 * solo prueba revisar y definir uso de mappers y demas
	 */
	@Override
	public ResponseEntity<?> getDelegaciones() {
		log.info("Inicio DelegacionService getDelegaciones");
		List<SsccDelegacionDto> delegacionDtos = new ArrayList<>();
		List<MjlcTipoFlujoExcepcionDto> excpecionesDto = new ArrayList<>();
		List<SsccTipoPruebaDto> ssccTipoPruebaDto = new ArrayList<>();
		try {
			// ejemplo projection
			SsccDelegacionInfo delegacionProjection = ssccDelegacionRepository.findByRefAbreviacion("DFS",SsccDelegacionInfo.class);
			List<SsccDelegacion> delegaciones = ssccDelegacionRepository.findAll();
			// delegacionDtos =
			// ObjectMapperUtils.mapAll(delegaciones,SsccDelegacionDto.class);
			delegacionDtos = delegacionMapper.toLstDto(delegaciones);
			Optional<SsccCentroConciliacion> ssccCentroConciliacion = ssccCentroConciliacionRepository.findById(Integer.valueOf(1));
			Optional<SsccUmf> umf = ssccUmfRepository.findById(Integer.valueOf(1));
			List<MjlcTipoFlujoExcepcion> excpeciones = mjlcTipoFlujoExcepcionRepository.findAll();
			excpecionesDto = ObjectMapperUtils.mapAll(excpeciones, MjlcTipoFlujoExcepcionDto.class);
			List<SsccTipoPrueba> ssccTipoPrueba = tipoPruebaRepository.findAll();
			ssccTipoPruebaDto = ObjectMapperUtils.mapAll(ssccTipoPrueba, SsccTipoPruebaDto.class);
		} catch (Exception e) {
			log.error("Exception DelegacionService getDelegaciones", e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(ssccTipoPruebaDto, HttpStatus.OK);
	}

}
