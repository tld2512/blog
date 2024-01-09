package com.study.blog.controller;

import com.study.blog.entity.account.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    final private List<User> users = List.of(
            User.builder().id(1L).email("pipi@gmail.com").firstName("Pi").lastName("Pi").passwordHash("123456").build(),
            User.builder().id(2L).email("lily@gmail.com").firstName("Li").lastName("Ly").passwordHash("123456").build()
    );

    @GetMapping("/home")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello darkness my old friend");
    }

    @GetMapping("/profile/{id}")
    public ResponseEntity<User> getCustomerList(@PathVariable("id") String id) {
        List<User> users = this.users.stream().filter(user -> user.getId().equals(Long.parseLong(id))).toList();
        return ResponseEntity.ok(users.get(0));
    }
}
