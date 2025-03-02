package week1.day2;

public class ImplementMethod {
		
		public void add(){
			int a=6;
			int b=8;
			System.out.println(a+b);
		}
		
		public void sub(){
			int a=5;
			int b=7;
			System.out.println(a-b);
		}
		
		public void multiply(){
			int a=3;
			int b=6;
			System.out.println(a*b);
		}
		
		public static void main(String[] args) {
			
			ImplementMethod SA =new ImplementMethod();
			
			SA.add();
			SA.sub();
			SA.multiply();
		}
}

