package com.inaigem.simonsys.models.dao;

import com.inaigem.simonsys.models.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
    public Usuario findByUsername(String username);
}
