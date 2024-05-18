package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.CarsDto;

public interface CarsRepo extends JpaRepository<CarsDto, Integer> {

}
