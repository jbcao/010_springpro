package j_aspectj.s04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 功能
 *
 * @author caojianbang
 * @date 13.8.22 4:17 PM
 */
@Aspect
@Component
public class MyAspect {
    /**
     * 最终通知方法的规范
     * 1）访问权限是public
     * 2）方法没有返回值
     * 3）方法名称自定义
     * 4）方法没有参数,如果有也是JoinPoint
     * 5）使用@After注解表明是最终通知
     * <p>
     * 参数：  value  :指定切入点表达式
     */

    @Before(value = "myCut()")
    public void myBefore() {
        System.out.println("前置通知方法通知功能执行。。。。。。");
    }

    @AfterReturning(value = "myCut()", returning = "obj")
    public void myAfterReturning(Object obj) {
        System.out.println("后置通知方法通知功能执行。。。。。。");
    }

    @Around(value = "myCut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知前切方法通知功能执行。。。。。。");
        Object res = proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
        System.out.println("环绕通知后切方法通知功能执行。。。。。。");
        return res;
    }

    @After(value = "myCut()")
    public void myAfter() {
        System.out.println("最终通知功能执行。。。。。。");

    }

    @Pointcut(value = "execution(* j_aspectj.s04.*.*(..))")
    public void myCut() {
    }

}
