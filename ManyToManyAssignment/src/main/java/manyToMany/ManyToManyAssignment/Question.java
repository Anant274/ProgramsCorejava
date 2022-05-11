package manyToMany.ManyToManyAssignment;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Question {
	
	@Id
	private Integer id;
	
	private Integer qno;
	
	private String qcontent;
	
	@ManyToMany
	private List<Answer> answer;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	


	

	public Question(Integer id, Integer qno, String qcontent, List<Answer> answer) {
		super();
		this.id = id;
		this.qno = qno;
		this.qcontent = qcontent;
		this.answer = answer;
	}







	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQno() {
		return qno;
	}

	public void setQno(Integer qno) {
		this.qno = qno;
	}

	public String getQcontent() {
		return qcontent;
	}

	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}

	

	

	public List<Answer> getAnswer() {
		return answer;
	}







	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}







	@Override
	public String toString() {
		return "Question [id=" + id + ", qno=" + qno + ", qcontent=" + qcontent + ", answer=" + answer + "]";
	}







	

	
	
	
	
	
	

}
