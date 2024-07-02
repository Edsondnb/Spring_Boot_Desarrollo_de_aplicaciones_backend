package com.company.books.backend.apirest_books.model.dao;

import com.company.books.backend.apirest_books.model.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface ICategoriaDao extends CrudRepository<Categoria, Long> {

}
