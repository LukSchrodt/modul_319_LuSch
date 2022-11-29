class InvalidQuitOrContinueException extends Exception{
    public InvalidQuitOrContinueException(String str){
        super(str);
    }

    static void checkQuitOrContinue(String string) throws InvalidQuitOrContinueException{
        if(!(string.equalsIgnoreCase("q")||string.equalsIgnoreCase("c"))) {
            throw new InvalidQuitOrContinueException("The input does not match Q or C.");
        }
    }
}
