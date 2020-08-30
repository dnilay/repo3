package com.example.unittesting.unittesting.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.unittesting.unittesting.model.Item;

@DataJpaTest
public class ItemRepositoryTest {
	
	@Autowired
	private ItemRepository repository;
	
	@Test
	public void testFindAll() {
		List<Item> items = repository.findAll();
		assertEquals(5,items.size());
	}

	@Test
	public void testFindOne() {
		Item item = repository.findById(10001).get();
		
		assertEquals("Item2",item.getName());
	}

}
