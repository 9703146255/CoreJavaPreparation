package Example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 Write a program to display the frequency of words based on their length.

For example, Input : "My name is ABC. I am a full stack developer."

Output:

Length 1, Frequency 2
Length 2, Frequency 3
Length 3, Frequency 1
Length 4, Frequency 2
Length 5, Frequency 1
Length 9, Frequency 1
 */
public class FrequencyOfWords {

	public static void main(String[] args) {

//		String s="My name is ABC. I am a full stack developer.";
//		String[] split=s.split(" ");
//		int len=split.length;
//		for(int i=1;i<len;i++)
//		{
//			String word=split[i];
//
//			System.out.println("Length "+i+" ,"+" Frequency"+word.length());
//		}

//		Requirements 1:
//			Apply the age range B/w 45 to 50.
//			ON top that list,Sort by Name and finally get list which has list of Names.
//
//			 
//
//			Requirements 2:
//			Apply the average on Age.
//			Requirements 3:
//			Find Total salary of the members.
	
	
			List<Integer> list=new ArrayList<>();
			list.add(30);
			list.add(40);
			list.add(50);
			list.add(46);
			list.add(47);
			list.add(48);
			list.add(30);
			
			List<Integer> li=list.stream().filter(r->r>=45 && r<=50).collect(Collectors.toList());
			System.out.println(li);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
