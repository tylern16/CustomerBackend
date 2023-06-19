package com.example.CustomerBackend.enitity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@ToString
@Entity

public class Customer {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String gender;

    @OneToMany(targetEntity = Dependent.class,cascade = CascadeType.ALL)
    @JoinColumn(name="cp_fk",referencedColumnName = "id")
    private List<Dependent> dependentList;
}
