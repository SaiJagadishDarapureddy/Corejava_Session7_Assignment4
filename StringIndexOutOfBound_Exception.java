package exception;

public class StringIndexOutOfBound_Exception {
	public static void main(String args[]){
		try{
		 String str="easysteps2buildwebsite";
		 System.out.println(str.length());;
		 char c = str.charAt(23); 
		 System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e){
		  System.out.println("Exception occured " +e);;
		}
	}
}
