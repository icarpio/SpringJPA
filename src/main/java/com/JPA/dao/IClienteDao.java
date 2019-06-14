package com.JPA.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.JPA.entity.Cliente;



public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{


}
