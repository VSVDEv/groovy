package vsvdev.co.ua

class Strings {


    /*
    " "
    ' '
    """ """
    ''' '''
      / /
      $/ /$

     */

    static void main(String[] args) {

        def name = "SV"
        def name1 = 'SV "d" ' //we can use inside "" without spec character
        println(name1)

        def name2 = "SV \"d\" " // "" inside with caracter
        println(name2)


        def newValue = "my name is $name"
        println(newValue)


        def name3 = """SELECT* FROM

category ('id',"quantity");

"""
        println(name3)

        def name4 = "SELECT* FROM\n\ncategory ('id',\"quantity\");\n\n";
        println(name3 == name4)


        // !!!!!!!!!! pay attention $name doesn't work with ' ' and ''' '''


        // we can use method inside
        def newValue1 = "my name is ${addPrefix(name)}"
        println(newValue1)


        // for regex we don't need to compensate " and '
        def newValue2 = /my name is $name/
        println(newValue2)

        def newValue3 = $/my name is $name/$
        println(newValue3)

        // arrays
        println(name[0])
        println(name[-1])
        println(name[0..1])
        println(name*3)
        println(name-'S')
    }

    static def  addPrefix(String name){
        // if we don't specify return method automatically return last string
        //return 'prefix_'+ name
         'prefix_'+ name
    }
}
