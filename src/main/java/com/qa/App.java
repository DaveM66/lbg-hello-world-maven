package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("Alice"));
        System.out.println(sayHelloToSomeone("Bob"));
        System.out.println(sayHelloToSomeone("Charlie"));
        System.out.println(sayHelloToSomeone("Daniel"));
        System.out.println(sayHelloToSomeone("Edgar"));
        System.out.println(sayHelloToSomeone("Frank"));
        System.out.println(sayHelloToSomeone("Jonny"));
        System.out.println(sayHelloToSomeone("Katie"));
        System.out.println(sayHelloToSomeone("Loretta"));
        System.out.println(sayHelloToSomeone("Zena"));
                System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello World, welcome to my list!";
    }

    public static String sayGoodbye(){
        return "Bye Bye World!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
