package com.bridgelabz.bookstore.repo;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgelabz.bookstore.model.Image;
import com.bridgelabz.bookstore.model.Role;
import com.bridgelabz.bookstore.model.User;

@Repository
@Transactional
public class ImageRepositoryImpl implements ImageRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addImage(Image image) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(image);

	}

	@Override
	public Image findByName(Long id) {

		return sessionFactory.getCurrentSession().get(Image.class, id);

	}

}
