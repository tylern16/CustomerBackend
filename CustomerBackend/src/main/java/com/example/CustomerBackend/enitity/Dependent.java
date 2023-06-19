package com.example.CustomerBackend.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Dependent {
    @Id
    private int dID;
    private String name;
    private String  email;
    private String gender;

}
