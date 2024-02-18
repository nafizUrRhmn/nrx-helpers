package reflections;

import java.lang.reflect.Method;

public class ReflectionGeneric {

    void callingReflection(String className, String methodName,String... methodParam){
        try{
            Class<?> clazz = Class.forName(className);
            Object obj = clazz.getConstructor().newInstance();
            Class<String>[] parameterTypes = new Class[methodParam.length];
            for(int i=0; i< methodParam.length; i++){
                parameterTypes[i] = String.class;
            }
            Method method =  clazz.getDeclaredMethod(methodName, parameterTypes);
            method.setAccessible(true);
            System.out.println(method.invoke( obj,methodParam));
        }catch(Exception exp){
               throw new RuntimeException(exp.getMessage());
        }
    }
}
