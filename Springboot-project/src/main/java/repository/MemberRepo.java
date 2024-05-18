package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dto.MembersDto;


public interface MemberRepo extends JpaRepository<MembersDto, Integer> {

}
