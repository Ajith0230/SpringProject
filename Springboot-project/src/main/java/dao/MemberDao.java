package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dto.MembersDto;
import repository.MemberRepo;

@Repository
public class MemberDao {
	
	@Autowired
	MemberRepo repo;
	
	public MembersDto savemember(MembersDto member)
	{
		return repo.save(member);
	}

}
