import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class StudentGroup implements Comparable<StudentGroup> {
    private String name;
    private int numberOfStudents;

    public StudentGroup(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public int compareTo(StudentGroup group) {
        return Integer.compare(this.numberOfStudents, group.numberOfStudents);
    }
}

class StudentSteam implements Iterable<StudentGroup> {
    private int streamNumber;
    private List<StudentGroup> groups;

    public StudentSteam(int streamNumber) {
        this.streamNumber = streamNumber;
        this.groups = new ArrayList<>();
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    public void setStreamNumber(int streamNumber) {
        this.streamNumber = streamNumber;
    }

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }
}

public class Main {
    public static void main(String[] args) {
        StudentSteam stream = new StudentSteam(1);
        StudentGroup group1 = new StudentGroup("Group 1", 30);
        StudentGroup group2 = new StudentGroup("Group 2", 25);
        StudentGroup group3 = new StudentGroup("Group 3", 20);
        stream.addGroup(group1);
        stream.addGroup(group2);
        stream.addGroup(group3);

        for (StudentGroup group : stream) {
            System.out.println("Group name: " + group.getName() + ", number of students: " + group.getNumberOfStudents());
        }

        Collections.sort(stream, Collections.reverseOrder());

        System.out.println("Groups sorted by number of students:");
        for (StudentGroup group : stream) {
            System.out.println("Group name: " + group.getName() + ", number of students: " + group.getNumberOfStudents());
        }
    }
}
