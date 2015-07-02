import java.io.*;

class Nuke2 {
	public static void main(String[] arg) throws Exception{
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		String inputLine = keyboard.readLine();
		char[] output = new char[inputLine.length()-1];
		int i;
		for (i=0; i<inputLine.length()-1; i++){
			if (i == 0){
				output[i] = inputLine.charAt(i);
			}else if (i>=1){
				output[i] = inputLine.charAt(i+1);
			}
		}
		System.out.println(output);
	}
}