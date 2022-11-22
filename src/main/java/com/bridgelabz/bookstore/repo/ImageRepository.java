package com.bridgelabz.bookstore.repo;

import com.bridgelabz.bookstore.model.Image;

public interface ImageRepository {

	public void addImage(Image image);

	public Image findByName(Long id);
}
