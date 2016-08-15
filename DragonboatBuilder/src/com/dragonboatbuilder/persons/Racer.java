package com.dragonboatbuilder.persons;

import java.util.Date;
import java.util.GregorianCalendar;

public class Racer{
    private String Forename;
    private String Surname;
    private String Nickname;
    private String Email;
    private String Position;
    private Double Weight;
    private GregorianCalendar Birth;

    public Racer() {
    }

    public String getForename() {
        return Forename;
    }

    public void setForename(String Forename) {
        this.Forename = Forename;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double Weight) {
        this.Weight = Weight;
    }

    public GregorianCalendar getBirth() {
        return Birth;
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
        this.Birth = calendar;
    }
    
    
}