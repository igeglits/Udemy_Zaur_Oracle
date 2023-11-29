package urok_4;

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentID = 122;
        student1.averageEconomicMark = 7;
        student1.averageMathMark = 9;
        student1.family = "Sidorov";
        student1.foreignLangAverageMark = 6;
        student1.name = "Ivan";
        student1.year = 2;
        System.out.println("Student ID "+ student1.studentID);
        System.out.println("name " + student1.name + '\n'
                + "family " + student1.family + '\n'
                + "year " + student1.year + '\n'
                + "average Economic grade " + student1.averageEconomicMark + '\n'
                + "average Math Grade " + student1.averageMathMark + '\n'
                + "foreign Languge Grade " + student1.foreignLangAverageMark);
    }
}
