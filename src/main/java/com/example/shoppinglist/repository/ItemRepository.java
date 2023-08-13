package com.example.shoppinglist.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.shoppinglist.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
	@Transactional   
	void deleteItemById(Long id);

        Optional<Item> getItemById(Long id);
			
		}

