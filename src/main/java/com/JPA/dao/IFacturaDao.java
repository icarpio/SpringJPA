package com.JPA.dao;

import org.springframework.data.repository.CrudRepository;

import com.JPA.entity.Factura;


public interface IFacturaDao extends CrudRepository<Factura, Long>{

}