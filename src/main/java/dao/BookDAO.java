package dao;

import entity.Book;

import java.util.List;
//为什么有这个接口？
public interface BookDAO {
    Book getByName(String name);
    List<Book> getAll();
    void save(Book book);
    void remove(String name);
}
