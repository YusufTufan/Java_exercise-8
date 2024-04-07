# Prime Number Checker
Bu Java programı, kullanıcının girdiği bir sayının asal olup olmadığını kontrol eder. Asal sayı, yalnızca kendisi ve 1'e bölünebilen, başka hiçbir pozitif tam sayıya bölünemeyen bir sayıdır.

## Kullanım
Programı çalıştırmak için bir Java IDE'si kullanarak veya terminalde aşağıdaki adımları takip ederek çalıştırabilirsiniz:

1. Java derleyicisi ile `primeNumber.java` dosyasını derleyin:  
   ```
   javac primeNumber.java
   ```

2. Oluşturulan `.class` dosyasını çalıştırın:  
   ```
   java primeNumber
   ```

3. Program, bir sayı girmenizi isteyecek. Bir sayı girin ve program, girilen sayının asal olup olmadığını kontrol edecektir.
4. 
## Asal Sayı Kontrolü
Program, girilen sayının asal olup olmadığını kontrol etmek için aşağıdaki adımları izler:

1. Girilen sayı 1'den küçük veya eşitse, program sayının asal olmadığını belirtir.
2. Aksi halde, sayının kareköküne kadar olan tüm tam sayıları deneyerek, girilen sayının asal olup olmadığını kontrol eder. Eğer bir tam sayıya bölünüyorsa, sayı asal değildir.

## Notlar
- Program, kullanıcıdan girdi almak için `Scanner` sınıfını kullanır.
- Asal sayı kontrolü için, sayının kareköküne kadar olan tam sayılar üzerinde bir döngü kullanılır.
- Program, girilen sayının asal olup olmadığını ekrana yazdırır.

Bu README dosyası, programın nasıl çalıştırılacağını, nasıl kullanılacağını, asal sayı kontrolü için nasıl işlediğini ve diğer bazı bilgileri açıklar. Ayrıca, katkıları nasıl yapabileceğiniz hakkında bilgi verir ve projenin lisansını belirtir.
