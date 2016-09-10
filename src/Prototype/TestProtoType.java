package Prototype;

/**
 * Created by 10098565 on 2016/9/10.
 */
public class TestProtoType {
    public static void main(String[] args) {
        Prototype pro = new Prototype();
        Prototype pro1 = (Prototype)pro.clone();
        assert(!pro.equals(pro1));
    }
}
