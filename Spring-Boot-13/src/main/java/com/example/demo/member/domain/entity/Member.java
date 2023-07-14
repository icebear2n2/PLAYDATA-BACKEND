package com.example.demo.member.domain.entity;

import com.example.demo.hobby.domain.entity.Hobby;
import com.example.demo.memberHobby.domain.entity.MemberHobby;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "members")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;

    @OneToMany(mappedBy = "member")
    private List<MemberHobby> hobbies;


}
