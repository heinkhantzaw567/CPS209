public class testing {
    public static void main(String[] args) {
        String questionText ="The inventor of Java was _James Gosling_";
        int first = questionText.indexOf('_');
        System.out.println(first);
        int last = questionText.indexOf('_',first+1);
        System.out.println(last);
        String answer = questionText.substring(first+1, last);
        System.out.println(answer);
        String underscore = "_";
        String question = questionText.replace(answer, underscore.repeat(answer.length()));
        System.out.println(question);
    }
}
