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

        int primitiveValue = 100;
        Integer wrapperValue = primitiveValue; // Autoboxing
        // Burada primitiveValue, otomatik olarak Integer nesnesine dönüştürülür ve heap’te saklanır.

        Integer wrapperValue2 = 200;
        int primitiveValue2 = wrapperValue2; // Unboxing
        //wrapperValue, heap’ten alınıp stack’te saklanan primitiveValue değişkenine atanır.

        //List<int> list = new ArrayList<>(); hatalıdır çünkü primitive, collectionslarda kullanılmaz
        // List<Integer> list = new ArrayList<>(); wrapper kullanılır
    }
}
