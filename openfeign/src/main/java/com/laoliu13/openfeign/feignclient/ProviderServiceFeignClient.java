package com.laoliu13.openfeign.feignclient;

import com.laoliu13.openfeign.config.FeignConfiguration;
import com.laoliu13.openfeign.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//GET http://provider-service/hello
@FeignClient(value = "provider-service",configuration = FeignConfiguration.class)
public interface ProviderServiceFeignClient {
    @GetMapping("/hello")
    public String hello();

    @PostMapping("/user/{uid}")
    User createUser(@PathVariable("uid") String uid, @RequestBody User user);

    @GetMapping("/list") //?page=xxx&rows=xxx
    List<User> query(@RequestParam("page") int page, @RequestParam("rows") int rows);

}
