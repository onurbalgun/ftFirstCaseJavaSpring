package com.example.practicumfirtcase.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity

@Data
public class Urun {

    @Id
    private String id;
    private String adi;
    private double fiyat;
    @Column(name = "expdate")
    private Date expdate;


  //  private List<Urunyorum> yorumList =new ArrayList<Urunyorum>();




}
