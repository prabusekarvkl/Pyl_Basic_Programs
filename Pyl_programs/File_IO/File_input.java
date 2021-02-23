package File_IO;

import java.io.FileInputStream;
import java.io.IOException;

public class File_input {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = null;
		int count = 0;

		try {
			fin = new FileInputStream("C:/Users/PRABU/Desktop/abc.txt");
			int i = 0;
			while ((i = fin.read()) != -1)
			// find spl charecter of given text file coding
			{
				if ((i < 65 || 122 < i)) // alphapet into A(65) to z(122)
				{
					count = count + 1;
				} else {
					if (90 < i && 97 > i) // spl char
					{
						count = count + 1;
					}
				}
				char c = (char) i;
				System.out.print(c);
			}
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(e);
		}

		finally {
			fin.close();
		}

		System.out.println("\nno of spl char present in given file is " + count);
	}

}
