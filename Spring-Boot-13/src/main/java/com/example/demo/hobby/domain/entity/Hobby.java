package com.example.demo.hobby.domain.entity;


import com.example.demo.member.domain.entity.Member;
import com.example.demo.memberHobby.domain.entity.MemberHobby;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "hobbies")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "hobby")
    private List<MemberHobby> members;


}
