package com.bookStore.repository;

import com.bookStore.entity.Bakery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BakeryRepository extends JpaRepository<Bakery,Integer>  {

}
