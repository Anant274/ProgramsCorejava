package Book.BookRecordHibernateApplication;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_id")
	private int id;
    @Column(name="title")
	private String bname;
    @Column(name="published")
	private String aname;
    
	@OneToOne
	@JoinColumn(name="author_id")
	private Author author;
	
	public Book( String bname, String aname) {
	
		this.bname = bname;
		this.aname = aname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	
	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + ", aname=" + aname + "]";
	}
	

	
	
}
