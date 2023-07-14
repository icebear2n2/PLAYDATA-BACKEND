package com.example.demo.memberHobby.domain.entity;

import com.example.demo.hobby.domain.entity.Hobby;
import com.example.demo.member.domain.entity.Member;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Table(name = "member_hobby")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class MemberHobby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Hobby hobby;

}
