public class PrintNumber{
	
	 void printn(int a){
		System.out.println("int:" +a);
		
	}
	 void printn(float f){
	     
		 System.out.println("Float:"+f);

	}
	void printn(double d){
	     
		 System.out.println("Double:"+d);

	}
	
     public static void main(String[] args){
		 PrintNumber p1= new PrintNumber();
		 p1.printn(10);
		 p1.printn(10.34f);
		 p1.printn(20.35);
		 
	 }
		 
		 
}