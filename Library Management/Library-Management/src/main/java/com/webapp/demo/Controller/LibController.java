package com.webapp.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.webapp.demo.dao.LibDao;
import com.webapp.demo.Library.LibraryClass;
@RestController
public class LibController {
	
	@Autowired
	LibDao dao;
	@RequestMapping("/saveBook")
	@ResponseBody
	public void saveBook(@RequestParam String bId,@RequestParam String quantity ,@RequestParam String bName,@RequestParam String genre,LibraryClass obj) {
	
		
		obj.setBookId(bId);
		obj.setBookName(bName);
		obj.setGenre(genre);
		obj.setQuantity(quantity);
		System.out.println("book saved");
		dao.save(obj);
	}
	
	@RequestMapping("/getByType")
	@ResponseBody
	public List<LibraryClass> getByType(@RequestParam String genre,LibraryClass obj) {
		
		return dao.getByType(genre);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public void deleteById(@RequestParam String id) {
	
		 dao.delete(id);
		 System.out.println("deleted");
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public void updateById(@RequestParam String id,@RequestParam String bname) {
		
		 dao.update(id, bname);
		 System.out.println("updated");
	}
	
	@RequestMapping("/getAll")
	@ResponseBody
	public List<LibraryClass> getAll() {
		
		 return dao.findAll();
		 
	}
	
	
	
}