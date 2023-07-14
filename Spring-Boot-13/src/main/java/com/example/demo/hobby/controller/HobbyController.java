package com.example.demo.hobby.controller;


import com.example.demo.hobby.domain.request.ConnectRequest;
import com.example.demo.hobby.domain.request.HobbyRequest;
import com.example.demo.hobby.domain.response.HobbyResponse;
import com.example.demo.hobby.service.HobbyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/hobbies")
public class HobbyController {
    private final HobbyService hobbyService;

    @PostMapping
    public void save(@RequestBody HobbyRequest request) {
        hobbyService.save(request);
    }

    @GetMapping("{id}")
    public HobbyResponse findById(@PathVariable("id") Long id) {
        return hobbyService.findById(id);
    }

    @GetMapping
    public List<HobbyResponse> findAll() {
        return hobbyService.findAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        hobbyService.delete(id);
    }

    @GetMapping("/name")
    public List<HobbyResponse> findByName(@RequestParam(value = "name", required = false, defaultValue = "") String name) {
        return hobbyService.findByName(name);
    }

    @PostMapping("/connect")
    public void connect(@RequestBody ConnectRequest request) {
        hobbyService.connect(request);
    }
}
