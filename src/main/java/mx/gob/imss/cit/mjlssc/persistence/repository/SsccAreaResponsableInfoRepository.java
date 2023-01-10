package mx.gob.imss.cit.mjlssc.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.gob.imss.cit.mjlssc.persistence.entity.SsccAreaResponsableInfo;

@Repository
public interface SsccAreaResponsableInfoRepository extends JpaRepository<SsccAreaResponsableInfo, Integer> {

}