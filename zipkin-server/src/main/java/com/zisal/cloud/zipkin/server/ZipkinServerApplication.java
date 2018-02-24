package com.zisal.cloud.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * Created on Feb 24, 2018
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication {

    public static void main(String [] args) {
        SpringApplication.run(ZipkinServerApplication.class);
    }  
}
