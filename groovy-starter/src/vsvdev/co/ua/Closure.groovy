package vsvdev.co.ua

import java.util.stream.Stream

class Closures {
    static void main(String[] args) {
//        Function<Integer, Integer> func = value -> value + value
//        def result = func.apply(5)
//        println result

        // with default value
        Closure<Integer> closure = { value = 78 ->
            println value
            value + value
        }

        Closure<Integer> closure0 = { value ->
            println value
            value + value
        }
        // the same as above
        Closure<Integer> closure1 = {
            println it
            it + it
        }

        // closure without params

        Closure<Integer> closure2 = {->
            println 5
            5
        }

//        def result = closure.call(5)

        println('-----------------------------------------------------------')
        def result = closure0(5)
        println result
        println closure()
        println closure1(5)
        println closure2()
        println('-----------------------------------------------------------')



        Stream.of(1, 2, 3, 4)
//            .map(func)
                .map(closure)
//            .map(String::valueOf)
        // the same as above link to method
                .map(String.&valueOf)
                .forEach(System.out::println)

        int x = 10
        check(x > 0) {
            println (++x)
        }

        println x
    }

    static def check(boolean condition, Closure closure) {
        if (condition) {
            closure()
        }
    }
}

