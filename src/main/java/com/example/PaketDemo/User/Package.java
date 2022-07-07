package com.example.PaketDemo.User;

public class Package {

    private String package_name;
    private String package_detail;
    private int package_id;

    public Package(String package_name, String package_detail, int package_id) {
        this.package_name = package_name;
        this.package_detail = package_detail;
        this.package_id = package_id;
    }

    public String getPackage_name() {
        return package_name;
    }

    public void setPackage_name(String package_name) {
        this.package_name = package_name;
    }

    public String getPackage_detail() {
        return package_detail;
    }

    public void setPackage_detail(String package_detail) {
        this.package_detail = package_detail;
    }

    public int getPackage_id() {
        return package_id;
    }

    public void setPackage_id(int package_id) {
        this.package_id = package_id;
    }

    @Override
    public String toString() {
        return "Package{" +
                "package_name='" + package_name + '\'' +
                ", package_detail='" + package_detail + '\'' +
                ", package_id=" + package_id +
                '}';
    }
}
