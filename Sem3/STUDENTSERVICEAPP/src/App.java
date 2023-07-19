
import StudentDomen.User;
import StudentDomen.Group;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        User u1 = new User("Сергей", "Иванов", 25);
        Student s1 = new Student("Сергей", "Иванов", 23, (long) 1);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long) 20);
        Student s3 = new Student("Иван", "Петров", 21, (long) 21);
        Student s4 = new Student("Игорь", "Иванов", 45, (long) 31);
        Student s5 = new Student("Даша", "Цветкова", 35, (long) 40);
        Student s6 = new Student("Лена", "Незабутка", 27, (long) 51);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s3);
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        StudentGroup group = new StudentGroup(listStud);

        Group group_1 = new Group(1, listStud1, 2);
        Group group_2 = new Group(2, listStud2, 4);
        List<Group> groups = new ArrayList<Group>();
        groups.add(1, group_1);
        groups.add(2, group_2);
        StudentSteam studentSteam = new StudentSteam(groups);
        
        for (Group groups_1: studentSteam)
        {
            System.out.println(groups_1);
        }
        
        // for (Student stud: group)
        // {
        //     System.out.println(stud);
        // }
        
        // System.out.println("================= после сортировки ===============");
        // Collections.sort(group.getStudents());

        // for (Student stud: group)
        // {
        //     System.out.println(stud);
        // }
        
        
        
        
        // System.out.println(u1);
        // System.out.println(s1);
        System.out.println(group);
    }
    



    }
