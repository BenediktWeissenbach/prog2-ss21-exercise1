public class GradeOutOfBoundsException extends Exception {

    public GradeOutOfBoundsException() {
        super("At least one grade in your list is lower than 0 or higher than 100!");
    }

}
