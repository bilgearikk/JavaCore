package org.example;

public class _07_Autoboxing {
    public static void main(String[] args) {
        // primitive type'tan wrapper type'a dönüşüm
        int primitiveValue = 100;
        Integer wrapperValue = primitiveValue;

        // unboxing = wrapper -> primitive
        Integer wrapperValue2 = 200;
        int primitiveValue2 = wrapperValue2;
    }

}
