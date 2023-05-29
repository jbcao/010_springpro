package i_spring_aop.service.impl;


import i_spring_aop.service.BookService;

public class BookServiceImpl implements BookService {
    @Override
    public boolean buy(String userName, String bookName, double price) {
        System.out.println("购买图书功能实现...........");
        System.out.println(userName+"购买了"+bookName+",花费了"+price+"元.");
        System.out.println(userName+"增加了"+(price/10));
        System.out.println("图书购买业务结束");
        return false;
    }

    @Override
    public void comment(String userName, String comments) {
        System.out.println("评论功能的实现 ...........");
        System.out.println(userName+"发表了"+comments+".");
        System.out.println("评论功能结束 ...........");
    }
}
