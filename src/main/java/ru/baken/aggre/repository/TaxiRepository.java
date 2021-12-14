package ru.baken.aggre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.baken.aggre.entity.Taxi;

public interface TaxiRepository extends JpaRepository<Taxi, Integer>
{
}
