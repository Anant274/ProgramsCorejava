package manyToMany.ManyToManyAssignment;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Answer {
	@Id
	private Integer id;
	
	private Integer ano;
	
	@ManyToMany(mappedBy = "answer")
	private List<Question> question;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(Integer id, Integer ano, List<Question> question) {
		super();
		this.id = id;
		this.ano = ano;
		this.question = question;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public List<Question> getQuestion() {
		return question;
	}

	public void setQuestion(List<Question> question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", ano=" + ano + ", question=" + question + "]";
	}
	
	
	

}
