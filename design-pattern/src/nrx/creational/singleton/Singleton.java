package nrx.creational.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){ }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("DO SOMETHING");
    }

    public static void main(String args[]){
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}
