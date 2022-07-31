package com.jack.springboot.service.impl;

import com.jack.springboot.dao.CargoDao;
import com.jack.springboot.domain.Cargo;
import com.jack.springboot.service.ICargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoServiceImpl implements ICargoService {

    @Autowired
    private CargoDao cargoDao;

    public void save1() {
        System.out.println("save----------");
    }

    public boolean save(Cargo cargo) {
        return cargoDao.save(cargo) > 0;
    }

    public boolean update(Cargo cargo){

        return cargoDao.update(cargo) > 0;
    }

    public boolean delete(Integer id) {

        return cargoDao.delete(id)  > 0;
    }

    public Cargo findById(Integer id) {
        return cargoDao.findById(id);
    }


    public List<Cargo> findAll() {
        return cargoDao.findAll();
    }
}