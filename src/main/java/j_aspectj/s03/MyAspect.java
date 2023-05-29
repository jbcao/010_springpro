package j_aspectj.s03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 功能
 *
 * @author caojianbang
 * @date 13.8.22 3:11 PM
 */
@Aspect
@Component
public class MyAspect {
    @Around(value = "execution(* j_aspectj.s03.*.*(..))")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        //前切功能实现
        System.out.println("环绕通知中前切功能的实现。。。。。。。。。");
        //目标方法调用
        Object res = proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
        //后切功能实现
        System.out.println("环绕通知中后切功能的实现。。。。。。。。。");
        return res.toString().toUpperCase();
    }
}
