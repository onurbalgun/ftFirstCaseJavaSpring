package com.example.practicumfirtcase.controller;

import com.example.practicumfirtcase.entity.Urun;
import com.example.practicumfirtcase.entity.Urunyorum;
import com.example.practicumfirtcase.repositories.IUrunRepository;
import com.example.practicumfirtcase.repositories.IUrunYorum;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/urunyorum")
@RequiredArgsConstructor
public class UrunYorumController {


    private final IUrunYorum yorumRepository;




    @GetMapping("/kullanici/{kullaniciid}")
    public ResponseEntity<List<Urunyorum>> getUrunbyKullaniciID(@PathVariable String kullaniciid){


        return ResponseEntity.ok(yorumRepository.getUrunYorumsByKullaniciid(kullaniciid));
    }



    @GetMapping("/urun/{urunid}")
    public ResponseEntity<List<Urunyorum>> getUrunbyUrunId(@PathVariable String urunid){


        return ResponseEntity.ok(yorumRepository.getUrunYorumsByUrunid(urunid));
    }
    @GetMapping("/urundate")

    public ResponseEntity<List<Urunyorum>> getUrunyorumByUrunIdAndDate(@RequestParam String urunid, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
                                                         @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd")  Date endDate){


        return ResponseEntity.ok(yorumRepository.getUrunyorumsByUrunidAndYorumtarihiBetween(urunid,startDate,endDate));
    }
    @GetMapping("/kullanicidate")

    public ResponseEntity<List<Urunyorum>> getUrunyorumByKullaniciIdAndDate(@RequestParam String kullaniciid, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
                                                                       @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd")  Date endDate){


        return ResponseEntity.ok(yorumRepository.getUrunyorumsBykullaniciidAndYorumtarihiBetween(kullaniciid,startDate,endDate));
    }
}
