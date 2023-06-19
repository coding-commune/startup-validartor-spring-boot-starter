package eu.coding.commune.startup.validator.model.method;

import lombok.Builder;

import java.lang.reflect.Method;

@Builder
public record MethodData(Object bean, Class<?> clazz, Method method) {
}
