package vsvdev.co.ua

class Operators {

    /*

    +,-,*,/,%,**(power)
     */

    static void main(String[] args) {
        int b =2
      def c = b ** 2
        println(c == 4)

        // pay attention double
        println(3/2 == 1.5)

        // to have int call intdiv()
        println((3.intdiv(2)) == 1)

        // cast
        def t = (int)(3/2)
        def t1 = (3/2) as Integer

        println(t==t1)


        // postfix and prefix

        def a = 2
        def d = a++ * 3
        assert a==3 && d==6


        def g = 4
        def m = --g + 1
        assert g ==3 && m ==4


        /*
        comparison
        ==, !=, <, <=,>,>=,
        ===(compare by link)
        !==(compare by link)

         */


        /*
        logical
        and &&
        or ||
        not !

         */


        /*
        bitwise

        & and
        | or
        ^ exclusive or
        ~ negation


         */

    }
}
