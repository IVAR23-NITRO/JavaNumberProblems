Scanner in=new Scanner(System.in);
	  int a = in.nextInt();
	    int flag = 0;

	    void m1() {
	        if (flag < 5) { // Corrected the condition to check if the flag is less than 5
	            flag++; // Increment the flag at the beginning of each iteration
	            int b = 0; // Reset b to 0 at the beginning of each iteration
	            int originalA = a; // Store the original value of a before modification
	            while (a != 0) {
	                int mod = a % 10;
	                b = (b * 10) + mod;
	                a = a / 10;
	            }
	            if (originalA == b) { // Check if the original value of a is a palindrome
	                System.out.println(originalA);
	            } else {
	                a = originalA + b; // Restore the original value of a before modification
	                m1();
	            }
	        }
	    }

	    public static void main(String[] args) {
	        SumTillPalindrome s = new SumTillPalindrome();
	        s.m1();
	    }
