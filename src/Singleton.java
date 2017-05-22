/**
 * Created by leo.zinger on 5/22/17.
 */
public class Singleton {
    private static Singleton mySingleton;
    protected Singleton (){}
    public static Singleton getInstance (){
        if (mySingleton == null){
            mySingleton = new Singleton();
        }
        return mySingleton;
    }

    public static void main (String[] args){
        Singleton singletonInstance = Singleton.getInstance();
        System.out.println("obtained MySingleton Instance");
    }
}
