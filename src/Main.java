import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Do tree with strings: "structure","love","binary","we","data","and","trees");
        // Make treeset with the above strings
        // Different ways to access
        TreeSet<String> MyStringTreeSet = new TreeSet<String>();
        MyStringTreeSet.add("structure");
        MyStringTreeSet.add("love");
        MyStringTreeSet.add("binary");
        MyStringTreeSet.add("we");
        MyStringTreeSet.add("data");
        MyStringTreeSet.add("and");
        MyStringTreeSet.add("trees");
        Iterator iterator=MyStringTreeSet.iterator();
        while ((iterator.hasNext()))
            System.out.print(iterator.next() + " ");
               // Do tree map with key name and value student.
        Student A = new Student("Albert", 23, 'M');
        Student B = new Student("Berta", 22, 'F');
        Student C = new Student("Benjamin", 17, 'M');
        Student D = new Student("Robert", 27, 'M');
        Student E = new Student("Ulla", 26, 'F');
        Student F = new Student("Aisha", 14, 'F');
        System.out.println("Sort students by name");
        TreeSet<Student> MyStudentTreeSetSortbyName = new TreeSet<Student>();
        MyStudentTreeSetSortbyName.add(A);
        MyStudentTreeSetSortbyName.add(B);
        MyStudentTreeSetSortbyName.add(C);
        MyStudentTreeSetSortbyName.add(D);
        MyStudentTreeSetSortbyName.add(E);
        MyStudentTreeSetSortbyName.add(F);
        iterator = MyStudentTreeSetSortbyName.iterator();
        while (iterator.hasNext())
        {
            Student curStudent =(Student) iterator.next();
            System.out.println( curStudent.getName() + ", "+ curStudent.getAge()+ ", " + curStudent.getSex()  );
        }

        System.out.println("Sort students by Age");
        TreeSet<Student> MyStudentTreeSetSortbyAge = new TreeSet<Student>(new AgeComparator());
        MyStudentTreeSetSortbyAge.add(A);
        MyStudentTreeSetSortbyAge.add(B);
        MyStudentTreeSetSortbyAge.add(C);
        MyStudentTreeSetSortbyAge.add(D);
        MyStudentTreeSetSortbyAge.add(E);
        MyStudentTreeSetSortbyAge.add(F);
        iterator = MyStudentTreeSetSortbyAge.iterator();
        while (iterator.hasNext())
        {
            Student curStudent =(Student) iterator.next();
            System.out.println( curStudent.getName() + ", "+ curStudent.getAge()+ ", " + curStudent.getSex()  );
        }
        System.out.println("Tree Map sorting by key which is string name");
        TreeMap<String, Student> MyTreeMapSortbyKeyStringName = new TreeMap<>();
        MyTreeMapSortbyKeyStringName.put("Albert",A);
        MyTreeMapSortbyKeyStringName.put("Aisha",F);
        MyTreeMapSortbyKeyStringName.put("Benjamin",C);
        MyTreeMapSortbyKeyStringName.put("Ulla",E);
        MyTreeMapSortbyKeyStringName.put("Robert",D);
        MyTreeMapSortbyKeyStringName.put("Berta",B);
        iterator=MyTreeMapSortbyKeyStringName.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Student> e =(Map.Entry<String,Student>) iterator.next();
            System.out.println(" Key: " + e.getKey() + " Value (Student): " + e.getValue().getName()
                    + ", "+ e.getValue().getAge()+ ", " + e.getValue().getSex() );
        }

        // insert into Map
        // Using entrySet() to get the set view

    }
}