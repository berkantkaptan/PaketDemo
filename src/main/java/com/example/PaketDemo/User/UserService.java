package com.example.PaketDemo.User;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class UserService {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private LogInRepository logInRepository;




    public User getUserByid(int id){

        return usersRepository.getById(id);
    }
    public List<User> getAllUsers(){
        return  usersRepository.findAll();
    }
    public void buyPackage(int user_id, int package_id){
        User user=usersRepository.findById(user_id).get();
        user.package_id=package_id;
        usersRepository.save(user);


    }
    public void sign_in(String email,String password){
        LogInDB logInDB=new LogInDB();
        logInDB.email=email;
        logInDB.password=password;
        logInRepository.save(logInDB);
    }
    public String register(String email, String password){
        final LogInDB logInDB= logInRepository.findById(email).orElseThrow(() -> new NotFoundException("Email yanlis"));
        if(logInDB.password.equals(password)){
            return "Giris basarili";
        }
        else{
            return "Sifre yanlis";
        }
    }
}
