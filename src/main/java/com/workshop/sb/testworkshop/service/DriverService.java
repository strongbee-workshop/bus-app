package com.workshop.sb.testworkshop.service;

import com.workshop.sb.testworkshop.model.DriverRequest;
import com.workshop.sb.testworkshop.persistance.model.Driver;
import com.workshop.sb.testworkshop.persistance.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public void addNewDriver(DriverRequest request) throws Exception{
        Driver driverData = new Driver(request);
        driverRepository.save(driverData);
    }
}
