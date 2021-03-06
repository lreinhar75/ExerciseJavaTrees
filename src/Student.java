import java.util.Comparator;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private char sex;
    public Student (String n, int a, char s ){
        this.name = n;
        this.age = a;
        this.sex = s;
    }
    public String getName(){ return name;}
    public char getSex(){ return sex;}
    public int getAge(){ return age;}

@Override
   public int compareTo(Student otherStudent) {
        return this.name.compareTo(otherStudent.name);
   }
}

class AgeComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2)
    {
        if(s1.getAge()>s2.getAge())
            return 1;
        if (s1.getAge()<s2.getAge())
            return -1;
        return 0;
    }
}