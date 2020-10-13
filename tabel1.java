public class tabel1
{
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            for (int j = 9; j >= 0; j--) {
                int desc = 10 - i;

                System.out.print(Math.min(desc, j));
            }
            System.out.print('\n');
        }
    }
}
