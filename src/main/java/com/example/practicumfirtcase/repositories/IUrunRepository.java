package com.example.practicumfirtcase.repositories;

import com.example.practicumfirtcase.entity.Urun;
import com.example.practicumfirtcase.entity.Urunyorum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface IUrunRepository extends JpaRepository<Urun,String> {

    List<Urun> getUrunByExpdateLessThan(Date expdate);
    List<Urun> getUrunByExpdateIsNullOrExpdateGreaterThanEqual(Date expdate);

}
