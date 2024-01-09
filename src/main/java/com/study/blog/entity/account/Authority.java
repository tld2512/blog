//package com.study.blog.entity.account;
//
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//
//import jakarta.persistence.*;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@AllArgsConstructor
//@Entity
//@NoArgsConstructor
//@Table(name = "authorities")
//public class Authority {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @NotNull
//    @NotEmpty
//    @Column(name = "username", nullable = false, unique = true)
//    private String username;
//
//    @Column(name = "password", nullable = false)
//    @NotNull
//    @NotEmpty
//    private String password;
//
//    @Column(name = "email", unique = true)
//    @Email
//    @NotEmpty
//    private String email;
//
//
//    @JsonManagedReference
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.EAGER)
//    private Set<Authority> authorities = new HashSet<>();
//
//
//}
