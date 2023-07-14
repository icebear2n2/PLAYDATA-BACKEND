package com.example.demo.member.service;

import com.example.demo.member.domain.entity.Member;
import com.example.demo.member.request.MemberRequest;
import com.example.demo.member.response.MemberResponse;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final EntityManager em;

    @Transactional(readOnly = true)
    public List<MemberResponse> findAll() {
        return em.createQuery("select m from Member m " +
                                "left join fetch m.hobbies"
                        , Member.class).getResultStream()
                .map(MemberResponse::new).toList();
    }

    @Transactional(readOnly = true)
    public MemberResponse findById(Long id) {
        Member member = em.find(Member.class, id);
        return new MemberResponse(member);
    }

    @Transactional(readOnly = true)
    public List<MemberResponse> findByName(String name) {
        return em.createQuery("select m from Member m " +
                        "where m.name like :name", Member.class)
                .setParameter("name", "%" + name + "%").getResultStream().map(MemberResponse::new).toList();
    }

    @Transactional
    public void save(MemberRequest request) {
        Member member = new Member(null, request.name(), request.age(), null);
        em.persist(member);
        em.flush();
    }


    @Transactional
    public void delete(Long id) {
        Member member = em.find(Member.class, id);
        em.remove(member);
    }


    @Transactional
    public MemberResponse update(Long id, MemberRequest request) {
        Member member = em.find(Member.class, id);
        member.setName(request.name());
        member.setAge(request.age());
        return new MemberResponse(member);
    }
}
