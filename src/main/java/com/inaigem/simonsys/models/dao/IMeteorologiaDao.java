package com.inaigem.simonsys.models.dao;

import com.inaigem.simonsys.models.entity.Meteorologia;
import org.springframework.data.repository.CrudRepository;

public interface IMeteorologiaDao extends CrudRepository<Meteorologia, Long> {

}
