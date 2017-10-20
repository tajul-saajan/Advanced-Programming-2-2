package com.example.saajan.myapplication;

import android.provider.ContactsContract;

/**
 * Created by saajan on 10/20/17.
 */

public class Student {

    private String name;
    private String department;
    private String roll;
    private String batch;
    private String bloodGroup;
    private  int lastDonated;
    private  String phoneNo;



    Student(String name, String bloodGroup, String department, String ID){
        this.name=name;
        this.bloodGroup=bloodGroup;
        this.department=department;
        this.roll =ID;
        this.lastDonated=0;
    }

    void donateBlood(){
        //update lastDonated to 0 and upload to the database
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getLastDonated() {
        return lastDonated;
    }

    public void setLastDonated(int lastDonated) {
        this.lastDonated = lastDonated;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
