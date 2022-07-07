package com.example.PaketDemo.Admin;

import com.example.PaketDemo.User.DB;
import com.example.PaketDemo.User.PackagesRepository;
import com.example.PaketDemo.User.User;
import com.example.PaketDemo.User.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class AdminService {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private PackagesRepository packagesRepository;

    public void deleteOnePackage(int package_id){
        packagesRepository.deleteById(package_id);
    }
    public void addPackage(String package_name,String package_detail,int package_price,int package_id){

        DB db= new DB();
        db.package_id=package_id;
        db.package_details=package_detail;
        db.package_name=package_name;
        db.package_price=package_price;
        packagesRepository.save(db);
    }
    public void updatePackage(String package_name,String package_detail,int package_price,int package_id){
        DB db=packagesRepository.findById(package_id).get();
        db.package_id=package_id;
        db.package_details=package_detail;
        db.package_name=package_name;
        db.package_price=package_price;
        packagesRepository.save(db);
    }
}
