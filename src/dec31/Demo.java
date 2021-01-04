package dec31;

public class Demo {
	public static int x,y,z;
	public static double a,b,c;
	public static double aa,ba,ca;
	public static double ab,bb,cb;
	
	
public static void Addition() {
		x=50;
		y=60;
		z=(x+y);
		System.out.println(z);
		
	}
 public static void Double() {
	aa=99;
	ba=2;
	ca=(aa/ba);
	System.out.println(ca);
		
	}
private static void add() {
	aa=99;
	ba=2;
	ca=(aa/ba);
	System.out.println(ca);
		
	}
protected static void sub() {
	ab=99;
	bb=2;
	cb=(ab/bb);
	System.out.println(cb);
		
	}
public static void main (String[]arges) {
	Demo.Addition();
	Demo.Double();
	Demo.add();
	Demo.sub();
	
}

}
