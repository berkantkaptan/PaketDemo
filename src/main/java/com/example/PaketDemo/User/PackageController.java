package com.example.PaketDemo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PackageController {

    @Autowired
    private PackageService packageService;

    @Autowired
    public PackageController(PackageService packageService) {

        this.packageService = packageService;
    }


    @GetMapping("/Packages")
    public List<DB> getAllPackages() {
        return packageService.getAllPackages();
    }

    @GetMapping("/Packages/{id}")
    public DB getOnePackagebyId(@PathVariable int id) {
        DB db=packageService.getUserByid(id);
        return db;
    }


}


