import java.util.HashSet;
public class Student {
    String name;
    int rollno;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    
}


public class createhashclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<Student> s11=new HashSet<Student>();
        Student s1= new Student("Rohith",24);
        Student s2= new Student("Lohith",25);
        s11.add(s1);
        s11.add(s2);
        System.out.println(s11);
    }
    
}