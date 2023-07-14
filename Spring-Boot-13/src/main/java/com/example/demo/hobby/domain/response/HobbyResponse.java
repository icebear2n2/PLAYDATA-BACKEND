package com.example.demo.hobby.domain.response;

import com.example.demo.hobby.domain.entity.Hobby;
import com.example.demo.member.domain.entity.Member;
import com.example.demo.member.response.MemberResponse;
import com.example.demo.memberHobby.domain.entity.MemberHobby;
import lombok.Getter;

import java.util.List;

@Getter
public class HobbyResponse {
    private Long id;
    private String name;
    private List<MemberDto> members;

    public HobbyResponse(Hobby hobby) {
        this.id = hobby.getId();
        this.name = hobby.getName();
        this.members = hobby.getMembers().stream().map(MemberHobby::getMember).map(MemberDto::new).toList();
    }

    @Getter
    class MemberDto {
        private Long id;
        private String name;
        private Integer age;

        public MemberDto(Member member) {
            this.id = member.getId();
            this.name = member.getName();
            this.age = member.getAge();
        }
    }
}
