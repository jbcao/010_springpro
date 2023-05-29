package h_myaop.myaop5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 功能
 *
 * @author caojianbang
 * @date 11.8.22 4:43 PM
 */
public class AgentFactory {
    public static Object gatAgent(Service target,Aop aop){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object obj= null;
                try {
                    aop.before();
                    obj = method.invoke(target,args);
                    aop.after();
                } catch (IllegalAccessException e) {
                    aop.exception();
                    e.printStackTrace();
                }
                return obj;
            }
        });
    }
}
