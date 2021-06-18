import java.io.BufferedWriter;
import java.io.BufferedReader;

public class convert
{
  
  public static void main(String[] args)
  {
   
   String feedback = "";
   int total = 0;
    
  code_file = "Main.java"
  compile newobject = new compile();
  compile(code_file);  
    
  if (//compile is successful)
    {
    
        generate_output_file(code_file, "sample_routes.txt");
        total += compare_outputs("sample_areas.txt", 2);
        generate_output_file(code_file, "pilot_routes2.txt")
        total += compare_outputs("pilot_areas2.txt", 3)
        generate_output_file(code_file, "pilot_routes3.txt")
        total += compare_outputs("pilot_areas3.txt", 3)
        generate_output_file(code_file, "pilot_routes4.txt")
        total += compare_outputs("pilot_areas4.txt", 1.5)
    } 
  else
    {
     feedback+="File did not compile successfully"  
      }
  
  }
    public static String compile(file_name)
    {
     BufferedReader processOutput = new BufferedReader(new InputStreamReader(pr.getInputStream()));
     BufferedWriter processInput = new BufferedWriter(new OutputStreamWriter(pr.getOutputStream()));

     String commandToSend = "javac " + file_name;
  
     processInput.write(commandToSend);
     processInput.flush();
      
      
     processInput.close();
     processOutput.close();
   
    }
    
    public static generate_output_file(String runfile, String test_file)
    {
      
    }
    
    public static int compare_outputs(String filename, int points_permatch)
    {
      int points = 0;
      
      File student_solutions = new File();
      ---------
       ??[] answers = ???//an array of particular values
       for (i = 0; answers.length; i++ )
       {
         if (answers
       }
      
      
      return points;
    }
  
}