
public class INEURON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		//I Alphabet
		        for(int i=0;i<n;i++){

		            for(int j=0;j<n;j++){

		                if(i==0 ||i==n-1||j==n/2){

		                    System.out.print("*");

		                }

		                else{

		                    System.out.print(" ");

		                }

		            }

		     System.out.print(" ");
		      
		   
		//N Alphabet

					for(int j=0;j<n;j++) {
						if( j==0|| j==n-1 || i==j)
						{
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}

					 System.out.print(" ");
				
				 
				//E Alphabet
				
				for(int j=0;j<n;j++) {
					if (i==0||j==0||i==n-1 || i==(n-1)/2 )
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				 System.out.print(" ");
			
				//U Alphabet
				
					for(int j=0;j<n;j++) {
						if((j==0 && i< n-1)||(i==n-1 && j<n-1 && j>0 )|| (j==n-1 && i<n-1) )
							
						{
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					 System.out.print(" ");
				
				//R Alphabet
						
							for(int j=0;j<n;j++) {
								if(j==0 ||i==0 && j<(n-1)/2|| i==(n-1)/2 && j<(n-1)/2 ||j==(n-1)/2 && i!=0 && i<(n-1)/2 ||i>(n-1)/2 && i==j )
								{
									System.out.print("*");
								}
								else {
									System.out.print(" ");
								}
							}
							 System.out.print(" ");
						
				
				//O Alphabet
				
					for(int j=0;j<n;j++) {
						if( (i==0 && j>0 && j<n-1)||(j==0 && i>0 && i<n-1) ||(i==n-1 && j>0 && j<n-1)|| (j==n-1 && i>0 && i<n-1))
						{
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					 System.out.print(" ");
				
				//N Alpahbet
				
					for(int j=0;j<n;j++) {
						if( j==0|| j==n-1 || i==j)
						{
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}
		}
	

