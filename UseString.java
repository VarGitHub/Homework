package home.work4;

public class UseString {

	public static void main(String[] args) {
		String s1 = " Home Work for the week of February 4  ";
		String s2 = " Don't forget the Github part in Home work ";
		String s3 = "";
		String s4 = "Hello";
		String s5 = "Hello";
		char[] chArray = s1.toCharArray();
		int num = 20;
		
		System.out.println(s1.charAt(19));//1
		System.out.println(s1.concat(s2));//2
		System.out.println(s1.contains("the"));//3
		System.out.println(s1.endsWith(" "));//4
		System.out.println(s3.isEmpty());//5
		System.out.println(s1.length() + ", " + s2.length() + ", " + s3.length());//6
		System.out.println(s1.matches("(.*)February(.*)"));//7
		for (int i = 0; i < chArray.length; i++)
			System.out.println(chArray[i]);//8
		System.out.println(s2.substring(18, 25));//9
		System.out.println(s1.toUpperCase());//10
		System.out.println(s2.toLowerCase());//11
		System.out.println(s1.toString());//12
		System.out.println(s1.trim());//13
		System.out.println(s3.valueOf(num));//14
		System.out.println(s1.hashCode() + ", "+s2.hashCode() + ", " + s3.hashCode());//15
		System.out.println(s2.lastIndexOf('t'));//16
		System.out.println(s1.intern());//17
		System.out.println(s4.equals(s5));//18
		System.out.println((s1.trim()).startsWith("Home"));//19
		System.out.println(s4.subSequence(1,3));//20
		for (String s : s1.split("the", 2))
			System.out.println(s);//21
		System.out.println(s2.indexOf("the"));//22
		System.out.println(s4.replace('H', 'N'));//23
		System.out.println(s1.replaceAll("the", "this"));//24
		System.out.println(String.format("Hi! %s", s4));//25
		System.out.println(s4.codePointAt(0));//26
		System.out.println(s4.compareTo(s5));//27
		for (byte b : s5.getBytes())
			System.out.println(b);//28
		System.out.println(s1.charAt(s1.offsetByCodePoints(0, 6)));//29
		System.out.println(s4.startsWith("He"));//30
		
	}

}
