package com.example.demo.todos.service;

import com.example.demo.config.service.MemberLoginService;
import com.example.demo.members.domain.entity.Member;
import com.example.demo.members.domain.response.MemberResponse;
import com.example.demo.todos.domain.entity.Todo;
import com.example.demo.todos.domain.request.TodoRequest;
import com.example.demo.todos.domain.response.TodoResponse;
import com.example.demo.todos.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;
    private final MemberLoginService memberLoginService;
    public void insert(TodoRequest request){
//        memberLoginService.findByMember(request.getMemberId());
        todoRepository.save(request.toEntity());
    }
//PUT {todoId}/check (isDone -> true)
//202
//404
//TODOS_NOT_FOUND
//401
//CHECK LOGIN USRE
    @Transactional
    public void check(Long todoId, Long memberId){
        Optional<Todo> byId = todoRepository.findById(todoId);
        Todo todo = byId
                .orElseThrow(() -> new RuntimeException("TODOS NOT FOUND"));
        if(!todo.getMember().getId().equals(memberId))
            throw new RuntimeException("MEMBER NOT FOUND");
        todo.changeIsDone();
    }

    public Page<TodoResponse> findAll(PageRequest request){
        Page<Todo> allBy = todoRepository.findAllFetch(request);
        return allBy.map(TodoResponse::new);
    }

    public Page<TodoResponse> findByDone(PageRequest request,boolean isDone) {
        Page<Todo> byDone = todoRepository.findByDone(request, isDone);
        return byDone.map(TodoResponse::new);
    }

    public Page<TodoResponse> findByContent(PageRequest request, String content) {
        Page<Todo> byDone = todoRepository.findAllByContentContaining(request, content);
        return byDone.map(TodoResponse::new);
    }

    public Page<TodoResponse> findByContentAndTitle(PageRequest request, String title, String content) {
        Page<Todo> allByTitleAndContent = todoRepository.findAllByTitleAndContent(request, title, content);
        return allByTitleAndContent.map(TodoResponse::new);
    }

    public Page<TodoResponse> findByTitle(PageRequest request, String title) {
        Page<Todo> byTitle = todoRepository.findByTitle(request, title);
        return byTitle.map(TodoResponse::new);
    }

    public Page<TodoResponse> findByLikeGoe(PageRequest request, Integer likeGoe) {
        Page<Todo> allByLikeCountGreaterThanEqual = todoRepository.findAllByLikeCountGreaterThanEqual(request, likeGoe);
        return allByLikeCountGreaterThanEqual.map(TodoResponse::new);
    }

    public Page<TodoResponse> findByLikeLoe(PageRequest request, Integer likeLoe) {
        Page<Todo> allByLikeCountIsLessThanEqual = todoRepository.findAllByLikeCountIsLessThanEqual(request, likeLoe);
        return allByLikeCountIsLessThanEqual.map(TodoResponse::new);
    }

    public Page<TodoResponse> findByLikeGoeAndLikeLoe(PageRequest request, Integer likeGoe, Integer likeLoe) {
        Page<Todo> allByLikeCountIsLessThanEqualAndLikeCountGreaterThanEqual = todoRepository.findAllByLikeCountIsLessThanEqualAndLikeCountGreaterThanEqual(request, likeGoe, likeLoe);
        return allByLikeCountIsLessThanEqualAndLikeCountGreaterThanEqual.map(TodoResponse::new);
    }
}