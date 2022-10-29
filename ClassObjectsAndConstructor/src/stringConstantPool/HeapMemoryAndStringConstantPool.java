package stringConstantPool;

public class HeapMemoryAndStringConstantPool {
	public static void main(String[] args) {
		String s1="Apple";
		String s2="Apple";
		String s3=" Grapes";
		String s4=new String("Apple");
		
		System.out.println("s1==s2:" + (s1==s2));
		System.out.println("s1==s3:" +(s1==s3));
		System.out.println("s1==s4:" + (s1==s4));
		
	}

}
