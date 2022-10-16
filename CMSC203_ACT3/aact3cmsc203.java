import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        
        do{
            System.out.print("No. of test cases: ");
            int testCases = scanner.nextInt();
            
            if (1 <= testCases && testCases <= 10){
                String inputs[] = new String[testCases];
                for (int i = 0; i < testCases; i++) {
                    scanner = new Scanner(System.in);
                    inputs[i] = scanner.nextLine();
                }
                
                System.out.println();
                System.out.println("Result:");
                System.lineSeparator();
                for (String input : inputs)
                    System.out.println(processInput(input));
                    
                    
                done = true;
            } else
                System.out.println("Enter numbers 1-10 only!");
                
        } while (!done);
        scanner.close();
    } 
    
    private static String processInput(String input) {
        String[] inputs = input.split("\\s+");
        
        if (inputs.length != 2)
            return "Invalid Input";
            
            
        try {
            int uber = Integer.parseInt(inputs[0]);
            int grab = Integer.parseInt(inputs[1]);
            
            if (uber < 1 || uber > 1000 
                    || grab < 1 || grab > 1000)
                return "Invalid Input";
                
            if (uber < grab)
                return "First";
            
            else if (uber > grab)
                return "Second";
                
            else
                return "Any";
        } catch (Exception e) {
            return "Invalid Input";
        }
    }    
}