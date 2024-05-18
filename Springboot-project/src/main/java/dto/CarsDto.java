package dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
@Component
public class CarsDto {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String carname;
	
	private int number;
	
	private int seater;
	
	private String type;
	
	@OneToOne(cascade = CascadeType.ALL)
	MembersDto member;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSeater() {
		return seater;
	}

	public void setSeater(int seater) {
		this.seater = seater;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public MembersDto getMember() {
		return member;
	}

	public void setMenber(MembersDto member) {
		this.member = member;
	}
	
	
}
