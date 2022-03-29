import java.util.Arrays;

public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("Developing Hello feature");
        System.out.println("Developing Hello feature");
        System.out.println("Local repo is already has published to GitHub");



        String[] array = {"A", "B", "C", "D", "E"};

        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }



        System.out.println(Arrays.toString(array));
    }
}
