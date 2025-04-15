## Git
```
git init
    git add .
    git commit -m "add message"
    git push -u origin master
```

## Java Core Information
```
Java case senstive bir dildir

Paket isimleri: Küçük harflerle yazılır.
Paket isimleri: fiil olarak kullanmayız (mak-mek)
Paket kısa net bir şekilde olması gerekiyor.
  
```

## Maven Nedir?
```
Maven, Java projelerini oluşturmak, yönetmek ve otomatikleştirmek için kullanılan bir build automation (inşa otomasyonu) aracıdır. Apache tarafından geliştirilmiştir ve özellikle Java projelerinde bağımlılık yönetimi, derleme, test etme ve dağıtım süreçlerini kolaylaştırır. Maven, XML tabanlı bir yapılandırma dosyası olan pom.xml kullanarak projenin yapılandırmasını ve bağımlılıklarını yönetir.

Maven’in Sağladıkları:

Bağımlılık Yönetimi: Projeye eklenmesi gereken kütüphaneleri otomatik olarak indirir.
Proje Yapılandırması: Projeyi standart bir yapıda düzenler.
Otomatik Derleme: Projeyi derler (mvn compile).
Test Çalıştırma: JUnit ve TestNG gibi test araçlarıyla testleri çalıştırır (mvn test).
Paketleme: Projeyi jar veya war formatında paketler (mvn package).
Dağıtım Yönetimi: Uygulamayı uzak sunuculara veya depolara gönderir (mvn deploy).
```

## pom.xml nedir ?
```
pom.xml (Project Object Model) dosyası, Maven projelerinin merkezi yapılandırma dosyasıdır. Projenin bağımlılıklarını, sürüm bilgilerini, eklentilerini ve yapılandırmalarını içerir.
```

## JDK Nedir ?
```
JDK (Java Development Kit) Nedir?
JDK (Java Development Kit), Java ile uygulama geliştirmek için kullanılan geliştirme ortamıdır. İçerisinde:

JRE (Java Runtime Environment) (Çalışma zamanı ortamı)
JVM (Java Virtual Machine) (Java Sanal Makinesi)
Java Compiler (javac) (Java derleyicisi)
Java Debugger (jdb) (Hata ayıklayıcı)
Java API ve kütüphaneleri bulunur.
JDK olmadan Java kodu yazılamaz ve çalıştırılamaz.
```
## JRE Nedir?
```
JRE (Java Runtime Environment) Nedir?
JRE (Java Runtime Environment), Java uygulamalarını çalıştırmak için gereken ortamdır. İçerisinde:

JVM (Java Virtual Machine) bulunur.
Java Kütüphaneleri içerir.
Çalışma zamanı dosyaları bulunur.
Eğer sadece Java programlarını çalıştırmak istiyorsanız, 
JDK yerine sadece JRE yükleyebilirsiniz. Ancak, JRE Java kodu yazmak veya derlemek için yeterli değildir.
```

## JVM Nedir ?
```
JVM (Java Virtual Machine) Nedir?
JVM (Java Virtual Machine), Java programlarını çalıştıran sanal bir makinedir. JVM sayesinde Java platform bağımsızdır çünkü Java kodu her işletim sisteminde çalışabilecek bayt koduna (.class dosyalarına) çevrilir.

JVM’in Görevleri:

Bayt kodunu çalıştırır.
Bellek yönetimini yapar (Garbage Collection).
Çoklu iş parçacığını (multithreading) destekler.
Platform bağımsızlığı sağlar
```

## Compiler Nedir ?
```
Compiler (Derleyici) Nedir?
Compiler (Derleyici), insan tarafından yazılan yüksek seviyeli programlama dillerini makine koduna veya bayt koduna dönüştüren bir programdır. Java’da derleyici javac olarak adlandırılır.

Java'da Çalışma Süreci:

Java kodu yazılır: MyClass.java
Derleyici (javac) çalıştırılır: javac MyClass.java
Bayt kodu (.class dosyası) oluşturulur: MyClass.class
JVM bayt kodunu çalıştırır.
```

## Intepreter Nedir ?
```
Interpreter (Yorumlayıcı), programın satır satır çalıştırılmasını sağlayan bir programdır. Java’da JVM içerisinde yer alan yorumlayıcı (interpreter), bayt kodlarını satır satır çalıştırır.

Derleyici (Compiler) vs. Yorumlayıcı (Interpreter):

Derleyici: Tüm kodu derleyerek tek seferde çalıştırılabilir hale getirir.
Yorumlayıcı: Kodu satır satır çalıştırır.
```

## Java
```
Java, nesne yönelimli (OOP), platform bağımsız, güvenli, çok iş parçacıklı (multithreading) ve taşınabilir bir programlama dilidir.

1995’te Sun Microsystems tarafından geliştirildi.
"Bir kere yaz, her yerde çalıştır" (Write Once, Run Anywhere - WORA) prensibiyle çalışır.
Mobil, web, masaüstü ve büyük ölçekli sistemlerde kullanılır.
```

## Java'nın Özellikleri
```
Platform Bağımsızdır. (JVM sayesinde her yerde çalışır)
Nesne Yönelimli Programlama (OOP) Desteği vardır.
Güvenlidir. (Bellek yönetimi ve güvenlik mekanizmaları içerir)
Çok İş Parçacıklı (Multithreading) çalışmayı destekler.
Otomatik Bellek Yönetimi (Garbage Collection) yapar.
Dağıtık ve Ağ Tabanlı Uygulamaları Destekler.
```









