import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Student student = new Student();

        System.out.println("Введите Ваш возраст:");
        Scanner sc = new Scanner(System.in);
        student.age = sc.nextInt();

        System.out.println("Введите Ваше имя:");
        student.name = sc.toString();
        student.setAge(student.age);
        student.setName(student.name);

        deserialize(student);


    }


    public void deserialize(Student student) {

    }
}
