import java.util.Comparator;

/**
 * @author Tan
 * @description Soft By Namen increa
 * @email ndtan.hcm @ gmail.com.vn
 */
public class SortStudentByName implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}