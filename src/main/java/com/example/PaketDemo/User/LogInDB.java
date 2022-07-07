package com.example.PaketDemo.User;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;








@Entity
@Table(name="Register")
@Data
public class LogInDB{


    @Id
    @Column(name="email")
    public String email;

    @Column(name="password")
    public String  password;



}