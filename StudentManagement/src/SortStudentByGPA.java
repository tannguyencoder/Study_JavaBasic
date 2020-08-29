import java.util.Comparator;

/**
 * @author Tan
 * @description Sort by GPA
 * @email ndtan.hcm @ gmail.com.vn
 */
public class SortStudentByGPA implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		if(student1.getGpa() >student2.getGpa()) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
