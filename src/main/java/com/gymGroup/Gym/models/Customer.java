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
@Table(name = "Customer")
public class Customer {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "Name")
    private String Name;

    @Column(name = "LastName")
    private String LastName;

    @Column(name = "Gender",nullable = true)
    private String Gender;

    @Column(name = "Phone")
    private String Phone;

    @Column(name = "NameEmergency",nullable = true)
    private String NameEmergency;

    @Column(name = "LastEmergency",nullable = true)
    private String LastEmergency;

    @Column(name = "PhoneEmergency",nullable = true)
    private String PhoneEmergency;

}
