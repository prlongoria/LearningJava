public class FindingTheRightWordsExercise {
    public static void main( String args[] ) {
        String text = "   Names!  Doe   ";
        String answer = "";
        answer = text.trim();
        answer = answer.substring(0, 6);
        answer = answer.toUpperCase();

        System.out.println(answer);
    }
}
