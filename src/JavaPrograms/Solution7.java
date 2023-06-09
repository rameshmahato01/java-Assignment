package JavaPrograms;
import java.util.*;

public class Solution7 {

	public static void main(String[] args) { 
		    Scanner sc = new Scanner(System.in);
		    int numArray[] = {5,10,15,20,25,30,35}; 
		    System.out.println("The input array: " + Arrays.toString(numArray));
		    //key to be searched
		    System.out.println("enter the key");
		    int key = sc.nextInt();
		    System.out.println("Key to be searched=" + key);
		    //set first to first index
		    int first = 0;
		    //set last to last elements in array
		    int last=numArray.length-1; 
		    //calculate mid of the array
		    int mid = (first + last)/2;  
		    //while first and last do not overlap
		    while( first <= last ){  
		        //if the mid < key, then key to be searched is in the first half of array
		        if ( numArray[mid] < key ){  
		            first = mid + 1;     
		        }else if ( numArray[mid] == key ){ 
		            //if key = element at mid, then print the location
		            System.out.println("key found at index: " + mid);  
		            break;  
		        }else{  
		            //the key is to be searched in the second half of the array
		            last = mid - 1;  
		        }  
		        mid = (first + last)/2;  
		   }  
		   //if first and last overlap, then key is not present in the array
		   if ( first > last ){  
		      System.out.println("key is not found!");  
		   }       
		 } 


		// TODO Auto-generated method stub

	}

