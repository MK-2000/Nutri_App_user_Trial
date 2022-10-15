package com.group_4_trial_1.Nutri_App_user_Trial.dto;

import java.sql.Time;
import java.time.LocalDate;


public class UserDTO {
    private Long id;
    private String userIdentification;
    private String name;
    private String contact;
    private String gender;
    private LocalDate dob;
    //    private Image photo;
    private String email;
    private String role;
    private String status;
    private Float weight;
    private Float height;
    private String dietaryOrientation;
    private String intensity;
    private String goal;
    private String workOutline;
    private Time wakeUpTime;
    private Time sleepTime;
    private String medicalCondition;
    private String allergicTo;
    private String loginName;
    private String password;

    public UserDTO() {
    }

    public UserDTO(Long id, String userIdentification, String name, String contact,
                   String gender, LocalDate dob, String email, String role,
                   String status, Float weight, Float height, String dietaryOrientation,
                   String intensity, String goal, String workOutline, Time wakeUpTime,
                   Time sleepTime, String medicalCondition, String allergicTo, String loginName, String password) {
        this.id = id;
        this.userIdentification = userIdentification;
        this.name = name;
        this.contact = contact;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.role = role;
        this.status = status;
        this.weight = weight;
        this.height = height;
        this.dietaryOrientation = dietaryOrientation;
        this.intensity = intensity;
        this.goal = goal;
        this.workOutline = workOutline;
        this.wakeUpTime = wakeUpTime;
        this.sleepTime = sleepTime;
        this.medicalCondition = medicalCondition;
        this.allergicTo = allergicTo;
        this.loginName = loginName;
        this.password = password;
    }

    public UserDTO(Long id, String name, String contact, String gender) {

        this.name = name;
        this.contact = contact;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserIdentification() {
        return userIdentification;
    }

    public void setUserIdentification(String userIdentification) {
        this.userIdentification = userIdentification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public String getDietaryOrientation() {
        return dietaryOrientation;
    }

    public void setDietaryOrientation(String dietaryOrientation) {
        this.dietaryOrientation = dietaryOrientation;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getWorkOutline() {
        return workOutline;
    }

    public void setWorkOutline(String workOutline) {
        this.workOutline = workOutline;
    }

    public Time getWakeUpTime() {
        return wakeUpTime;
    }

    public void setWakeUpTime(Time wakeUpTime) {
        this.wakeUpTime = wakeUpTime;
    }

    public Time getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(Time sleepTime) {
        this.sleepTime = sleepTime;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getAllergicTo() {
        return allergicTo;
    }

    public void setAllergicTo(String allergicTo) {
        this.allergicTo = allergicTo;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", userIdentification='" + userIdentification + '\'' +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", gender='" + gender + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", status='" + status + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", dietaryOrientation='" + dietaryOrientation + '\'' +
                ", intensity='" + intensity + '\'' +
                ", goal='" + goal + '\'' +
                ", workOutline='" + workOutline + '\'' +
                ", wakeUpTime=" + wakeUpTime +
                ", sleepTime=" + sleepTime +
                ", medicalCondition='" + medicalCondition + '\'' +
                ", allergicTo='" + allergicTo + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
