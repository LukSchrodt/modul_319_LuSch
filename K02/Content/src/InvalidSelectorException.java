class InvalidSelectorException extends Exception{
    public InvalidSelectorException(String str){
        super(str);
    }

    static void checkSelector(String selector) throws InvalidSelectorException{
        if (!(selector.equalsIgnoreCase("H1") ||
                selector.equalsIgnoreCase("H2") ||
                selector.equalsIgnoreCase("C") ||
                selector.equalsIgnoreCase("S"))){
            throw new InvalidSelectorException("The Input does not match one of the shown selectors.");
        }
    }
}
