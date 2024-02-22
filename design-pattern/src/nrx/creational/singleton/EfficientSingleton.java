package nrx.creational.singleton;

public class EfficientSingleton {

    private static volatile EfficientSingleton instance = null;

    private EfficientSingleton(){ }

    public static EfficientSingleton getInstance(){
        if(instance ==null){
            synchronized (EfficientSingleton.class){
                if(instance == null){
                    instance = new EfficientSingleton();
                }
            }
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("DO SOMETHING");
    }

    public static void main(String args[]){
        EfficientSingleton singleton = EfficientSingleton.getInstance();
        singleton.doSomething();
    }
}
