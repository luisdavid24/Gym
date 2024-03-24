package com.gymGroup.Gym.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Porcine")
public class GymClasses {


    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;


    @Column(name = "Name")
    private String Name;

    @Column(name = "Coach")
    private List<Coach> Coach;

    @Column(name = "Schedule")
    private Date Schedule;

}
