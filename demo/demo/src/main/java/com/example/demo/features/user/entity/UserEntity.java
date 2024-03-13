package com.example.demo.features.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity()
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false)
    Integer id_user;

    @Column(name = "login", nullable = false)
    String login;

    @Column(name = "email", nullable = false)
    String email;

    @Column(name = "password", nullable = false)
    String password;
    @Column(name = "create_data", nullable = false)
    Date create_data;

    @Column(name = "balance")
    Float balance;

    public UserEntity(int id_user, String login, String email, String password, float balance) {
        this.id_user = id_user;
        this.login = login;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreate_data() {
        return create_data;
    }

    public void setCreate_data(Date create_data) {
        this.create_data = create_data;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
