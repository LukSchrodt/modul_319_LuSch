/** Creates the InvalidQuitOrContinueException.
 * @author Luk Schrodt
 * @version 1.0
 * @since 3.0
 */
class InvalidSelectorException extends Exception{
    /**
     * @param str String
     */
    public InvalidSelectorException(String str){
        super(str);
    }

    /**
     * @param selector String
     * @throws InvalidSelectorException Checks if the selector String is a selector value
     */
    static void checkSelector(String selector) throws InvalidSelectorException{
        if (!(selector.equalsIgnoreCase("H1") ||
                selector.equalsIgnoreCase("H2") ||
                selector.equalsIgnoreCase("C") ||
                selector.equalsIgnoreCase("S"))){
            throw new InvalidSelectorException("The Input does not match one of the shown selectors.");
        }
    }
}
