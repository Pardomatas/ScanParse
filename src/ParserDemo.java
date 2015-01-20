public class ParserDemo {

	public static void main(String[] args) {
		String file2 = "C:\\Users\\Mychal\\Desktop\\SCANPARSE\\GIVEN\\PARSER\\prog2.jay";
		//String file2 = "/Users/Batman/documents/workspace/ParserScanner2011Original/src/prog2.jay";
		TokenStream tStream = new TokenStream(file2);
		//TokenStream tStream = new TokenStream(args[0]);
		System.out.println("test1");
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		System.out.println("test2");
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");
	}

}
