package org.example;

import org.example.dto.Job;
import org.example.dto.Vehicle;
import org.example.dto.VroomRequest;
import org.example.dto.VroomResponse;
import org.example.feign.VroomClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author peak
 * @desc desc
 * @date 2026/1/15 02:10
 */
@SpringBootTest
public class VroomIntegrateApplicationTests{
    @Autowired
    VroomClient vroomClient;

    @Test
    public void VroomRequestTest(){
        VroomRequest request = new VroomRequest();
        List<Job> jobList = new ArrayList<>();
        //TODO: fill your jobList: Job job = new Job(); job.setXX()
        request.setJobs(jobList);
        List<Vehicle> vehicleList = new ArrayList<>();
        //TODO: fill your vehicleList: JVehicle vehicle = new Vehicle(); vehicle.setXX()
       request.setVehicles(vehicleList);

        VroomResponse response = vroomClient.vrp(request);
    }
}
