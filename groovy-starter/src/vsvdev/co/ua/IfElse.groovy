package vsvdev.co.ua

class IfElse {

    /**
     * boolean          is true
     * Collection/Map   is not empty
     * Matcher          has match
     * String/GString   is not empty
     * Number/Char      != 0
     * reference        != null
     *
     * asBoolean
     */
    static void main(String[] args) {
        int x = 10
//        boolean booleanResult = x > 0
        if (x) {
            println x
        }

        def person = new Person(19)
        if (person) {
            println person.getId()
        }

//        if (person != null) {
//            person.getId()
//        }
        // the same as above
//        person?.getId()


        if (x) {
            println x
        } else {
            println 1
        }
// the same as above
//        def result = x ? x : 1
        def result = x ?: 1
        println result
    }
}


class Person {

    private final Integer id;

    public Person(Integer id) {
        this.id = id;
    }

    public boolean asBoolean() {
        return id > 10;
    }

    public boolean isCase(Object switchValue) {
        System.out.println("invoke isCase: " + switchValue);
        return false;
    }

    public Integer getId() {
        return id;
    }
}