 int a=in.nextInt();
	        boolean flag=false;
	        	for (int i = 2; i <= a / 2; ++i) {
	        	      
	        	      if (a % i == 0) {
	        	        flag = true;
	        	        break;
	        	      }
	        	    }

	        	    if (!flag)
	        	      System.out.println("Prime number");
	        	    else
	        	      System.out.println("Not Prime Number");
	        	  }
