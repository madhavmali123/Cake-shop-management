package com.bookStore.repository;

import com.bookStore.entity.MyBakeryList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBakeryRepository extends JpaRepository<MyBakeryList,Integer>{

}
