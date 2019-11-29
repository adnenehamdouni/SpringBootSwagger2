package com.qugenx.swagger.controller;

import com.qugenx.swagger.component.ApiResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"/api"})
public class AppController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ApiResource apiResource;

    @GetMapping(value="/version", headers="Accept=application/json")
    public ResponseEntity<ApiResource> getApiResource() {
        logger.info("Build version = {}", apiResource.getBuildVersion() );
        return new ResponseEntity<>(apiResource, HttpStatus.OK);
    }

}
