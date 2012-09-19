package com.redcap.hashdefine.domain;

import java.lang.reflect.Type;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;

public class LogMessageObjectFactory implements ObjectFactory {
    public Object instantiate(ObjectBinder context, Object value, Type targetType, Class targetClass) {
    	if (value instanceof String) {
    		return createLogMessageSet((String) value);
    	} else {
           throw context.cannotConvertValueToTargetType(value, String.class);
        }
   }

	private Object createLogMessageSet(String value) {
		LogMessage message = new LogMessage();
		message.setMessage(value);
		return message;
	}
}

