/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import static com.alibaba.nacos.core.utils.Constants.FUNCTION_MODE_PROPERTY_NAME;
import static com.alibaba.nacos.core.utils.SystemUtils.FUNCTION_MODE_NAMING;

/**
 * @author nacos
 */
@SpringBootApplication(scanBasePackages = "com.alibaba.nacos")
@ServletComponentScan
@EnableScheduling
public class Nacos {

    // 这里测试使用
    static {
        System.setProperty(FUNCTION_MODE_PROPERTY_NAME,FUNCTION_MODE_NAMING);
        String nacosName = null;
        if (System.getProperty("os.name").toLowerCase().contains("windows")){
            nacosName = "C:\\Users\\13976\\Documents\\nacos-server-1.1.4\\nacos";
        }else {
            nacosName = "/Users/jzdayz/Documents/nacos";
        }
        System.setProperty("nacos.home", nacosName);
        System.setProperty("nacos.standalone","true");
    }

    public static void main(String[] args) {
        SpringApplication.run(Nacos.class, args);
    }
}
