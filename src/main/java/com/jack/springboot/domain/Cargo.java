package com.jack.springboot.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
public class Cargo implements Serializable {

    private Long id;
    // 名称
    private String name;

    private String standard;

    private String pic;

    private String number;

    // 位置
    private String location;
    // 描述
    private String introduction;

}
