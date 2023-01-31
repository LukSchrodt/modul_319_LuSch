import java.util.InputMismatchException;
import java.util.Scanner;

/** Handles the exceptions.
 * @author Luk Schrodt
 * @version 1.0
 * @since 3.0
 */
public class ExceptionHandler {
    Scanner sc = new Scanner(System.in);
    private boolean isNotCorrect;

    //Empty constructor
    public ExceptionHandler(){}

    /**
     * @return String
     */
    public String selectorInput(){
        String input = "";
        do {
            try {
                sc = new Scanner(System.in);
                input = sc.nextLine();
                InvalidSelectorException.checkSelector(input);
                isNotCorrect = false;
            }catch (InvalidSelectorException e) {
                System.out.println("The entered string does not match one of the selectors.\n" +
                        "Pleas reenter one of the selectors: ");
                isNotCorrect = true;
            }
        }while (isNotCorrect);
        return input;
    }

    /**
     * @return double
     */
    public double doubleInput(){
        double input = 0;
        do{
            isNotCorrect = false;
            sc = new Scanner(System.in);
            try{
                input = sc.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("The input is not in a number format.\n" +
                        "Please reenter a valid number: ");
                isNotCorrect = true;
            }
        }while(isNotCorrect);
        return input;
    }

    /**
     * @return String
     */
    public boolean quitOrContinueInput(){
        String input;
        boolean output = false;
        do {
            sc = new Scanner(System.in);
            try{
                input = sc.nextLine();
                InvalidQuitOrContinueException.checkQuitOrContinue(input);
                if(input.equalsIgnoreCase("q")){
                    output = false;
                }else if(input.equalsIgnoreCase("c")){
                    output = true;
                }
                isNotCorrect = false;
            }catch (InvalidQuitOrContinueException e){
                System.out.println("Pleas reenter. Q to quit or C to continue: ");
                output = false;
                isNotCorrect = true;
            }
        }while (isNotCorrect);
        return output;
    }
}
