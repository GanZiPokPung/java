class Calsss{
    int v1,v2;
    Calsss(int v1, int v2){
        System.out.println("Cal init!!");
        this.v1 = v1; this.v2 = v2;
    }
    public int sum(){return this.v1+v2;}
}
class Calsss3 extends Calsss{
    Calsss3(int v1, int v2) {
        super(v1, v2);
        System.out.println("Cal3 init!!");
    }
    public int minus(){return this.v1-v2;}
}

public class InheritanceWithCreatorApp {
	public static void main(String[] string) {
		Calsss c = new Calsss(2,1);
        Calsss3 c3 = new Calsss3(2, 1);
        System.out.println(c3.sum()); // 3
        System.out.println(c3.minus()); // 1
	}
}
