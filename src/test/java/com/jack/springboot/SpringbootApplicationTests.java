package com.jack.springboot;

import com.jack.springboot.dao.CargoDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    private CargoDao cargoDao;

    @Test
    public void testFindById(){
        System.out.println(cargoDao.selectById(4));
    }

    @Test
    public void testFindAll(){
        System.out.println(cargoDao.selectList(null));
    }


//--------springboot+junit+mybatis

//    @Autowired
//    private ICargoService cargoService;
//
//    @Test
//    public void testFindById(){
//        System.out.println(cargoService.findById(4));
//    }
//
//    @Test
//    public void testFindAll(){
//        System.out.println(cargoService.findAll());
//    }

}

