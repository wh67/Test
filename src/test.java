
public class test {
	
	public static void main(String[] args){
		String s1 = "foo";
		String s2 = new String("fo");
		String s3 = "f";
		
		byte b = 010;
		Integer a = new Integer(024);
		System.out.println(a.byteValue());
		
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s3));
	}

}
