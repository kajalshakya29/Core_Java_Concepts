import java.util.*;

public final class Student {

    private final String name;
    private final int age;
    private final List<String> subjects;

    public Student(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = new ArrayList<>(subjects); // defensive copy
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSubjects() {
        return new ArrayList<>(subjects); // return copy
    }

    // Main method to test
    public static void main(String[] args) {

        List<String> subjectList = new ArrayList<>();
        subjectList.add("Math");
        subjectList.add("Science");

        // Create object
        Student student = new Student("Kajal", 21, subjectList);

        // Print initial values
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Subjects: " + student.getSubjects());

        // Modify original list
        subjectList.add("English");

        System.out.println("\nAfter modifying original list:");
        System.out.println("Subjects: " + student.getSubjects());

        // Try modifying via getter
        List<String> subjectsFromGetter = student.getSubjects();
        subjectsFromGetter.add("History");

        System.out.println("\nAfter modifying getter list:");
        System.out.println("Subjects: " + student.getSubjects());
    }
}