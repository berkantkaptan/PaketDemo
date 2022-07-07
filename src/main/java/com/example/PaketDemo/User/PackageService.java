package com.example.PaketDemo.User;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class PackageService {
    @Autowired
    private PackagesRepository packagesRepository;



    public DB getUserByid(int id){
        DB db=packagesRepository.getById(id);
        return db;
    }
    public List<DB> getAllPackages(){

        return  packagesRepository.findAll();
    }


}

