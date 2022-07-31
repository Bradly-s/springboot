package com.jack.springboot.service;

import com.jack.springboot.domain.Cargo;

import java.util.List;

public interface ICargoService {

    public boolean save(Cargo cargo);

    public boolean delete(Integer id);

    public boolean update(Cargo carGo);

    public List<Cargo> findAll();

    public Cargo findById(Integer id);

    void save1();
}
