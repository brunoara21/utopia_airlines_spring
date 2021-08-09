package com.smoothstack.utopia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopia.dao.AuthorDao;
import com.smoothstack.utopia.model.Author;

@Service
public class AuthorService {

	@Autowired
	private AuthorDao authorDao;

	public Author getAuthorById(int authorId) {
		return authorDao.getAuthorById(authorId);
	}
	
	public void addAuthor(Author author) {
		authorDao.addAuthor(author);
	}

}
