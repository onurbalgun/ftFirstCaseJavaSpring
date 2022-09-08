package com.example.practicumfirtcase.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Kullanici {

    @Id
    private  String id;
    private String Adı;
    private  String Soyadı;
    private String Email;
    private String telefon;


    //private List<Urunyorum> kullaniciYorumList =new ArrayList<Urunyorum>();


}

