package io.github.veronicaisom;

public class StudentInfo {
    private String firstname;
    private String lastname;
    private int dobMonth;
    private int dobDay;
    private int dobYear;

    public StudentInfo(){}

    public StudentInfo(
            String firstname,
        String lastname,
        int dobMonth,
        int dobDay,
        int dobYear
            ){


        this.firstname = firstname;
        this.lastname = lastname;
        this.dobDay = dobDay;
        this.dobMonth = dobMonth;
        this.dobYear = dobYear;
    }
        //getters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getFirstname(){
        return this.firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getLastname() {
        return this.lastname;
    }

    public void setDOBMonth(int month) {
        this.dobMonth = month;
    }
    public int getDobMonth(){
        return this.dobMonth;
    }
    public void setDobDay(int day){
        this.dobDay = day;
    }
    public int getDobDay(){
        return this.dobDay;
    }
    public void setdobYear(int year) {
        this.dobYear = year;
    }

    public int getDobYear(){
        return this.dobYear;
    }



}
