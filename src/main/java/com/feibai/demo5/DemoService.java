package com.feibai.demo5;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Getter
    @Setter
    @Value("其他类的属性")
    private String another;


}
