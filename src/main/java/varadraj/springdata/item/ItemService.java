package varadraj.springdata.item;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepo;

	public List<Item> getAllItems() {
		List<Item> items = new ArrayList<>();
		itemRepo.findAll().forEach(items::add);
		return items;
	}

	public void addItem(Item item) {
		itemRepo.save(item);	
	}
	
	public void deleteItem(long id) {
		itemRepo.delete(id);
	}
	
	public Item getItem(long id) {
		return itemRepo.findOne(id);
	}
	
	public void updatePrice(Item item) {
		itemRepo.save(item);
	}
	
}
