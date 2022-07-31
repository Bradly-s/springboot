package com.jack.springboot;

import com.jack.springboot.service.ICargoService;
import com.jack.springboot.service.impl.CargoServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {
    @Autowired
    private ICargoService cargoService;

    @Test
    public void testFindById(){
        System.out.println(cargoService.findById(4));
    }

    @Test
    public void testFindAll(){
        System.out.println(cargoService.findAll());
    }

}

