package com.dragonboatbuilder.persons;

import java.util.Date;
import java.util.GregorianCalendar;

public class Racer{
    private String forename;
    private String surname;
    private String nickname;
    private String email;
    private String position;
    private Double weight;
    private GregorianCalendar birth;

    public Racer() {
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String Forename) {
        this.forename = Forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String Surname) {
        this.surname = Surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String Nickname) {
        this.nickname = Nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String Position) {
        this.position = Position;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double Weight) {
        this.weight = Weight;
    }

    public GregorianCalendar getBirth() {
        return birth;
    }

    public void setBirth(String Birth) {
        System.out.println(Birth);
        String[] s;//DD.MM.YYYY
        String str = Birth.replace(".", "-");
        s = str.split("-");
        int i0 = Integer.parseInt(s[0]); //Day
        int i1 = Integer.parseInt(s[1]); //Month
        int i2 = Integer.parseInt(s[2]); //Year
        GregorianCalendar calendar = new GregorianCalendar(i2, i1, i0); //Year,Month,Day of Month
        
        System.out.println(calendar);
        this.birth = calendar;
    }
    
    
}