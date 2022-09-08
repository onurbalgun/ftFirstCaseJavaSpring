package com.example.practicumfirtcase.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Urunyorum {


    @Id
    private String id;
    private String yorum;
    private Date yorumtarihi;

    private  String urunid;
    private String kullaniciid;





}
