Scanner in = new Scanner(System.in);
	        int a=in.nextInt();
	         int flag=0;
	        int z=0;
	        
	        if(a>20) {
	        	System.out.println("Wrong Infrastructure");
	        }
	        else {
	        	int l=a;
	        	int m=a/2;
	        	
	        	if (a % 2 != 0) {
	                m++; 
	            }
	        	int total=l+m;
	        	System.out.println(total);}
