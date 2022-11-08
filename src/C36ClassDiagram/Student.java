package C36ClassDiagram;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

public class Student extends Person{

	private Long studentId;
	private String major;
	private List<Subject> subjectList;
	
	
	public Student(
			String name, 
			int age, 
			String address,
			Long Id,			//추가로 확장 생성
			String major
			){
		super(name, age, address);
		this.studentId = Id;
		this.major = major;
		this.subjectList = new ArrayList;
		
	}
	public void study() {}
	
	public void addSubject(Lecture lec)	{
		subjectList.add(lec);
		lec.addStudent(this);
		// 내 수업과목 리스트에 가목추가하기
		// Subject에 학생정보 전달
		
		// subjectList Lecture 추가
		// Lecture에 student 추가
	}
	@Override
	public String toString() {
		return "[studentId=" + studentId  + "]";
	}
	

}
