package com.study.blog.entity.model;

import com.study.blog.entity.account.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Table(name = "post")
public class Post {

    @Id
    @Column(name = "id")
    @NotNull(message = "Please enter product ID")
    private String id;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User user;

    @NotNull
    private String title;
}
