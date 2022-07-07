package com.example.PaketDemo.Admin;


import com.example.PaketDemo.User.DB;
import com.example.PaketDemo.User.PackageService;
import com.example.PaketDemo.User.User;
import com.example.PaketDemo.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private PackageService packageService;
    @Autowired
    private UserService userService;



    @GetMapping("/Admin/Packages")
    public List<DB> getAllPackages() {
        return packageService.getAllPackages();
    }

    @GetMapping("/Admin/Users")
    public List<User> getAllUsers(){
        return  userService.getAllUsers();
    }

    @GetMapping("/Admin/Packages/{id}")
    public DB getOnePackagebyId(@PathVariable int id) {
        DB db=packageService.getUserByid(id);
        return db;
    }
    @GetMapping("/Admin/Users/{id}")
    public User getOneUserbyId(@PathVariable int id){
        return userService.getUserByid(id);
    }

    @PostMapping("/Admin/deletePackage")
    public void deleteOnePackage(int package_id){
        adminService.deleteOnePackage(package_id);
    }
    @PostMapping("/Admin/AddPackage")
    public void addPackage(String package_name,String package_detail,int package_price,int package_id){
        adminService.addPackage(package_name,package_detail,package_price,package_id);
    }
    @PostMapping("/Admin/UpdatePackage")
    public void updatePackage(String package_name,String package_detail,int package_price,int package_id){
        adminService.updatePackage(package_name,package_detail,package_price,package_id);
    }


}


