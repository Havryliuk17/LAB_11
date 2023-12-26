package task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder()
                .name("Olia")
                .age(18)
                .mark(100)
                .grades(Arrays.asList(100, 100))
                .gender("f")
                .build();
        System.out.println(user);
    }
}