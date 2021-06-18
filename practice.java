import java.io

public class practice
{
 
    public static void main(String[] args)
    {
      
      
      String text = args[0];
      String text2 = args[1];
      System.out.println(text + " " + text2);
      
    }

  
  
    Runtime rt = Runtime.getRuntime();
  
    //command = "cmd";
  
    Process pr = rt.exec(command);
  
   BufferedReader processOutput = new BufferedReader(new InputStreamReader(pr.getInputStream()));
   BufferedWriter processInput = new BufferedWriter(new OutputStreamWriter(pr.getOutputStream()));
     
}