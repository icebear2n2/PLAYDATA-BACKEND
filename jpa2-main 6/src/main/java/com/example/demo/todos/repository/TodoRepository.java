package com.example.demo.todos.repository;

import com.example.demo.members.domain.entity.Member;
import com.example.demo.todos.domain.entity.Todo;
import com.example.demo.todos.domain.response.TodoResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    @Query("select t from Todo t left join fetch t.member m order by t.id asc")
    Page<Todo> findAllFetch(Pageable request);


    @Query("select t from Todo t left join fetch t.member m where t.isDone = :isDone")
    Page<Todo> findByDone(Pageable request, boolean isDone);

    @Query("select t from Todo t left join fetch t.member m where t.content like %:content%")
    Page<Todo> findAllByContentContaining(Pageable request, String content);

    @Query("select t from Todo t left join fetch t.member m where t.title  = :title and t.content like %:content%")
    Page<Todo> findAllByTitleAndContent(Pageable request, String title, String content);


    @Query("select t from Todo t left join fetch t.member m where t.title like %:title% order by t.id asc ")
    Page<Todo> findByTitle(Pageable request, String title);

    @Query("select t from Todo t left join fetch t.member m where t.likeCount >= :likeGoe")
    Page<Todo> findAllByLikeCountGreaterThanEqual(Pageable request, Integer likeGoe);

    @Query("select t from Todo t left join fetch t.member m where t.likeCount < :likeLoe")
    Page<Todo> findAllByLikeCountIsLessThanEqual(Pageable request, Integer likeLoe);

    @Query("select t from Todo t left join fetch t.member m where t.likeCount BETWEEN :likeLoe AND :likeGoe")
    Page<Todo> findAllByLikeCountIsLessThanEqualAndLikeCountGreaterThanEqual(Pageable request, Integer likeGoe, Integer likeLoe);
}
