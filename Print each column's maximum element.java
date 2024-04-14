 Scanner in = new Scanner(System.in);
          
            int a = in.nextInt();
          
            int b = in.nextInt();

            int[][] mat = new int[a][b];

            
            
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    mat[i][j] = in.nextInt();
                }
            }

            
            for (int j = 0; j < b; j++) {
                int max = mat[0][j]; 
                for (int i = 1; i < a; i++) {
                    if (mat[i][j] > max) {
                        max = mat[i][j];
                    }
                }
                System.out.print(max+" ");
            }
