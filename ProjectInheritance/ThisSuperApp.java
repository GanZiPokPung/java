class Calss{
	 public int sum(int v1, int v2){
	        return v1+v2;
	    }
	    // Overloading
	    public int sum(int v1, int v2, int v3){
	        return this.sum(v1,v2)+v3;
	    }
}

class Calss3 extends Calss {
	public int minus(int v1, int v2){
        return v1-v2;
    }
    // Overriding
    public int sum(int v1, int v2){
        System.out.println("Cal3!!");
        return super.sum(v1,v2);
    }
}

public class ThisSuperApp {
	public static void main(String[] string) {
		Calss c = new Calss();
        System.out.println(c.sum(2,1));
        System.out.println(c.sum(2,1,1));
 
        Calss3 c3 = new Calss3();
        System.out.println(c3.sum(2,1));
        System.out.println(c3.minus(2,1));
        System.out.println(c3.sum(2,1));
	}
}

class Calss2 {
	 public int sum(int v1, int v2){
	        return v1+v2;
	    }
	    public int minus(int v1, int v2){
	        return v1-v2;
	    }
}
