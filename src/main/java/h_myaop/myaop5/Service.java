package h_myaop.myaop5;

/**
 * 功能
 *
 * @author caojianbang
 * @date 11.8.22 2:42 PM
 */
public interface Service {
    void buy();
    default String show(Integer age){return null;}
}
