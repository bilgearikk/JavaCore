package org.example;

public class _01_WrapperTypes {
    public static void main(String[] args) {

        byte primitiveTypeByte = 127;
        // primitiveTypeByte = null;
        System.out.println(primitiveTypeByte);
        short primitiveTypeShort = 2541;
        System.out.println(primitiveTypeShort);

        //WRAPPER TYPE null değer alabilir
        Byte wrapperTypeByte = 127;
        wrapperTypeByte = null;
        System.out.println(wrapperTypeByte);

        Short wrapperTypeShort = 2541;
        System.out.println(wrapperTypeShort);

    }
}
