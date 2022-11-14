class sample20
{
	public static void main(String[] args) {
		char[] chr ={'s','a','m','p','l','e'};
		String s = new String(chr);
		String e = new String("hello");
		char[] chr1 = {'a','n','a','h'};
		String a = new String(chr1,0,2);
		System.out.println(a);
		System.out.println(e);
		System.out.println(s);
	}
}