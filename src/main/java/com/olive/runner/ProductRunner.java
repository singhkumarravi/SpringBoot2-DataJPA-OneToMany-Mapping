package com.olive.runner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.model.Model;
import com.olive.model.Product;
import com.olive.repo.ModelRepo;
import com.olive.repo.ProductRepo;

@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired
	private ModelRepo mrepo;
	@Autowired
	private ProductRepo prepo;

	public void run(String... args) throws Exception {
		             Model m1=new Model(101, "M3A4", "RED", 2000.0);
		             Model m2=new Model(102, "M4A", "BLUE", 4000.0);
		             Model m4=new Model(104, "A2", "BLUE", 4000.0);
		             Model m3=new Model(103, "A1", "RED", 10000.0);
		             Set<Model> m=new HashSet<Model>();
		             Set<Model> m0=new HashSet<Model>();
		             m0.add(m1);
		             m0.add(m3);
		             
		             m.add(m2);
		             m.add(m4);
		            
                    mrepo.saveAll(m);
                    mrepo.saveAll(m0);
                   
                    
                    prepo.save(new Product(10, "VIVO-Mobile", "Ravi Kumar",m));
                    prepo.save(new Product(20, "LAVA-Mobile", "Manoj Kumar",m0));
                    
                    System.out.println("Fetching Record ::***************");
                    mrepo.findAll().forEach(System.out::println);
                   
	}
}
