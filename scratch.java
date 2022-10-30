import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

class scratch{
    public static void main(String[] args) throws FileNotFoundException{
        try{
        String output = "";
        int count = 0;
        Scanner input = new Scanner(new File("to-be-copy.txt"));
        while(input.hasNextLine()){
            String line = input.nextLine();
            count++;
            output += count + "    ";
            output += line + "\n";
            
        }
        PrintWriter outputWithLineNum = new PrintWriter("output-with-line-number.txt");
        outputWithLineNum.print(output);
        outputWithLineNum.close();
        }
        finally{
            System.out.println("finished executing");
        }
        
        
    }
}