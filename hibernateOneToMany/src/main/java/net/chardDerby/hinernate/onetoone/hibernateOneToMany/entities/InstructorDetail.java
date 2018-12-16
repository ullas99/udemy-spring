package net.chardDerby.hinernate.onetoone.hibernateOneToMany.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="hobby")
	private String hobby;
	
	@Column(name="youtube_channel")
	private String youTubeChannel;
	
	@OneToOne(mappedBy="instructorDetail" ,
				cascade={CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
	private Instructor instructor;
	
	public InstructorDetail() {
		// TODO Auto-generated constructor stub
	}

	public InstructorDetail(String hobby, String youTubeChannel) {
		super();
		this.hobby = hobby;
		this.youTubeChannel = youTubeChannel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getYouTubeChannel() {
		return youTubeChannel;
	}

	public void setYouTubeChannel(String youTubeChannel) {
		this.youTubeChannel = youTubeChannel;
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", hobby=" + hobby + ", youTubeChannel=" + youTubeChannel + "]";
	}
	
	

}
