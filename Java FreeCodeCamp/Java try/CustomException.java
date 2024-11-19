public class  CustomException {
    public static class InvalidLengthException extends Exception {
        public InvalidLengthException (String message) {
            super(message);
        }
    }

    public static class LinkedListLengthOutOfBoundException extends Exception {
        public LinkedListLengthOutOfBoundException(String message) {
            super(message);
        }
    }
}