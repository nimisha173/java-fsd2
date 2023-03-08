package iostream;
import java.io.FileOutputStream;
public class iost {

	public iost(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String s="welcome to java";
		try {
			FileOutputStream obj=new FileOutputStream("D:\\text.txt");
			
			byte b[]=s.getBytes();
			obj.write(b);
			obj.close();
			System.out.println("sucsess");
		}
		catch (Exception e) {
			System.out.println(e);
		}
			}

		
	

	}

