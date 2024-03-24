public class stackheaptest {
    public int n = 7; // primitive data type on heap
    public static void changeIntMethod(int nV, int nRefn, stackheaptest nRef) {
        System.out.println("\tBefore nV: " + nV + ", nRefn: " + nRefn + ", nRef.n: " + nRef.n);
        nV += 10;
        nRefn += 10;
        nRef.n += 10;
        System.out.println("\tAfter nV: " + nV + ", nRefn: " + nRefn + ", nRef.n: " + nRef.n);
    }
    public static void main(String[] args) {
        int n = 7; // primitive data type on the stack
        stackheaptest nRef = new stackheaptest();
        System.out.println("Before n: " + n + " or " + System.identityHashCode(n) + ", nRef: " + nRef + " or " + System.identityHashCode(nRef) + ", nRef.n: " + nRef.n);
        changeIntMethod(n, nRef.n, nRef);
        System.out.println("After n: " + n + " or " + System.identityHashCode(n) + ", nRef: " + nRef + " or " + System.identityHashCode(nRef) + ", nRef.n: " + nRef.n);
    }
}







