package com.example.demo.hobby.service;

import com.example.demo.hobby.domain.entity.Hobby;
import com.example.demo.hobby.domain.request.ConnectRequest;
import com.example.demo.hobby.domain.request.HobbyRequest;
import com.example.demo.hobby.domain.response.HobbyResponse;
import com.example.demo.member.domain.entity.Member;
import com.example.demo.memberHobby.domain.entity.MemberHobby;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HobbyService {
    private final EntityManager em;


    @Transactional
    public void connect(ConnectRequest request) {
        MemberHobby memberHobby = new MemberHobby(null,
                Member.builder().id(request.getMemberId()).build(),
                Hobby.builder().id(request.getHobbyId()).build()
        );
        em.persist(memberHobby);
    }

    @Transactional(readOnly = true)
    public List<HobbyResponse> findAll() {
        return em.createQuery("select h from Hobby h", Hobby.class)
                .getResultStream().map(HobbyResponse::new).toList();


    }

    @Transactional(readOnly = true)
    public HobbyResponse findById(Long id) {
        Hobby hobby = em.find(Hobby.class, id);
        return new HobbyResponse(hobby);
    }

    @Transactional
    public void save(HobbyRequest request) {
        Hobby hobby = new Hobby(null, request.name(),
                null);
        em.persist(hobby);
        System.out.println("hobby = " + hobby);
        em.flush();
    }

    @Transactional
    public void delete(Long id) {
        Hobby hobby = em.find(Hobby.class, id);
        em.remove(hobby);
    }


    @Transactional
    public List<HobbyResponse> findByName(String name) {
        return em.createQuery("select h from Hobby h where h.name like :name", Hobby.class)
                .setParameter("name", "%" + name + "%").getResultStream().map(HobbyResponse::new).toList();
    }
}
