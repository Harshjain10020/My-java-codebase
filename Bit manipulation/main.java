/**
 * main
 */
public class main {
    public static void oddeven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static int getith(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static int setith(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearith(int n, int i) {
        int bitmask = ~(1 << i);
        return n | bitmask;
    }

    public static int updateith(int n, int i, int newBit) {
        // if (newBit == 0) {
        //     return clearith(n, i);
        // }else{
        //     return setith(n, i);
        // }
        clearith(n, i);
        int bitmask = newBit << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        // System.out.println(5&6);//AND
        // System.out.println(5|6);///OR
        // System.out.println(6^7);
        // System.out.println(~6);
        // oddeven(8);
        // System.out.println(getith(10, 1));
        // System.out.println(setith(10, 2));
        // System.out.println(clearith(10, 2));
        System.out.println(updateith(10, 2, 1));

    }
}