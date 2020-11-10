package com.webapp.springLibrery1.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.webapp.springLibrery1.model.Author;
import com.webapp.springLibrery1.model.Book;
import com.webapp.springLibrery1.model.Publisher;
import com.webapp.springLibrery1.repositories.AuthorRepository;
import com.webapp.springLibrery1.repositories.BookRepository;
import com.webapp.springLibrery1.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	
	
	public DevBootstrap(AuthorRepository authorRepository , BookRepository bookRepository , PublisherRepository publisherRepository) {
		
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		initData();
	}
	
	public void initData() {
		
		//Eric
		Author eric = new Author("eric", "gamma");
		Publisher publisher = new Publisher("konami", "zomo");
		publisherRepository.save(publisher);
		
		Book ddd =  new Book("save me", "looka", publisher);
		
		
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
		
		authorRepository.save(eric);
		bookRepository.save(ddd);
		
		
	}
	 
}
