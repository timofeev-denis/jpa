package ru.code4fun.demo.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.code4fun.demo.jpa.domain.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
