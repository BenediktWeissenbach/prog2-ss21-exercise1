public class StudentsOutOfBoundsException extends Exception {

    public StudentsOutOfBoundsException() {
        super("The provided number of students is not within the boundaries (1-60)!");
    }

}
