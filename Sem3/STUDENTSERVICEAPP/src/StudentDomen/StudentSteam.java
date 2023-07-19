package StudentDomen;


import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<Group>{
    private List<Group> steam;

    public StudentSteam(List<Group> steam) {
        this.steam = steam;
    }

    public void setStudentSteam(List<Group> steam) {
        this.steam = steam;
    }

    public List<Group> getStudentSteam() {
        return steam;
    }

    @Override
    public Iterator<Group> iterator() {
        return new Iterator<Group>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index<steam.size();
            }
            @Override
            public Group next() {
                if(!hasNext())
                {
                    return null;
                }
                return steam.get(index++);
            }
        };
    }

    

    // @Override
    // public Iterator<Student> iterator() {
    //     return new StudentGroupIterator(students);
    // }

    
}