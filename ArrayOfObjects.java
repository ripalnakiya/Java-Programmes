class Subject {
    private String name;
    private int maxMarks;

    public Subject(String name, int maxMarks) {
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String toString() {
        return "\nName: " + name + "\nMax Marks: " + maxMarks;
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        // This only creates 3 references for the objects, It doesn't create the objects
        Subject subs[] = new Subject[3];

        // We need to create objects explicitly, from the heap.
        subs[0] = new Subject("Cpp", 100);
        subs[1] = new Subject("Java", 100);
        subs[2] = new Subject(".NET", 50);

        for (Subject sub : subs) {
            System.out.println(sub);
        }
    }
}