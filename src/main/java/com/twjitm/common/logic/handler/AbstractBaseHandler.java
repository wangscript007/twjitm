package com.twjitm.common.logic.handler;

import com.twjitm.common.annotation.MessageCommandAnntation;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractBaseHandler implements BaseHandler {

    public Map<Integer, Method> handlerMethods;

    public AbstractBaseHandler() {
        init();
    }

    public void init() {
        handlerMethods = new HashMap<Integer, Method>();
        Method[] methods = this.getClass().getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MessageCommandAnntation.class)) {
                MessageCommandAnntation messageCommandAnnotation = method.getAnnotation(MessageCommandAnntation.class);
                if (messageCommandAnnotation != null) {
                    handlerMethods.put(messageCommandAnnotation.messagecmd().commId, method);
                }
            }
        }

    }

    public Method getMethod(int commid) {
        return handlerMethods.get(commid);
    }

}
