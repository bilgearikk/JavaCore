package org.example;

public class _05_Math {
    public static void main(String[] args) {

        System.out.println("En küçüğü: "+Math.min(3,10));
        System.out.println("En büyüğü: "+Math.max(3,10));
        System.out.println("Mutlak hali: "+Math.abs(-45));
        System.out.println("Karekök: "+Math.sqrt(36));
        System.out.println("Karekök: "+Math.sqrt(Math.abs(-25)));
        System.out.println("Üslü: "+Math.pow(2,5)); // 2 üzeri 5
        System.out.println("Alta yuvarla: "+Math.floor(2.9));
        System.out.println("Üste yuvarla: "+Math.ceil(2.9));
        System.out.println("Ortaya yuvarla: "+Math.round(3.41));
        System.out.println("Ortaya yuvarla: "+Math.round(3.85));
        System.out.println("Trigonometrik: "+Math.sin(90));
        System.out.println("Pı Sayısı: "+Math.PI);
        System.out.println("e Sayısı: "+Math.E);
    }
}
