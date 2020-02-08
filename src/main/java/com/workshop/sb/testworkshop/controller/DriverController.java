package com.workshop.sb.testworkshop.controller;

import com.workshop.sb.testworkshop.model.request.DriverRequest;
import com.workshop.sb.testworkshop.model.response.BaseResponse;
import com.workshop.sb.testworkshop.model.response.DriverResponse;
import com.workshop.sb.testworkshop.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping()
    public ResponseEntity AddNewDriver(@RequestBody DriverRequest request) {
        try {
            driverService.addNewDriver(request);
            return ResponseEntity.ok("success");
        } catch (Exception e) {
            e.printStackTrace();
            return (ResponseEntity) ResponseEntity.badRequest();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<BaseResponse> getDriverById(@PathVariable("id") int id) {
        DriverResponse driver = null;
        ResponseEntity<BaseResponse> responseEntity = null;
        try {
            driver = driverService.getDataDriverById(id);
            if (driver != null) {
                BaseResponse response = new BaseResponse();
                response.setStatus("Ok");
                response.setResult(driver);
                response.setMessage("success");

                responseEntity = new ResponseEntity(response, HttpStatus.OK);
            } else {
                BaseResponse response = new BaseResponse();
                response.setStatus("Ok");
                response.setResult(null);
                response.setMessage("No Data Exist");

                responseEntity = new ResponseEntity(response, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            BaseResponse response = new BaseResponse();
            response.setStatus("Error");
            response.setResult(e.getMessage());
            response.setMessage("Data Not Found");

            responseEntity = new ResponseEntity(response, HttpStatus.BAD_REQUEST );
        }

        return responseEntity;
    }

    @PutMapping()
    public ResponseEntity updateDataDriver() {
        return null;
    }

    @DeleteMapping()
    public ResponseEntity removeDataDriverById(@PathVariable int id) {
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity getAllDataDriver() {
        return null;
    }
}
