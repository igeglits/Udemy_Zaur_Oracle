package urok12;
import urok_4.Student;

class StudentTest {
    static Student st1=new Student(1,"Ivan", 1998);
    static Student st2=new Student(2,"Petr", 1998);

    static void toCompareSt(Student student1, Student student2){
        if(student1.equals(student2)){
            System.out.println("Студент один и тот же");
        }else {
            System.out.println("Студенты разные");
        }
    }
    static void toSeparateCompare(Student student1, Student student2){
        if (student1.getStudentID()== student2.getStudentID()){
            if(student1.getName().equals(student2.getName())){
                if(student1.getYear()==student2.getYear())
                    System.out.println("Студент один и тот же");
            }
        }else {
            System.out.println("Студенты разные");
        }
    }

    public static void main(String[] args) {
        System.out.println("1 method");
        toCompareSt(st1,st2);
        System.out.println("2 method");
        toSeparateCompare(st1, st2);
    }
}
