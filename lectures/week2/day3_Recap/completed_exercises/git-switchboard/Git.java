import java.io.IOException;
class Git {
	public static void main(String[] args) throws IOException{
		String wrongCommand = "Please use one of the following commands\n\n" +
							  "\tcommit : to commit changes to the current branch\n" +
							  "\tadd : to add new files to the current branch\n" +
							  "\tpush : to push changes from a branch to a remote repository\n" +
							  "\tpull : to recieve changes from a remote repository";
		if(args.length > 0){
			switch(args[0]){
				case "commit":
					switch(args.length){
						case 1:
							char ch;
							boolean first = true;
							System.out.println("Please enter a commit message");
							do {
								ch = (char)System.in.read();
								if(first){
									System.out.print("Successfully committed ");
								}
								System.out.print(ch);
								first = false;
							}while(ch != '\n');
						break;
						case 3:
							if(args[1].equals("-am")){
								System.out.println("Successfully committed");
								break;
							}
						default:
							System.out.println("Wrong parameters for a commit");
					}
				break;
				case "add":
					switch(args.length){
						case 1:
							System.out.println("Nothing specified, nothing added.");
		 					System.out.println("Maybe you wanted to say 'Git add -A'?");
							break;
						case 2:
							if(args[1].equals("-A")){
								System.out.println("Successfully added all files");
							} else {
								System.out.println("Successfully added " + args[1]);
							}
							break;
						default:
							System.out.println("Wrong parameters for an add");	
					}	
				break;
				case "push":
					switch(args.length){
						case 1:
							System.out.println("Successfully pushed current branch to default remote");
							break;
						case 3:
							System.out.println("Successfully pushed " + args[2] + " to "  + args[1]);
							break;
						default:
							System.out.println("Wrong parameters for a push");	
					}	
				break;
				case "pull":
					switch(args.length){
						case 1:
							System.out.println("Successfully pulled from default remote");
							break;
						case 3:
							System.out.println("Successfully pulled " + args[1] + " to "  + args[2] + " branch");
							break;
						default:
							System.out.println("Wrong parameters for a pull");	
					}	
				break;
				default:
					System.out.println("Unrecognised command");
					System.out.println(wrongCommand);
			}
		} else {
			System.out.println(wrongCommand);	
		}
	}
}