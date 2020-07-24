class Cals{
    public int sum(int v1, int v2){
        return v1+v2;
    }
    // Overloading
    public int sum(int v1, int v2, int v3){
        return v1+v2+v3;
    }
}
class Cals3 extends Cals{
    public int minus(int v1, int v2){
        return v1-v2;
    }
    // Overriding
    public int sum(int v1, int v2){
        System.out.println("Cal3!!");
        return v1+v2;
    }
 
}
public class OverRideLoadApp {
    public static void main(String[] args) {
    	Cals c = new Cals();
        System.out.println(c.sum(2,1));
        System.out.println(c.sum(2,1,1));
 
        Cals3 c3 = new Cals3();
        System.out.println(c3.sum(2,1));
        System.out.println(c3.minus(2,1));
        System.out.println(c3.sum(2,1));
    }
}
class Cals2{
    public int sum(int v1, int v2){
        return v1+v2;
    }
    public int minus(int v1, int v2){
        return v1-v2;
    }
}