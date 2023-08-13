package com.example.shoppinglist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.shoppinglist.exception.ItemNotFoundException;
import com.example.shoppinglist.model.Item;
import com.example.shoppinglist.repository.ItemRepository;


@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    public Item updateItem(Long id, Item updatedItem) {
        Item existingItem = itemRepository.findById(id)
                .orElseThrow();
        
        existingItem.setName(updatedItem.getName());
        existingItem.setQuantity(updatedItem.getQuantity());
        existingItem.setPrice(updatedItem.getPrice());
        
        return itemRepository.save(existingItem);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
   
	public Item getItemById(Long id) {
		// TODO Auto-generated method stub

        return itemRepository.getItemById(id).orElseThrow(() 
        		-> new ItemNotFoundException("Unable to find the Item with ID: " + id));
    }
	}


