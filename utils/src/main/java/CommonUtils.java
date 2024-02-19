import java.lang.reflect.Method;

public class CommonUtils {

    public static Boolean isBitValueExist(int total, int bitValue){
        return (total & bitValue)!=0;
    }

    public static Object callingInstanceByReflection(String className){
        try{
            Class<?> clazz = Class.forName(className);
            return clazz.getConstructor().newInstance();
        } catch (Exception exp){
            throw new RuntimeException(exp.getMessage());
        }
    }

    public static Object callingMethodByReflection(String className, String methodName,String... methodParam){
        try{
            Class<?> clazz = Class.forName(className);
            Object obj = clazz.getConstructor().newInstance();
            Class[] parameterTypes = new Class[methodParam.length];
            for(int i=0; i< methodParam.length; i++){
                parameterTypes[i] = String.class;
            }
            Method method =  clazz.getDeclaredMethod(methodName, parameterTypes);
            method.setAccessible(true);
            return method.invoke( obj,methodParam);
        }catch(Exception exp){
            throw new RuntimeException(exp.getMessage());
        }
    }
}
