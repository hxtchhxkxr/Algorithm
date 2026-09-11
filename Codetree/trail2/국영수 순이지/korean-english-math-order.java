import java.util.*;

class Student {
    String name;
    int korean;
    int english;
    int math;

    public Student(String name, int korean, int english, int math){
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int korean = sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();

            students[i] = new Student(name, korean, english, math);
        }

        Arrays.sort(students, (s1, s2) -> {
            if(s1.korean == s2.korean){
                if(s1.english == s2.english){
                    return s2.math - s1.math;
                }
                return s2.english - s1.english;
            }
            return s2.korean - s1.korean;
        });

        for(int i=0; i<n; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].korean + " ");
            System.out.print(students[i].english + " ");
            System.out.println(students[i].math);
        }
    }
}