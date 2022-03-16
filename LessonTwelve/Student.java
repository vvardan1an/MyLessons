package LessonTwelve;

public class Student {
    String name;
    String surname;
    int course;
    int point;

    Student(String name, String surname, int course, int point) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.point = point;
    }

    public void compareStudent(Student c1 , Student c2){
        if(c1.name == c2.name && c1.surname == c2.surname && c1.course == c2.course && c1.point == c2.point){
            System.out.println("Student's match!!");
        }else {
            System.out.println("Student don't match");
        }
    }


    public void compareSt (Student s1 , Student s2){
        if(s1.name != s2.name){
            System.out.println("Names don't match !");
        }else if(s1.surname != s2.surname){
            System.out.println("Surnames don't match !");
        }else if(s1.course != s2.course){
            System.out.println("Course don't match !");
        }else if(s1.point != s2.point){
            System.out.println("Point don't match !");
        }else{
            System.out.println("Student's match");
        }
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Ann" , "Green" , 1 ,9);
        Student st2 = new Student("Ann" , "Smith" , 1 ,9);
        st1.compareSt(st1 ,st2);
        st1.compareStudent(st1,st2);
    }
}
