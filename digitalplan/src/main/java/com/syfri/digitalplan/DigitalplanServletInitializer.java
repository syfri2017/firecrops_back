package com.syfri.digitalplan;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Digitalplan程序启动类
 *
 * @author lixiaoyang
 * @date 2017年9月29日09:00:42
 */
public class DigitalplanServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DigitalplanApplication.class);
    }

}
