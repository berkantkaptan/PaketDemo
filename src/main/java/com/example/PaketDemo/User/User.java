package com.example.PaketDemo.User;

import lombok.Data;


import javax.persistence.*;




@Entity
@Table(name="Users")
@Data
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int user_id;

    @Column(name="user_name")
    private String user_name;

    @Column(name="user_surname")
    private String user_surname;

    @Column(name="package_id")
    public int package_id;



}
