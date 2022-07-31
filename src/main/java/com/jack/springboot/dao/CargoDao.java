package com.jack.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jack.springboot.domain.Cargo;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CargoDao extends BaseMapper<Cargo> {
}

