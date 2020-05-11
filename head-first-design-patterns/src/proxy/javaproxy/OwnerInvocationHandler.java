package proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author hustffx
 * @Date 2020/5/11 16:40
 */
public class OwnerInvocationHandler implements InvocationHandler {
    private PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if ("setHotOrNotRating".equals(methodName)) {
            throw new IllegalAccessException();
        } else if (methodName.startsWith("set") || methodName.startsWith("get")) {
            return method.invoke(person, args);
        }
        return null;
    }
}
