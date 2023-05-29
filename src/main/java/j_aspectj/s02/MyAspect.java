package j_aspectj.s02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 功能
 *
 * @author caojianbang
 * @date 13.8.22 12:48 PM
 */
@Aspect
@Component
public class MyAspect {
    @AfterReturning(value = "execution(* j_aspectj.s02.*.*(..))",returning = "obj")
    public void myAfterReturning(Object obj){
        if(obj !=null){
            if(obj instanceof String){
                obj=obj.toString().toUpperCase();
                System.out.println("切面方法中目标方法的返回值"+obj);
            }
            if(obj instanceof Student){
                ((Student) obj).setName("李四");
                System.out.println("切面方法中目标方法的返回值"+obj);
            }
        }
        System.out.println("后置通知功能实现");
    }
}
