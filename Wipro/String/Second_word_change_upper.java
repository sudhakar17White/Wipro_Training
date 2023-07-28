package String;

import java.util.*;
class Second_word_change_upper {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        String w[]=word.split(" ");
        System.out.println(w[1].toUpperCase());

    }
}