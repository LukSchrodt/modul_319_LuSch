/** Creates the InvalidQuitOrContinueException.
 * @author Luk Schrodt
 * @version 1.0
 * @since 3.0
 */
class InvalidQuitOrContinueException extends Exception{
    /**
     * @param str String
     */
    public InvalidQuitOrContinueException(String str){
        super(str);
    }

    /**
     * @param string String
     * @throws InvalidQuitOrContinueException Checks if the String value is "Q" or "C"
     */
    static void checkQuitOrContinue(String string) throws InvalidQuitOrContinueException{
        if(!(string.equalsIgnoreCase("q")||string.equalsIgnoreCase("c"))) {
            throw new InvalidQuitOrContinueException("The input does not match Q or C.");
        }
    }
}
