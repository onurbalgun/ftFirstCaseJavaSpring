package com.example.practicumfirtcase.controller;


import com.example.practicumfirtcase.entity.Urun;
import com.example.practicumfirtcase.entity.Urunyorum;
import com.example.practicumfirtcase.repositories.IUrunRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/urun")
@RequiredArgsConstructor
public class UrunController {


    private final IUrunRepository urunRepository;


    @GetMapping("/expired")
    public ResponseEntity<List<Urun>> getExpiredUruns(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date expDate){


        return ResponseEntity.ok(urunRepository.getUrunByExpdateLessThan(expDate));
    }
    @GetMapping("/nonexpired")
    public ResponseEntity<List<Urun>> getNonExpiredUruns(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date expDate){


        return ResponseEntity.ok(urunRepository.getUrunByExpdateIsNullOrExpdateGreaterThanEqual(expDate));
    }

}
