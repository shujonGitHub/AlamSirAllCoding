
public class ReverseStr {

	public static void main(String[] args) {
		
		String name="John Shujon";
	
		StringBuilder ss=new StringBuilder(name);
		
		String abc=ss.reverse().toString();
		
		System.out.println(abc);
		
		
	String firstName="Donald Trump"	;
	
	StringBuilder hh=new StringBuilder(firstName);
	
	String revName =hh.reverse().toString();
	
	System.out.println(revName);
	
	String fName="Canadian";
	String lName=" Goose";
	
	String fullName =fName.concat(lName);
	
	System.out.println(fullName);
	
	StringBuffer d=new StringBuffer("Danielle");
	StringBuffer t=new StringBuffer(" Terenzio");
	d.append(t);
	
	System.out.println(d);
		
		
		
		

	}

}
