package trials;

import java.io.PrintWriter;

public class StringToTxt {
	public static void main (String [] args) throws Exception
	{
		String in="tryingpdf";
		String Extn=".txt";
		in=in+Extn;
		//in.concat(Extn);
		
		System.out.println(Extn);
		PrintWriter p= new PrintWriter(in);
		System.out.println(in);
		String input="My name is tushar kale i am a final year engineering student of computer engineering";
		
		p.println(input);
		p.close();
		System.out.println("Tushar");
	}

}
