package com.jack.springboot.controller;

import com.jack.springboot.dao.CargoDao;
import com.jack.springboot.domain.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cargos")
public class CargoController {

    @Autowired
    private CargoDao cargoDao;

//---------------------------------------------------------------------------------------------------------------------------------------

    @PostMapping //使用@PostMapping简化Post请求方法对应的映射配置
    public Result saveRestful(@RequestBody Cargo cargo){
        System.out.println("carGos save...");
        int flag = cargoDao.insert(cargo);
        System.out.println("flag: " + flag);
        return new Result(flag > 0 ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }


    @DeleteMapping("/{id}")  //使用@DeleteMapping简化DELETE请求方法对应的映射配置
    public Result delete(@PathVariable String id){
        System.out.println("carGos delete..." + id);
        int flag = cargoDao.deleteById(Long.valueOf(id));
        return new Result(flag > 0 ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    //设置当前请求方法为PUT，表示REST风格中的修改操作
    @PutMapping   //使用@PutMapping简化Put请求方法对应的映射配置
    public Result update(@RequestBody Cargo carGo){
        System.out.println("carGo update..." + carGo);
        int flag = cargoDao.updateById(carGo);
        return new Result(flag > 0 ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @GetMapping("/{id}")    //使用@GetMapping简化GET请求方法对应的映射配置
    public Result getById(@PathVariable String id){
        System.out.println("carGo getById..."+id);
        Cargo cargo = cargoDao.selectById(Long.valueOf(id));
        Integer code = cargo != null ? Code.GET_OK : Code.GET_ERR;
        String msg = cargo != null ? "" : "数据查询失败，请重试！";
        return new Result(code, cargo, msg);
    }

    @GetMapping      //使用@GetMapping简化GET请求方法对应的映射配置
    public Result getAll(){
        System.out.println("carGo getAll...");
        List<Cargo> cargoList = cargoDao.selectList(null);
        Integer code = cargoList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = cargoList != null ? "" : "数据查询失败，请重试！";
        return new Result(code, cargoList, msg);
    }
}
