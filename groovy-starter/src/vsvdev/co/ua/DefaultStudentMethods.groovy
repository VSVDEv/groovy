package vsvdev.co.ua

@Category(Student.class) //add additional functional for existing class
class DefaultStudentMethods {

    def testStr() {
        println "$age, $firstName"
    }

    static def anotherMethod(Student self, String value) {
        println "$self, args: $value"
    }
}
