import java.io.IOException;
import java.util.Scanner;

public class Student {

    int age;
    String name;
    double scholarshipAmount;

    public void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Вам меньше 18 лет");
        }

        this.age = age;
    }

    public void setName(String name) {
        if (name == null && name.length() == 0) {
            throw new IllegalArgumentException("Поле для имени не содержит никакой информации");
        }

        this.name = name;
    }


    public void setScholarshipAmount(double scholarshipAmount) {
        this.scholarshipAmount = scholarshipAmount;
        if (scholarshipAmount == 0) {
        }

    }
}