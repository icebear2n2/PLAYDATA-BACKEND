package com.example.demo;

import com.example.demo.hobby.domain.entity.Hobby;
import com.example.demo.member.domain.entity.Member;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Commit
class Demo1ApplicationTests {

    @Autowired
    EntityManager em;

    @Test
    void contextLoads() {
//        Hobby hobby = new Hobby(1L, "수영");
//        em.persist(hobby);
//        em.flush();
//        em.clear();
//        hobby.setName("농구");
//
//        Hobby hobby1 = Hobby.builder().id(2L).name("배구").build();
//        em.persist(hobby1);
//        Hobby hobby2 = em.find(Hobby.class, 2L);
//        System.out.println(hobby2);
    }

//    @Test
//    @Transactional
//    void insertData() throws Exception {
//        for (int i = 0; i < 10; i++) {
//            Hobby hobby = new Hobby((long) i, "수영");
//            em.persist(hobby);
//            if (i == 7) throw new Exception();
////            if (i % 2 == 0)
//            if (i == 5) {
//                em.flush();
//                em.clear();
//            }
//
//
//        }
//    }

//    @Test
//    void joinTest() {
//        Member member = new Member(null, "수정", 2_000_000, null);
//        em.persist(member);
//
//        Hobby hobby = new Hobby(null, "축구", member);
//        em.persist(hobby);
//
//        Hobby hobby2 = new Hobby(null, "배구", member);
//        em.persist(hobby2);
//
//        em.flush();
////        em.clear();
//
//        Member member1 = em.find(Member.class, 1L);
//        Hobby hobby1 = em.find(Hobby.class, 1L);
//
////        for (Hobby hobby3 : member1.getHobbies()) {
////            System.out.println(hobby3);
////        }
//
//        System.out.println(member1.getHobbies().get(0) == hobby1);
//        System.out.println(member1.getHobbies().get(1) == hobby1);
//
//        System.out.println(hobby1.getMember() == member1);
//        System.out.println(member1.getHobbies().get(1).getMember() == member1);
//        System.out.println();
//    }


    @Test
    void joinTest2() {
        Member member = new Member(null, "수정", 2_000_000, null);
        em.persist(member);

        Hobby hobby = new Hobby(null, "축구", member);
        em.persist(hobby);

        Hobby hobby2 = new Hobby(null, "배구", member);
        em.persist(hobby2);

        em.flush();
        em.clear();

        Member member1 = em.find(Member.class, 1L);

        System.out.println(member1.getHobbies().get(0));
        System.out.println();
    }
}
