package com.example.PaketDemo.User;

import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name="Packages")
@Data
public class DB {


    @Id
    @Column(name="package_id")
    public int package_id;

    @Column(name="package_name")
    public String package_name;

    @Column(name="package_price")
    public double package_price;

    @Column(name="package_details")
    public String package_details;
}