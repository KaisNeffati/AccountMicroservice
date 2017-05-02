package com.obego.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Kais NEFFATI on 1/27/2017.
 */
@Document
public class Account {
    @Id
    private String id;
    @Indexed(unique = true)
    private String userName;
    private String email;
    private String password;
    private String passwordSalt;
    private String firstName;
    private String lastName;
    private String status ;
    private String city;
    private String state;
    private String zip;
    private Calendar birthDate;
    private String gender;
    private float longitude;
    private float latitude;
    private String path;
    private String phone;
    private String post;
    private Calendar accountCreatiion;

    public Account(){

    }


    public Account( String firstName, String lastName, String email, String status, String city, String state, String zip, Calendar birthDate, String gender, String post, String userName, Calendar accountCreatiion) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.status = status;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.birthDate = birthDate;
        this.gender = gender;
        this.longitude = longitude;
        this.latitude = latitude;
        this.phone = phone;
        this.post = post;
        this.userName = userName;
        this.passwordSalt = passwordSalt;
        this.password = password;
        this.accountCreatiion = accountCreatiion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String getPost() {
        return post;
    }

    public String getUserName() {
        return userName;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public String getPassword() {
        return password;
    }

    public Calendar getAccountCreatiion() {
        return accountCreatiion;
    }

    public float getLongitude() {
        return longitude;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public float getLatitude() {
        return latitude;
    }

    public String getPhone() {
        return phone;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setAccountCreatiion(Calendar accountCreatiion) {
        this.accountCreatiion = accountCreatiion;
    }
}
