public class Demo6 {
	public static void main(String[] args){
		char ch;
		ch = 'A';
		while( ch <= 'z'){
			System.out.print(ch);
			if((ch % 10) == 0 ) System.out.println();
			ch++;
		}
	}

}
