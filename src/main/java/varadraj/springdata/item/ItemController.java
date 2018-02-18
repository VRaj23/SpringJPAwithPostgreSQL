package varadraj.springdata.item;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/")
	public List<Item> getAllItems(){
		return itemService.getAllItems();
	}
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public void addItem(@RequestBody Item item) {
		itemService.addItem(item);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Item getItem(@PathVariable long id) {
		return itemService.getItem(id);
	}
	
	@RequestMapping(value="/",method=RequestMethod.PUT)
	public void updatePrice(@RequestBody Item item) {
		itemService.updatePrice(item);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void deleteItem(@PathVariable long id){
		itemService.deleteItem(id);
	}
}
