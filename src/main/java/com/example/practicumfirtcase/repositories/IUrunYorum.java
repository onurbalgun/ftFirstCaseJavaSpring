package com.example.practicumfirtcase.repositories;

import com.example.practicumfirtcase.entity.Urunyorum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface IUrunYorum extends JpaRepository<Urunyorum,String> {

    List<Urunyorum> getUrunYorumsByUrunid(String urunid);

    List<Urunyorum> getUrunYorumsByKullaniciid(String kullaniciid);
    List<Urunyorum> getUrunyorumsByUrunidAndYorumtarihiBetween(String urunid,Date startDate,Date endDate);

    List<Urunyorum> getUrunyorumsBykullaniciidAndYorumtarihiBetween(String kullaniciid,Date startDate,Date endDate);


}
