import java.util.*;
import java.util.stream.Collectors;



class Student{
    String name;
    String dept;

    public Student(String name,String dept){
        this.name=name;
        this.dept=dept;

    }

    public String toString(){
        return name;
    }
}


public class Stream_mapcount{
    public static void main(String[] args){
        List<Student>students=Arrays.asList(
            new Student("Venkat","CS"),
            new Student("Madhu","ECE"),
            new Student("Arpan","ECE"),
            new Student("Kunal","CS")
        );



        Map<String,List<Student>> departmenttoStudents=students.stream()
                                    .collect(Collectors.groupingBy(student -> student.dept));

        System.out.println("Department to Student Map:");
        departmenttoStudents.forEach((dept, list) -> 
        System.out.println(dept + ": "+ list));

        Map<String,Long> departmenttoCount=students.stream()
                        .collect(Collectors.groupingBy(student -> student.dept, Collectors.counting()));


        System.out.println("\nDepartment to Student Count:");
        departmenttoCount.forEach((dept, count) -> 
            System.out.println(dept + ": " + count));
    }
}