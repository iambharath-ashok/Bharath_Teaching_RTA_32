package javatraining.day6.staticexamples;

class Configuration {
    static String appName;

    static {
        appName = "MyApp";
        System.out.println("Configuration static block executed.");
    }
}
