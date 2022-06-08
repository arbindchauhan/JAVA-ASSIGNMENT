public class PrintNumber{
	
	static void printn(int a){
		System.out.println(a);
		
	}
	static void printn(int a,float f,double d){
		System.out.println(a);
		System.out.println(f);
		System.out.println(d);
	}
	
     public static void main(String[] args){
		 PrintNumber p1= new PrintNumber();
		 p1.printn(10);
		 p1.printn(10,10.34f,20.10);
	 }
		 
		 
}