import java.util.ArrayList;
import java.lang.Math;

class thing {

    public static ArrayList<Character> initializeRandomLetters(int n, char asciiStart) {

        ArrayList<Character> randomLetterArray = new ArrayList<>();

        randomLetterArray.add(asciiStart);

        for (int i = 0; i < 32; i++) {
            System.out.println(((int) (Math.random())));
            randomLetterArray.add((char) ((int) (Math.random())));
        }

        return randomLetterArray;
    }

    public static void main(String[] args) {
        ArrayList<Character> randomLetterArray = initializeRandomLetters(32, 'a');

        for (int i = 0; i < randomLetterArray.size(); i++) {
            System.out.println(randomLetterArray.get(i));
        }
    }
}

thing.main(null);