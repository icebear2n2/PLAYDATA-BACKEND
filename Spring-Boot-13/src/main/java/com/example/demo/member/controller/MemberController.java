package com.example.demo.member.controller;

import com.example.demo.member.request.MemberRequest;
import com.example.demo.member.response.MemberResponse;
import com.example.demo.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public void save(@RequestBody MemberRequest request) {
        memberService.save(request);
    }

    @GetMapping("{id}")
    public MemberResponse findById(@PathVariable("id") Long id) {
        return memberService.findById(id);
    }

    @GetMapping
    public List<MemberResponse> findAll() {
        return memberService.findAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        memberService.delete(id);
    }
    
    @GetMapping("/name")
    public List<MemberResponse> findByName(@RequestParam(value = "name", required = false, defaultValue = "") String name) {
        return memberService.findByName(name);
    }
}
