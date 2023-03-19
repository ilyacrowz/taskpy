public class mn2 {
           public static void main(String[] args) {
               System.out.println(buildString(6, 'a', 'b')); // ababab
        
           }
        
           /**
            * Дано четное число N (>0) и символы c1 и c2.
            * Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
            */
           private static String buildString(int n, char first, char second) {
               String str = new String();
               for (int i = 0; i < n; i++) {
                   str += (i % 2 == 0) ? first : second;
               }
               return str;
           }

        // Создать файл с названием file.txt. Если файл уже есть, то создавать не надо Записать в него Слово "TEXT" 100 раз
        private void write(final String s) throws IOException {
            FileWriter fw = null;
            BufferedWriter bw = null;
            PrintWriter out = null;
            try {
                fw = new FileWriter("myfile.txt", true);
                bw = new BufferedWriter(fw);
                out = new PrintWriter(bw);
                for(i = 0, i < 100, i++) {
                    out.println("text ");
                }
                out.close();
            } catch (IOException e) {
                //exception handling left as an exercise for the reader
            }
            finally {
                try {
                    if(out != null)
                        out.close();
                } catch (IOException e) {
                    //exception handling left as an exercise for the reader
                }
                try {
                    if(bw != null)
                        bw.close();
                } catch (IOException e) {
                    //exception handling left as an exercise for the reader
                }
                try {
                    if(fw != null)
                        fw.close();
                } catch (IOException e) {
                    //exception handling left as an exercise for the reader
                }
            }
        }
}

