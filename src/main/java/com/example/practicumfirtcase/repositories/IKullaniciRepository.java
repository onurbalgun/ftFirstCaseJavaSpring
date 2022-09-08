package com.example.practicumfirtcase.repositories;

import com.example.practicumfirtcase.entity.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IKullaniciRepository extends JpaRepository<Kullanici,String> {
}
