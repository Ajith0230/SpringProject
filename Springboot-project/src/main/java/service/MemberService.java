package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ResponseStructure.ResponseStructure;
import dto.MembersDto; 
import dao.MemberDao;

@Service
public class MemberService {

	@Autowired
	MemberDao memberdao;
	
	public ResponseEntity<ResponseStructure<MembersDto>> saveMember(MembersDto member)
	{
		ResponseStructure<MembersDto> structue = new ResponseStructure<MembersDto>();
		structue.setData(member);
		structue.setMessage("Member saved successfully");
		structue.setStatus(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<MembersDto>>(structue,HttpStatus.CREATED);
	}
}
