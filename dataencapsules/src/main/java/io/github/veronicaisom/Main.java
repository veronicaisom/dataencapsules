package io.github.veronicaisom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentInfo StudentOne = new StudentInfo();
        StudentOne.setFirstname("Veronica");
        StudentOne.setLastname("Isom");
        StudentOne.setDOBMonth(2);
        StudentOne.setDobDay(13);
        StudentOne.setdobYear(2003);

        System.out.println(StudentOne.getFirstname()+" "+StudentOne.getLastname());

        StudentInfo studentTwo = new StudentInfo(
                "Sam",
                "Art",
                3,
                23,
                2004

        );

        System.out.println(studentTwo.getFirstname()+" "+studentTwo.getLastname());

    }
}