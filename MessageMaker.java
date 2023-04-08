package War;

public class MessageMaker implements Logger{
	
	@Override
	public void log(String str) {

		String count = "";
		for(int index = 0; index < 6 + str.length(); index++) {
			count += "*";
		}
		System.out.println(count);
		System.out.println("***"+str+"***");
		System.out.println(count);
	}

}
