package com.spring.springtech.model;

import javax.persistence.*;

@Entity // annotation defines that a class can be mapped to a table.
@Table(name = "roles") // name of table
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;





}
