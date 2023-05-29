package h_myaop.myaop4;

/**
 * 功能
 *
 * @author caojianbang
 * @date 11.8.22 3:51 PM
 */
public interface Aop {
    //jdk8提供默认实现，实现类可以不实现接口中的方法
    default void before(){}
    default void after(){}
    default void exception(){}
}
