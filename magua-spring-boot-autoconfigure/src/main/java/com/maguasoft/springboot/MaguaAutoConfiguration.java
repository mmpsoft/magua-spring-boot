package com.maguasoft.springboot;

import com.maguasoft.magua.orm.SupportDao;
import com.maguasoft.magua.orm.support.SupportDaoImpl;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class MaguaAutoConfiguration {

    @Bean
    public SupportDao supportDao() {
        // EnableDaoSupport
        return new SupportDaoImpl();
    }
}
