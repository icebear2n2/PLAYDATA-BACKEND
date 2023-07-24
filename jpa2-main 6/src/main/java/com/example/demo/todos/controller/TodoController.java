package com.example.demo.todos.controller;

import com.example.demo.config.aspect.TokenRequired;
import com.example.demo.config.auth.AuthService;
import com.example.demo.members.domain.response.MemberResponse;
import com.example.demo.todos.domain.request.TodoRequest;
import com.example.demo.todos.domain.response.TodoResponse;
import com.example.demo.todos.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/todos")
public class TodoController {
    private final TodoService todoService;
    private final AuthService authService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @TokenRequired
    public void postTodos(
            @RequestBody TodoRequest request,
            @RequestHeader("Authorization") String token
    ){
        Map<String, Object> map = authService
                .getClaims(token.replace("Bearer ", ""));
        request.setMemberId(((Integer) map.get("memberId")).longValue());
        todoService.insert(request);
    }
    @PutMapping("{todoId}/check")
    @TokenRequired
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void check(
            @PathVariable("todoId") Long todoId,
            @RequestHeader("Authorization") String token
            ){
        Map<String, Object> map =
                authService.getClaims(token.replace("Bearer ", ""));
        Long memberId = ((Integer) map.get("memberId")).longValue();
        todoService.check(todoId, memberId);
    }
    @GetMapping
    public Map<String , Object> getAll(

            @RequestParam(required = false, defaultValue = "0", name = "page")
            Integer page,
            @RequestParam(required = false, defaultValue = "20", name = "size")
            Integer size,
            @RequestParam(required = false, name = "isDone")
            boolean isDone,
            @RequestParam(required = false, defaultValue = "", name = "title")
            String title,
             @RequestParam(required = false, defaultValue = "", name = "content")
             String contents,
            @RequestParam(required = false, defaultValue = "0", name = "likeGoe")
            Integer likeGoe,
            @RequestParam(required = false, defaultValue = "0", name = "likeLoe")
            Integer likeLoe
    ) {
        Map<String, Object> map = new HashMap<>();

        if (isDone) {
            Page<TodoResponse> byDone = todoService.findByDone(PageRequest.of(page, size), true);
            long totalElements = byDone.getTotalElements();
            int totalPages = byDone.getTotalPages();
            List<TodoResponse> content = byDone.getContent();
            map.put("totalElements", totalElements);
            map.put("totalPages", totalPages);
            map.put("content", content);

        }  else if (!contents.isEmpty() && !title.isEmpty()) {
            Page<TodoResponse> byContentAndTitle = todoService.findByContentAndTitle(PageRequest.of(page, size), title, contents);
            long totalElements = byContentAndTitle.getTotalElements();
            int totalPages = byContentAndTitle.getTotalPages();
            List<TodoResponse> content = byContentAndTitle.getContent();
            map.put("totalElements",totalElements);
            map.put("totalPages",totalPages);
            map.put("content",content);

    } else if (!title.isEmpty()) {
            Page<TodoResponse> byTitle = todoService.findByTitle(PageRequest.of(page, 1), title);
            int totalPages = byTitle.getTotalPages();
            List<TodoResponse> content = byTitle.getContent();
            map.put("totalElements",1);
            map.put("totalPages",totalPages);
            map.put("content",content);
        } else if (!contents.isEmpty()) {
            Page<TodoResponse> byContent = todoService.findByContent(PageRequest.of(page, size), contents);
            long totalElements = byContent.getTotalElements();
            int totalPages = byContent.getTotalPages();
            List<TodoResponse> content = byContent.getContent();
            map.put("totalElements",totalElements);
            map.put("totalPages",totalPages);
            map.put("content",content);
        } else if (!likeGoe.equals(0) && !likeLoe.equals(0)) {
            Page<TodoResponse> byLikeGoeAndLikeLoe = todoService.findByLikeGoeAndLikeLoe(PageRequest.of(page, size), likeGoe, likeLoe);
            long totalElements = byLikeGoeAndLikeLoe.getTotalElements();
            int totalPages = byLikeGoeAndLikeLoe.getTotalPages();
            List<TodoResponse> content = byLikeGoeAndLikeLoe.getContent();
            map.put("totalElements",totalElements);
            map.put("totalPages",totalPages);
            map.put("content",content);
        } else if (!likeGoe.equals(0)) {
            Page<TodoResponse> byLikeGoe = todoService.findByLikeGoe(PageRequest.of(page, size), likeGoe);
            long totalElements = byLikeGoe.getTotalElements();
            int totalPages = byLikeGoe.getTotalPages();
            List<TodoResponse> content = byLikeGoe.getContent();
            map.put("totalElements",totalElements);
            map.put("totalPages",totalPages);
            map.put("content",content);
        } else if (!likeLoe.equals(0)) {
            Page<TodoResponse> byLikeLoe = todoService.findByLikeLoe(PageRequest.of(page, size), likeLoe);
            long totalElements = byLikeLoe.getTotalElements();
            int totalPages = byLikeLoe.getTotalPages();
            List<TodoResponse> content = byLikeLoe.getContent();
            map.put("totalElements",totalElements);
            map.put("totalPages",totalPages);
            map.put("content",content);
        } else {
            Page<TodoResponse> all = todoService.findAll(PageRequest.of(page, size));
            long totalElements = all.getTotalElements();
            int totalPages = all.getTotalPages();
            List<TodoResponse> content = all.getContent();
            map.put("totalElements",totalElements);
            map.put("totalPages",totalPages);
            map.put("content",content);
        }

        return map;
    }
}