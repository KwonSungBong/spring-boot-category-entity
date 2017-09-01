package com.example.category;

import com.example.category.entity.Category;
import com.example.category.entity.CategoryComponent;
import com.example.category.entity.CategoryComposite;
import com.example.category.entity.CategoryLeaf;
import com.example.category.repository.CategoryComponentRepository;
import com.example.category.repository.CategoryRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class CategoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoryApplication.class, args);
	}

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private CategoryComponentRepository categoryComponentRepository;

	@Bean
	@Transactional
	public InitializingBean localInitializingBean() {
		return () -> {
			Category category1 = new Category();
			category1.setName("category1");
			Category category2 = new Category();
			category2.setName("category2");
			Category category3 = new Category();
			category3.setName("category3");

			Category category31 = new Category();
			category31.setName("category31");
			Category category32 = new Category();
			category32.setName("category32");
			Category category33 = new Category();
			category33.setName("category33");
			Category category34 = new Category();
			category34.setName("category34");
			Category category35 = new Category();
			category35.setName("category35");
			Category category36 = new Category();
			category36.setName("category36");
			Category category37 = new Category();
			category37.setName("category37");

			Category category4 = new Category();
			category4.setName("category4");
			Category category5 = new Category();
			category5.setName("category5");
			categoryRepository.save(category5);
			category4.setParent(category5);
			categoryRepository.save(category4);
			category3.setParent(category4);
			categoryRepository.save(category3);

			category31.setParent(category4);
			categoryRepository.save(category31);
			category32.setParent(category4);
			categoryRepository.save(category32);
			category33.setParent(category4);
			categoryRepository.save(category33);
			category34.setParent(category4);
			categoryRepository.save(category34);
			category35.setParent(category4);
			categoryRepository.save(category35);
			category36.setParent(category4);
			categoryRepository.save(category36);
			category37.setParent(category4);
			categoryRepository.save(category37);

			category2.setParent(category3);
			categoryRepository.save(category2);
			category1.setParent(category2);
			categoryRepository.save(category1);

			/*****************************************************************/
			/*****************************************************************/
			/*****************************************************************/

			CategoryComponent categoryComposite1 = new CategoryComposite();
			categoryComposite1.setName("categoryComposite1");
			CategoryComponent categoryComposite2 = new CategoryComposite();
			categoryComposite2.setName("categoryComposite2");
			CategoryComponent categoryLeaf1 = new CategoryLeaf();
			categoryLeaf1.setName("categoryLeaf1");
			CategoryComponent categoryLeaf2 = new CategoryLeaf();
			categoryLeaf2.setName("categoryLeaf2");
			CategoryComponent categoryLeaf3 = new CategoryLeaf();
			categoryLeaf3.setName("categoryLeaf3");
			CategoryComponent categoryLeaf4 = new CategoryLeaf();
			categoryLeaf4.setName("categoryLeaf4");
			CategoryComponent categoryLeaf5 = new CategoryLeaf();
			categoryLeaf5.setName("categoryLeaf5");

			categoryComponentRepository.save(categoryComposite1);
			categoryComponentRepository.save(categoryComposite2);

			categoryLeaf1.setParent(categoryComposite1);
			categoryLeaf2.setParent(categoryComposite1);
			categoryLeaf3.setParent(categoryComposite2);
			categoryLeaf4.setParent(categoryComposite2);
			categoryLeaf5.setParent(categoryComposite2);

			categoryComponentRepository.save(categoryLeaf1);
			categoryComponentRepository.save(categoryLeaf2);
			categoryComponentRepository.save(categoryLeaf3);
			categoryComponentRepository.save(categoryLeaf4);
			categoryComponentRepository.save(categoryLeaf5);

		};
	}

}
