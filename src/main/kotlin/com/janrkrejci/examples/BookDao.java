package com.janrkrejci.examples;

import com.datastax.oss.driver.api.mapper.annotations.Dao;
import com.datastax.oss.driver.api.mapper.annotations.Insert;
import com.example.janrkrejci.Books;

@Dao
public interface BookDao {

    @Insert
    void insert(Books.BookInfo bookInfo);
}
