import java.util.*;

class Student {
    String id;
    String firstName;
    double cgpa;

    public Student(String id, String firstName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.cgpa != s2.cgpa) {
            return Double.compare(s2.cgpa, s1.cgpa);
        } else if (!s1.firstName.equals(s2.firstName)) {
            return s1.firstName.compareTo(s2.firstName);
        } else {
            return s1.id.compareTo(s2.id);
        }
    }
}

public class java_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = scanner.next();
            String firstName = scanner.next();
            double cgpa = scanner.nextDouble();
            students.add(new Student(id, firstName, cgpa));
        }
        Collections.sort(students, new StudentComparator());
        for (Student s : students) {
            System.out.println(s.firstName);
        }
    }
}
