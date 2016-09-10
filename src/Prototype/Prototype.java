package Prototype;

/**
 * Created by 10098565 on 2016/9/10.
 */
public class Prototype implements Cloneable {
    public Object clone() {
       try {
           return super.clone();
       }catch(CloneNotSupportedException e) {
           return null;
       }
    }

}
