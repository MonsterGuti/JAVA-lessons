package lab1;

public class Student {
    public String name;
    public String facultyNumber;
    public static int totalStudents = 0;

    public Student(String name, String facultyNumber) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        totalStudents++;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Faculty Number: " + facultyNumber);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Martin Gogulanov", "12345");
        Student s2 = new Student("Ivelin Belovezhdov", "67890");

        s1.printInfo();
        s2.printInfo();

        System.out.println("Total Students: " + Student.getTotalStudents());
    }
}
