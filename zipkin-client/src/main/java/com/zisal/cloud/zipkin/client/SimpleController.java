package com.zisal.cloud.zipkin.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on Feb 24, 2018
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@RestController
public class SimpleController {

    @GetMapping("/echo")
    public String echo () {
        return "Hello World";
    }
}
