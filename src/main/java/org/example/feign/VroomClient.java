package org.example.feign;


import org.example.config.FeignClientConfig;
import org.example.dto.VroomRequest;
import org.example.dto.VroomResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//change to your own url that vrp-express runs
@FeignClient(url = "${vrp.url}:",name = "vrpClient",configuration = FeignClientConfig.class)
public interface VroomClient {

    @PostMapping
    VroomResponse vrp(@RequestBody VroomRequest request);
}
