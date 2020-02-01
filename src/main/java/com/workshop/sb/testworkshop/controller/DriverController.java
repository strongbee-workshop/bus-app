package com.workshop.sb.testworkshop.controller;

import com.workshop.sb.testworkshop.model.DriverRequest;
import com.workshop.sb.testworkshop.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping("/driver")
    public ResponseEntity AddNewDriver(@RequestBody DriverRequest request) {
        try {
            driverService.addNewDriver(request);
            return ResponseEntity.ok("success");
        } catch (Exception e) {
            e.printStackTrace();
            return (ResponseEntity) ResponseEntity.badRequest();
        }
    }
}
