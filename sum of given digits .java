 Scanner in = new Scanner(System.in);
	      
	        int a=in.nextInt();
	       
	        int sum=0;
	        
	      
	       
	        
	        while(a!=0) {
	        	
	        		int b=a%10;
	        		sum=sum+b;
	        		a=a/10;
	        		
	        	}
	        	
	        System.out.println(sum);
