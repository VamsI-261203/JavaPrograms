//reverse inside the word string
import java.util.*;
public class wordreverse
{
	public static void main(String[] args) {
		String str;
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String words[]=str.split(" ");
		String reverse="";
		for(String word:words){
		    for(int i=word.length()-1;i>=0;i--){
		        reverse=reverse+word.charAt(i);
		    }
		    reverse=reverse+" ";
		}
		System.out.println(reverse);
	}
	
}