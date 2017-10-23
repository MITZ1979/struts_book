package action;

import dao.BookDAO;
import dao.impl.MemoryBookDAO;
import entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookAction {

    private BookDAO bookDAO = new MemoryBookDAO();

    //初始化书籍信息
    public String bookinit() throws Exception{
        bookDAO.save(new Book("java 编程思想",222F));
        bookDAO.save(new Book("JS Good Part", 22F));
        bookDAO.save(new Book("Spring in Action", 33F));
        bookDAO.save(new Book("南方it学院Oracle",9293F));
        return "success";
    }

    //读取书籍列表
    private List<Book> books = new ArrayList<>();
    public String booklist() throws Exception{
        books = bookDAO.getAll();
        return "success";
    }

    // 删除书集
    private String booName;
    public String bookdel() throws Exception{
        bookDAO.remove(booName);
        return "success";
    }

    //增加书籍
    private Book book;
    public String booksave() throws Exception{
        bookDAO.save(book);
        return "success";
    }

    public List<Book> getBooks(){
        return books;
    }

    public void setBooks(List<Book> books){
        this.books = books;
    }

    public String getBookName(String bookName){
        return bookName;
    }
    
    public void setBookName(String bookName){
        this.booName = bookName;
    }

    public Book getBook(){
        return book;
    }

    public void setBook(Book book){
        this.book = book;
    }
    
}
