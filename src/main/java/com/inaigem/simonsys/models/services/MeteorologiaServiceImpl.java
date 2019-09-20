package com.inaigem.simonsys.models.services;

import com.inaigem.simonsys.models.dao.IMeteorologiaDao;
import com.inaigem.simonsys.models.entity.Meteorologia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MeteorologiaServiceImpl implements IMeteorologiaService {

    @Autowired
    private IMeteorologiaDao meteorologiaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Meteorologia> findAll() {
        return (List<Meteorologia>) meteorologiaDao.findAll();
    }
}
