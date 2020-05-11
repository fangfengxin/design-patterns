package proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author hustffx
 * @Date 2020/5/11 16:57
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    private PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if ("setHotOrNotRating".equals(methodName) || methodName.startsWith("get")) {
            return method.invoke(person, args);
        } else if (methodName.startsWith("set")) {
            throw new IllegalAccessException();
        }
        return null;
    }
}
