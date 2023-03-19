// public class mn2 {
//            public static void main(String[] args) {
//                System.out.println(buildString(6, 'a', 'b')); // ababab
        
//            }
        
//            /**
//             * Дано четное число N (>0) и символы c1 и c2.
//             * Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
//             */
//            private static String buildString(int n, char first, char second) {
//                String str = new String();
//                for (int i = 0; i < n; i++) {
//                    str += (i % 2 == 0) ? first : second;
//                }
//                return str;
//            }
// }

import java.nio.file.Files;
import java.nio.file.Path;

public class mn2 {
    // 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
    // Если уже файл создан, то перезаписываем его. 
    public static void main(String[] args) {
        String path = "HW2/file.txt";
        recreateFile(path);
        writeFile10x10(path, "TEST");
    }

    