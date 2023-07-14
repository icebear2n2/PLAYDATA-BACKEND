package com.example.demo.member.response;

import com.example.demo.hobby.domain.entity.Hobby;
import com.example.demo.member.domain.entity.Member;
import com.example.demo.memberHobby.domain.entity.MemberHobby;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
public class MemberResponse {
    private Long id;
    private String name;
    private Integer age;

    private List<HobbyDto> hobbies;


    public MemberResponse(Member member) {
        this.id = member.getId();
        this.name = member.getName();
        this.age = member.getAge();
        this.hobbies = member.getHobbies()
                .stream()
                .map(MemberHobby::getHobby)
                .map(HobbyDto::new).toList();
    }

    @Getter
    @AllArgsConstructor
    class HobbyDto {
        private Long id;
        private String name;

        public HobbyDto(Hobby hobby) {
            this.id = hobby.getId();
            this.name = hobby.getName();

        }
    }

}
