# Groovy

https://groovy-lang.org

## Content

[Install](#install)

[Commands](#commands)

[Help ](#help)

[First app](#first-app)

[Files](#files)

[Variables](#variables)

[Operators](#operators)

[String](#string)

[Regex](#regex)

[Closure](#closure)

[Loops](#loops)

[List](#list)

[Map](#map)

[Range](#range)

[Object iteration](#object-iteration)

[OOP](#oop)

[Trait](#trait)

[IO](#io)

[Meta class](#meta-class)

[Missing method and property](#missing-method-and-property)

[Categories](#categories)

[Practice](#practice)


[DSL](#dsl)



### Install

http://groovy-lang.org/install.html

required java 8+ to check `java -version`

[Content](#content)

#### Windows

Download zip ->unzip (C:\groovy) 
-> add to path C:\groovy\groovy-4.0.8\bin

[Content](#content)

### Comands

`groovy -version` check version

[Content](#content)

### Groovy help
[Content](#content)

---


### Typical projects

#### Maven [link to folder](groovy-maven-starter)

#### Gradle [link to folder](groovy-gradle-starter)

#### IDE [link to folder](groovy-starter)

[Content](#content)

you need to add library(groovy) in settings 


### First app

[link to code](groovy-starter/src/vsvdev/co/ua/Hello.groovy)

[link to code](groovy-starter/src/vsvdev/co/ua/FirstScript.groovy)

[Content](#content)

### Files

We can create class or script

 class file  `Hello.groovy`

```groovy

package vsvdev.co.ua

class Hello {
    //by default modifier is private
    Integer val;
    static void main(String[] args) {
        println "Hello world!"
    }
}
```
class under hood implements `GroovyObject`

Script file  `FirstScript.groovy`

```groovy
package vsvdev.co.ua

print("Hello world!!!")


```
script file under hood extends `Script` class which extends `GroovyObjectSupport` wich implements `GroovyObject`

Make sure that groovy is dynamic and if we want to check before compilation syntax we should use `@CompileStatic`

[Content](#content)



### Variables

[link to code](groovy-starter/src/vsvdev/co/ua/Variables.groovy)

[Content](#content)


### Operators

[link to code](groovy-starter/src/vsvdev/co/ua/Operators.groovy)

[link to code](groovy-starter/src/vsvdev/co/ua/IfElse.groovy)

[link to code](groovy-starter/src/vsvdev/co/ua/Switch.groovy)

[Content](#content)


### String 

[link to code](groovy-starter/src/vsvdev/co/ua/Strings.groovy)

[Content](#content)


### Regex

[link to code](groovy-starter/src/vsvdev/co/ua/Regex.groovy)

[Content](#content)




### Closure

[link to code](groovy-starter/src/vsvdev/co/ua/Closure.groovy)

[link to code](groovy-starter/src/vsvdev/co/ua/Closure2.groovy)

[Content](#content)

### Loops

[link to code](groovy-starter/src/vsvdev/co/ua/Loops.groovy)

[Content](#content)


### List

[link to code](groovy-starter/src/vsvdev/co/ua/DataList.groovy)

[Content](#content)



### Map

[link to code](groovy-starter/src/vsvdev/co/ua/DataMap.groovy)

[Content](#content)




### Range

[link to code](groovy-starter/src/vsvdev/co/ua/DataRange.groovy)

[Content](#content)




### Object iteration

[link to code](groovy-starter/src/vsvdev/co/ua/Iterate.groovy)

[Content](#content)




### OOP

[link to code](groovy-starter/src/vsvdev/co/ua/OOP.groovy)

[Content](#content)




### Trait

[link to code](groovy-starter/src/vsvdev/co/ua/WithId.groovy)

[Content](#content)




### IO

[link to code](groovy-starter/src/vsvdev/co/ua/IO.groovy)

[Content](#content)




### Meta class

[link to code](groovy-starter/src/vsvdev/co/ua/CustomMetaClass.groovy)

[Content](#content)



### Missing method and property

[link to code](groovy-starter/src/vsvdev/co/ua/MissingMethod.groovy)

[Content](#content)





### Categories

[link to code](groovy-starter/src/vsvdev/co/ua/CategoryR.groovy)

[Content](#content)


### Practice

[link to code](groovy-starter/src/vsvdev/co/ua/Task1.groovy)

[link to code](groovy-starter/src/vsvdev/co/ua/Task2.groovy)

[link to code](groovy-starter/src/vsvdev/co/ua/Task3.groovy)

[Content](#content)




### DSL

[link to folder](groovy-starter/src/vsvdev/co/ua/dsl)

[Content](#content)
