package com.tencent.wxcloudrun;

import com.tencent.wxcloudrun.dao.CountersMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.tencent.wxcloudrun.dao"})
public class WxCloudRunApplication {  




  public static void main(String[] args) {
    SpringApplication.run(WxCloudRunApplication.class, args);


  }
}
