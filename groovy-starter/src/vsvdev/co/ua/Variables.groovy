package vsvdev.co.ua

import groovy.transform.CompileStatic

//import java.sql.Date
//we can use alias because we have Date in util and sql
import java.sql.Date as SQLDate

class Variables {
/*
byte, short, int, long, BigInteger
float, double, BigDecimal
char
boolean
 */

    // dynamic type data
    //bad practice
    def val7 = "Don't use this feature"


    @CompileStatic
    static void main(String[] args) {
//!!!!!!!!!! Primitives Automatically box to classes int->Integer ...etc
        int val = 5
        Integer val1=5
        println val.getClass() == val1.getClass()

        BigInteger val3 = 36G
        BigDecimal val4 = 3.6G

        // alias usage
       print new SQLDate(678326482L).toGMTString()

     // @CompileStatic
     //  print new SQLDate()


        // dynamic type data
        def val6 = 75
        print(val6)
    }
}

