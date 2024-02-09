import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int userInput=in.nextInt(); //123456 -> 123654
		int reduce=userInput; //123456
		int red=userInput; //123456
		 int reverse=0;//0
		 int flag1=0;//0
		 while(reduce!=0) {    //123456!=0
			 int  a=reduce%10; //6
			 reduce=reduce/10; // 12345
			 reverse=(reverse*10)+a;//0*10+6=6 ====>654321
			 flag1++;//1============>6
			 
			 
		 }int flag=flag1/2;//====>6/2=3
		 
		 if(flag1%2==0) {
		 
			 while(flag!=0) {//3!=0
			 
				 userInput=userInput/10;//123456/10=12345 then=> 1234 then=>123
				 flag--;// 3 => 2 =>1
			 
		 }
			 for(int i=1;i<=flag1/2;i++) {  //1,2,3  we got flag =0, so i am using flag1/2=>6/2 for half loop.
			 
				 int red1=red%10;   //123456%10 ==>6
			 
				 userInput=(userInput*10)+red1;//  123*10+6=1230+6=1236 ==>12365 ==>123654
			 
				 red=red/10;//12345=>1234=>123
			 }
		 }else if(flag1%2!=0) {  //its is odd so i am adding 1 to flag and flag/2.
			 flag=flag+1;
			
			 while(flag!=0) {//3!=0
				 
				 userInput=userInput/10;//123456/10=12345 then=> 1234 then=>123
				 flag--;// 3 => 2 =>1
			 
		 }
			 for(int i=1;i<=(flag1/2)+1;i++) { 
			 
				 int red1=red%10;   
			 
				 userInput=(userInput*10)+red1;
			 
				 red=red/10;
			 
		 }
			 
			 
			 
			 
		 } System.out.println(userInput);
  }
}
		
		
