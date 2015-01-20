/**
 * @author Christelle
 * 
 */
public class ScannerDemo {

	//private static String file1 = "C:\\Users\\cscharff\\Desktop\\TESTSCANNERPARSER2010\\GIVEN\\PARSER\\prog2.jay";
	private static String file1 = "C:\\Users\\Mychal\\Desktop\\SCANPARSE\\GIVEN\\SCANNER\\prog1.jay";
	private static String file2 = "C:\\Users\\Mychal\\Desktop\\SCANPARSE\\GIVEN\\PARSER\\prog2.jay";
	//private static String file1 = "/Users/Batman/documents/workspace/ParserScanner2011Original/src/prog2.jay";
	private static int counter = 1;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);

		System.out.println(file1);

		while (!ts.isEndofFile()) {
			// TO BE COMPLETEDs **
			//Token i – Type: thetype Content: thecontent
			counter++;
			System.out.println("Token " + counter + " - " + ts.nextToken());
			
		}
	}
}
