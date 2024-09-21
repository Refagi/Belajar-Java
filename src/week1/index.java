package latihan.week1;

public class index { // Nama kelas harus diawali huruf kapital
    public static void main(String[] args) { // Ubah menjadi public static

        index program = new index();

        // Menggunakan kelas inner untuk mengubah nama
        Name nameChanger = program.new Name();
        nameChanger.changeName();

        // Menggunakan kelas inner untuk memeriksa palindrom
        Palindrome palindromeChecker = program.new Palindrome();
        palindromeChecker.checkPalindrome();
    }

    // Kelas inner untuk memeriksa palindrom
    class Palindrome {
        public void checkPalindrome() {
            String a[] = {"m", "o", "m"};
            String original = String.join("", a);
            String reversed = "";

            for (int j = a.length - 1; j >= 0; j--) {
                reversed += a[j];
            }

            if (reversed.equalsIgnoreCase(original)) {
                System.out.println(original + " merupakan Palindrom");
            } else {
                System.out.println(original + " bukan Palindrom");
            }
        }
    }

    // Kelas inner untuk mengubah nama
    class Name {
        public void changeName() {
            String b[] = {"r", "e", "n", "o"};
            String name1 = "";
            String name2 = "";

            for (int i = 0; i < b.length; i++) {
                name1 += b[i];
            }
            for (int j = b.length - 1; j >= 0; j--) {
                name2 += b[j];
            }

            System.out.print("nama: " + name1 + "\n" + "name: " + name2 + "\n");
        }
    }
}
