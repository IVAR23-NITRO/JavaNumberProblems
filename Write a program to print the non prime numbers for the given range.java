	Scanner in=new Scanner(System.in);
		int userInput1=in.nextInt();
		int userInput2=in.nextInt();                 //sample input-> 10,20 =====> output ->10 12 14 15 16 18 20
		
		for(int i=userInput1;i<=userInput2;i++) {
			if (i % 2 == 0 || i%3==0 || i%5==0 || i%7==0) {
    	        System.out.print(i+" ");;
    	      }
		}
