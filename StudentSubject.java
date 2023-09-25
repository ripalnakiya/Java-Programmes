class Subject {
    private String name;
    private int maxMarks;

    public Subject(String name, int maxMarks) {
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String toString() {
        return "\nName: " + name + "\tMax Marks: " + maxMarks;
    }
}

class Student {
    private int rollNo;
    private String name;
    private String Department;
    private Subject subjects[];

    public Student(int rollNo, String name, String Department, String... subs) {
        this.rollNo = rollNo;
        this.name = name;
        this.Department = Department;
        this.subjects = new Subject[subs.length];
        int i = 0;
        for (String s : subs) {
            subjects[i++] = new Subject(s, 100);
        }
    }

    public String toString() {

        // adding the Subject object to the string
        StringBuilder sb = new StringBuilder("");
        for (Subject s : subjects) {
            sb.append(s.toString());
        }

        // returning the Student object, along with the value of Array of Subject
        // objects
        return "\nRoll no: " + rollNo + "\nName: " + name + "\nDepartment: " + Department + "\nSubjects: " + sb;
    }
}

public class StudentSubject {
    public static void main(String[] args) {

        // Creating Array of Student Objects
        Student studs[] = new Student[args.length];

        // Initializing all the references of Student object
        int i = 0;
        for (String str : args) {
            studs[i++] = new Student(i, str, "CSE", "CPP", "Java", "Python");
        }

        // Displaying data of all Student objects
        for (Student s : studs) {
            System.out.println(s);
        }
    }
}
