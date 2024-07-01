class Student {
    int rollno;
    String name;
    int marks;
}


public class ArrayObjects{
    public static void main(String a[]){

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Akash";
        s1.marks = 87;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Navin";
        s2.marks = 98;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Kumaran";
        s3.marks = 97;

        // It prints the Memory Address;
        System.out.println(s1); // prints => Student@4c1d9d4b

        // We need to create an array of type Student.
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++){
            // Variable must be a type of Student;
            Student stu = students[i];
            System.out.println(stu.name + " : " + stu.marks);
            // System.out.println(students[i].name + " : " + students[i].marks);
        }

        //Enhanced For Loop;
        // Simple than using the Normal For Loop;
        for(Student stu : students){
            System.out.println(stu.name + " : " + stu.marks);
        }

    }
}