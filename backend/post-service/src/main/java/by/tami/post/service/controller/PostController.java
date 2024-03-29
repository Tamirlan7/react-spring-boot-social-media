package by.tami.post.service.controller;

import by.tami.post.service.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/post")
@RequiredArgsConstructor
public class PostController {

    private final PostService pService;

    @GetMapping
    ResponseEntity<String> get() {
        return ResponseEntity.ok("Test!");
    }

}
