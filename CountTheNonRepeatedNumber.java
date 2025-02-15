import java.util.*;
public class CountTheNonRepeatedNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter n1:");
		n1=sc.nextInt();
		System.out.println("Enter n2:");
		n2=sc.nextInt();
		int t=0,c=0,r=0;
		for(int i=n1;i<=n2;i++){
			boolean arr[]=new boolean[10];
			t=i;
			while(t>0){
				r=t%10;    
				if(arr[r]==true){
					break;
				}
				else{
					arr[r]=true;
				}
				t/=10;
			}
			if(t==0){
				c+=1;
			}
		}
		System.out.println("The number of Non-repeated numbers between "+n1+" and "+n2+" is "+c);
	}
} 
			
				
			
		