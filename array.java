package gayathri;


import java.util.Scanner;

public class array {
	 public static long SubArraySum(int arr[], int n)
	 {
		 long result = 0, sum = 0;
	     int[] p = new int[n]; 
	     p[0] = arr[0];	        
	     for (int i = 1; i < n; i++)
	     {
	    	 p[i]=p[i - 1] + arr[i];
	     }
	     for (int i = 0; i < n; i++) 
	     {
	    	 sum = 0;
	    	 for (int j = i; j < n; j++)
	    	 {
	    		 if (i != 0)
	    		 {
	    			 sum = p[j]-p[i - 1];
	                }
	                else
	                    sum = p[j];
		                result += sum;
		            }
		        }
		        return result;
		    }
		    
		    
		    public static void main(String[] args)
		    {
		    	Scanner sc=new Scanner(System.in);
		    	int n=sc.nextInt();
		        int arr[] = new int[n];
		        for(int i=0;i<n;i++) {
		        	arr[i]=sc.nextInt();
		        }
		        
		        System.out.println( SubArraySum(arr, n));
		    }
		}



