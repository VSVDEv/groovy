package vsvdev.co.ua

class Loops {
    static void main(String[] args) {
//        while / for
        def list = [1, 2, 3, 4]
//        for (int i = 0; i <= list.size(); i++) {
//
//        }

        // the same as above
//        for (i in 0..list.size()) {
//            println i
//        }


//        for (Integer value : list) {
//            println value
//        }

        // the same as above
//        for (value in list) {
//            println value
//        }


//        0.upto(list.size()) {value ->
//            println value
//        }

//        list.size().downto(0) {
//            println it
//        }

        //0-3
//        list.size().times {
//            println it
//        }

// with step 2
        0.step(5, 2) {
            println it
        }
    }
}