package com.ecodeup.api.apirest.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecodeup.api.apirest.model.Factura;


@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer> {

}
