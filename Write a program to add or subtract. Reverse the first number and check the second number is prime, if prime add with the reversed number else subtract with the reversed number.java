Scanner in=new Scanner(System.in); //Write a program to add or subtract. Reverse the first number and check the second number is prime, if prime add with the reversed number else subtract with the reversed number
		int userInput1=in.nextInt();
		int userInput2=in.nextInt();
		int reverse =0;
		
		
		while(userInput1!=0) {
			int a=userInput1%10;
			reverse=(reverse*10)+a;
			userInput1=userInput1/10;
			
		}
		
		
		if(!(userInput2%2==0)) {
			System.out.println(reverse + userInput2);
		}else{
			System.out.println(reverse - userInput2);
		}
