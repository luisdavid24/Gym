package com.gymGroup.Gym.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Porcine")
public class Coach {


    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "LastName")
    private String LastName;

    @Column(name = "Role")
    private String Role;


}
