package Ch36ClassDiagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture {
	private Long lectureId;
	private String subjectName;
	private List<Student> studentList;
	
	
	
	public Lecture(Long lectureId, String subjectName) {
		super();
		this.lectureId = lectureId;
		this.subjectName = subjectName;
		this.studentList = new ArrayList();
	}



	public void addStudent(Student std) {
		studentList.add(std);		//학생을 studentList에 추가
	}



	@Override
	public String toString() {
		StringBuffer buff = new StringBuffer();
		for(Student std : studentList)
		{
			buff.append(std.toString());
		}

		return 
				"[과목ID : "+lectureId + "\t|과목명 : " + subjectName + "\t|수강신청 학생 :"+buff+"]";
		
	}
	
	
}
