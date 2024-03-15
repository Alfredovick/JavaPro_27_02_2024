package ua.hillel.zirukin.homeworks.homework3;

public class runner {
    public static void main(String[] args) {

        className instance = classNameFactory.createClassName();
        classLogic.method1(instance);
        classLogic.method2(instance);
        classLogic.method3(instance);
    }
}
