package StudentDomen;

import java.util.List;

public class Group implements Comparable<Group> {
    private int groupNumber;
    private List<Student> stud;
    private int studentsNumber;

    public Group(int groupNumber, List<Student> stud, int studentsNumber){
        this.groupNumber = groupNumber;
        this.stud = stud;
        this.studentsNumber = studentsNumber;
    }

    public int getGroupNumber(){
        return groupNumber;
    }

    public int getStudentsNumber(){
        return studentsNumber;
    }

    public Student getStud(){
        for (Student stud1: stud){
            return stud1;
        }
        return null;
    }

    public void setGroupNumber(int groupNumber){
        this.groupNumber = groupNumber;
    }

    public void setStudentsNumber(int studentsNumber){
        this.studentsNumber = studentsNumber;
    }

    public void setStud( List<Student> stud){
        this.stud = stud;
    }
    @Override
    public String toString() {
        return "StudentStem{"  
                + ", student group=" + getGroupNumber() +
                "student" + getStud()+
                "student's number" + getStudentsNumber()+
                '}';
    }

    @Override
    public int compareTo(Group o) {
        System.out.println(getGroupNumber() + " - " + o.getStudentsNumber());
        if (this.studentsNumber==o.studentsNumber)
        {
            return 0;
        }
        if (this.studentsNumber<o.studentsNumber)
        {
        return -1;
        }
            return 1;
        }
    }

