package i_spring_aop.service;

public interface BookService {
    public boolean buy(String userName, String bookName, double price);
    public void comment(String userName, String comments);
}
