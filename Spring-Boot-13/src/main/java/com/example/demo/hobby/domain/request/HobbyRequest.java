package com.example.demo.hobby.domain.request;

import com.example.demo.hobby.domain.entity.Hobby;
import com.example.demo.member.domain.entity.Member;
import com.example.demo.member.request.MemberRequest;

public record HobbyRequest(String name, Long memberId) {

}
