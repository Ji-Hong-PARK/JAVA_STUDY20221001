package C36ClassDiagram;

import java.util.List;

public interface Lecture {
	
	private Long lectureIf;
	private String subbjectName;
	private List<Strudent> studentList;
	
	
	
	
	
	public void addStudent(Student std) {
		//학생을 StdentList 에 추가.
		studentList.add(std);
	}
	

}
