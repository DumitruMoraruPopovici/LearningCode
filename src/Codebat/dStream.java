package Codebat;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class dStream {
    public static void main(String[] args) {
        DoubleStream doubleStream = DoubleStream.of(-1.5, 45, 11);
        OptionalDouble optional = doubleStream.map(num -> num *-1)
                .filter(num -> num>0)
                .findFirst();
        optional.ifPresentOrElse(System.out::println, ()->{});
//                .filter(num -> num>0)
//                .findFirst();
//        System.out.println(optional);
    }
}
