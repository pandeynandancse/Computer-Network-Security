/* program for caesar cipher encryption*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Ceaser
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Shifting will be clockwise");		
		System.out.println("Enter the Plain Text");
		String pta = sc.nextLine();
		System.out.println("nome" + pta);
		String ans= "";
    System.out.println("Enter the number from which we have to shift");
		int k = sc.nextInt();
		String ans2 = "";
		
		String[] spt = new String[10];
		spt = pta.split("\\s");
		System.out.println(spt.length);
		for(int i =0; i < spt.length; i++){
			String sp = spt[i];
			
			for(int j=0; j<sp.length(); j++){
				char c = sp.charAt(j);
				int ca = c;
				
				//System.out.println(ca);
				if(ca>=97 && ca<=122){
					ca = ca + k;
					if(ca>122){
						int x = ca-122;
						x = x+96;
						c = (char)x;
					
						ans = c + "";
					}
					else{
						c = (char)ca;
						ans = c + "";
					}
				ans2 = ans2 + ans;
				}
				else if(ca>=65 && ca<=90){
					ca = ca + k;
					if(ca>90){
						int x = ca-90;
						x = x+64;
						c = (char)x;
						ans = c+ "";
					}
					else{
						c = (char)ca;
						ans = c + "";
					}
				ans2 = ans2 + ans;
				}
				
			}
			ans2 = ans2 + " " ;
			
		}
		
		System.out.println(ans2);
	}
}
