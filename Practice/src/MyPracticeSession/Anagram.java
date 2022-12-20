package MyPracticeSession;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args){
     String str1= "Static";
     String str2= "Static"; 
    	 char[]ch1=str1.toCharArray();
    	 char[]ch2=str2.toCharArray();
    	 Arrays.sort(ch1);
    	 Arrays.sort(ch2);
    	 if(Arrays.equals(ch1, ch2)) {
    		 System.out.println("Given two strings are Anagram");
    	 }
    	 else {
    		 System.out.println("Given two strings are not Anagram");
    	 }
}}
