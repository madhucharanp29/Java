public class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getMarks() { return marks; }

    public String toFileString() {
        return id + "," + name + "," + marks;
    }

    public static Student fromFileString(String line) {
        String[] parts = line.split(",");
        return new Student(
            Integer.parseInt(parts[0]),
            parts[1],
            Double.parseDouble(parts[2])
        );
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}
