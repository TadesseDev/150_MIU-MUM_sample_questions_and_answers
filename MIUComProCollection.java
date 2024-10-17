/* this code's are writen and compiled by Tadesse Alemayehu
- for any question you might have you can drop it on my email "tadAlem26@gmail.com"
- or contact me a@
        skypee "adesu.alemayehu1"
        telegram "@"
        twitter "@AddisuAlemayeh8"
        website "https://winmacsoul.com/"
        phone "+251921577930"
*/
// part one with 60 functions

package miu.com.pro.collection;

public class MIUComProCollection {

    public static void main(String[] args) {
        MIUComProCollection mainObject = new MIUComProCollection();
        MIUComProCollectionTEST test = new MIUComProCollectionTEST(mainObject);
        test.nextPerfectSquareTEST();
        test.n_upCountTEST();
        test.primeCountTEST();
        test.isMadhavIntTEST();
        test.isInertialTEST();
        test.countSquarePairsTest();
        test.porcupineNumberTest();
        //        System.out.println(mainObject.isGuthrieSequence(new int[]{8, 4, 2, 1}));
        //        System.out.println(mainObject.stantonMeasure(new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}));
        //        System.out.println(mainObject.sumFactor(new int[]{3, 0, 2, -5, 0}));
        //
        //        System.out.println(mainObject.guthrieIndex(3));
        //        System.out.println(mainObject.solve10()[1]);
        //        System.out.println(mainObject.repsEqual(new int[]{3,2,0, 5, 3},32053));
        //        System.out.println(mainObject.isCentered15(new int[]{1, 1, 15 -1,-1}));
        //        System.out.println(mainObject.henry(1,3));
        //        System.out.println(mainObject.isDivisible(new int[]{3, 3, 6, 36},3));
        //        System.out.println(mainObject.isNUnique(new int[]{7,3,3,2,4},11));
        //        System.out.println(mainObject.isSquare(16));
        //        System.out.println(mainObject.isLegalNumber(new int[]{3, 7, 1}, 6));
        //        System.out.println(mainObject.convertToBase10(new int[]{3, 7, 1}, 6));
        //
        //
        //        System.out.println(mainObject.haseNoZeroes(new int[]{3, 0, 1}));
        //        System.out.println(mainObject.computerDepth(7));
        //        System.out.println(mainObject.matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18},new int[]{3, -2, 3}));1, 9, 12
        //        System.out.println(mainObject.isStacked(4));
        //        System.out.println(mainObject.isSumSafe(new int[]{5, -5, 0}));
        //        System.out.println(mainObject.isIsolated(163));
        //        System.out.println(mainObject.isVanilla(new int[]{9, 999, 99999, -9999}));
        //        System.out.println(mainObject.isTrivalent(new int[]{1, 2, 2, 2, 2, 2, 2}));
        //        System.out.println(mainObject.isSequentiallyBounded(new int[]{0, 1}));
        //        System.out.println(mainObject.isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2}));
        //
        //
        //        System.out.println(mainObject.smallest(4));
        //            for(int element: mainObject.clusterCompression(new int[]{1,1,1,2,1,1,1,3,3,4})){
        //                System.out.println(element);
        //            }
        //        System.out.println(mainObject.isRailroadTie(new int[]{1, 2, 0, 1, 2, 0, 1, 2}));
        //        System.out.println(mainObject.fullnessQuotient(360));
        //        System.out.println(mainObject.isPacked(new int[]{7,7,7,7,7,7,7}));
        //        System.out.println(mainObject.isOddHeavy(new int[]{2,4,6,8}));
        //        System.out.println(mainObject.getExponent(128,4));
        //        System.out.println(mainObject.is121int[] { new int[]{1, 1, 2, 1, 2, 1, 1}));
        //        for(int element: mainObject.filterint[] { new int[]{0, 9, 12, 18, -6},1)){
        //            System.out.println(element);
        //        }
        //        System.out.println(mainObject.largestAdjacentSum(new int[]{18, -12, 9, -10}));
        //
        //
        //
        //        System.out.println(mainObject.checkConcatenatedSum(13332,4));
        //        System.out.println(mainObject.isSequencedint[] { new int[]{1, 2, 5},1,5));
        //        System.out.println(mainObject.largestPrimeFactor(6936));
        //        for(int element: mainObject.encodeNumber(1200)){
        //            System.out.println(element);
        //        }
        //        System.out.println(mainObject.matchPattern(new int[]{1, 1, 1, 2, 2, 1, 1, 3},8,new int[]{1, 2, 1, 3},4));
        //        mainObject.doIntegerBasedRounding(new int[]{-18, 1, 2, 3, 4, 5},4);
        //        System.out.println(mainObject.isCubePowerful(371));
        //        System.out.println(mainObject.decodeint[] { new int[]{-1, 5, 8, 17, 15}));
        //        System.out.println(mainObject.isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
        //        System.out.println(mainObject.isDigitIncreasing(984));
        //
        //
        //
        //        System.out.println(mainObject.decodeArray2(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
        //        System.out.println(mainObject.isOnionint[] { new int[]{1, 2, 19, 4, 5}));
        //        System.out.println(mainObject.isPrimeHappy(32));
        //            for(int element: mainObject.encodeint[] { -1)){
        //                System.out.println(element);
        //            }
        //        System.out.println(mainObject.isSystematicallyIncreasing(new int[]{1, 1, 2,1,2, 3}));
        //        System.out.println(mainObject.isFactorialPrime(3));
        //        System.out.println(mainObject.largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));
        //        System.out.println(mainObject.isHodder(127));
        //        System.out.println(mainObject.areAnagrams(new char[]{'b', 'o', 'g'},new char[]{'b', 'o', 'o'}));
        //        System.out.println(mainObject.closestFibonacci(34));
        // System.out.println(mainObject.sumIsPower(new int[] { 8, 8, 8, 8 }));

    }

    int isPrime(int a) {
        if(a<1)
            return 0;
        int i = 2;
        while (i < a) {
            if (a % i == 0)
                return 0;
            i++;
        }
        return 1;
    }
    int nextPerfectSquare(int a) {
        int square = 0;
        int i = 0;
        while (square <= a) {
            square = i * i;
            i++;
        }
        return square;
    }

    int n_upCount(int[] arr, int n) {
        int previousSum = 0;
        int currentSum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > n && previousSum <= n)
                count++;
            previousSum = currentSum;
        }
        return count;
    }

    int primeCount(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            int j = 2;
            while (j < i) {
                if (i % j == 0)

                    break;
                j++;
            }
            if (j == i)
                count++;
        }
        return count;
    }

    int isMadhavInt(int[] a) {

        // check if the array is Madhav
        boolean isMadhave = false;
        for (int i = 0; i < a.length; i++) {
            int sum = i * (i + 1) / 2;
            if (sum == a.length)
                isMadhave = true;
            if (sum > a.length || isMadhave)
                break;
        }
        if (!isMadhave)
            return 0;

        // validate id the elements satisfy madhave
        int madhaveSum = a[0];
        int window = 1;
        for (int i = 0; i < a.length;) {
            int sum = 0, j = i;
            while (j < (i + window)) {
                sum += a[j];
                j++;
            }
            i = j;
            if (sum != madhaveSum)
                return 0;
            window++;
        }
        return 1;
    }


    int isInertial(int[] a) {
        if(a.length<2)
            return 0;
        int max = a[0];
        int minOdd = a[0];

        // find max
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        // rule 1
        // assert max is even
        if (max % 2 != 0)
            return 0;

        // find minimum odd value
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                if(minOdd%2==0 || a[i]<minOdd){
                    minOdd = a[i];
            }
            }
        }

        // rule 2
        // it contain at least one odd value
        if(minOdd%2==0)
            return 0;

        // rule 3
        // check if minOdd is greater than all even value
        for(int i=0;i<a.length;i++){
            if (a[i] % 2 == 0) {
                // if there is an even value that is greater than the min odd and different from the maximum value
                if(a[i]>minOdd && a[i]!=max)
                    return 0;
            }
        }
        return 1;
    }


    int countSquarePairs(int[] a) {
        if(a.length<2)
            return 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 1)
                continue;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < 1)
                    continue;
                if (a[i] != a[j] && isPerfectSquare(a[i] + a[j]))
                    count++;
            }
        }
        return count;
    }


    boolean isPerfectSquare(int a) {
        for (int i = 0; i * i <= a; i++) {
            if (i * i == a)
                return true;
        }
        return false;
    }


    int porcupineNumber(int n) {
        // considering there always exist a porcupineNumber we can inter a loop and stay init till we found it
        int porcupine = 0;
        for (int i = n + 1; porcupine == 0; i++) {
            if (n % 10 == 9 && isPrime(n)==1) {
                int nextPrime = 0;
                for (int j = i + 1; nextPrime == 0; j++) {
                    if (isPrime(j)==1)
                        nextPrime = j;
                }
                if (nextPrime % 10 == 9)
                    porcupine = i;
            }
        }
        return porcupine;
    }
    // end of class main class

}


// class for running different test cases on a method
class MIUComProCollectionTEST {

    MIUComProCollection mainObject;
    public MIUComProCollectionTEST(MIUComProCollection mainObject) {
        this.mainObject = mainObject;
    }

    void nextPerfectSquareTEST() {
        int res1 = mainObject.nextPerfectSquare(6);
        int res2 = mainObject.nextPerfectSquare(36);
        int res3 = mainObject.nextPerfectSquare(0);
        int res4 = mainObject.nextPerfectSquare(-5);
        if (res1 == 9 && res2 == 49 && res3 == 1 && res4 == 0) {
            System.out.println("nextPerfectSquareTEST passed");
        } else {
            System.out.println("nextPerfectSquareTEST failed");
            System.out.println(res1 + " " + res2 + " " + res3 + " " + res4);
        }
    }



    void n_upCountTEST() {
        int res1 = mainObject.n_upCount(new int[] { 2, 3, 1, -6, 8, -3, -1, 2 }, 5);
        int res2 = mainObject.n_upCount(new int[] { 6, 3, 1 }, 1);
        int res3 = mainObject.n_upCount(new int[] { 6, 3, 1 }, 0);
        int res4 = mainObject.n_upCount(new int[] { 6, 3, 1 }, -1);
        int res5 = mainObject.n_upCount(new int[] { 0, 8, -6, -7, 10, 5 }, 6);
        if (res1 == 3 && res2 == 1 && res3 == 1 && res4 == 0 && res5 == 2) {
            System.out.println("n_upCountTEST passed");
        } else {
            System.out.println("n_upCountTEST failed");
            System.out.println(res1 + " " + res2 + " " + res3 + " " + res4 + " " + res5);
        }
    }

    void primeCountTEST() {
        int res1 = mainObject.primeCount(10, 30);
        int res2 = mainObject.primeCount(11, 29);
        int res3 = mainObject.primeCount(20, 22);
        int res4 = mainObject.primeCount(1, 1);
        int res5 = mainObject.primeCount(5, 5);
        int res6 = mainObject.primeCount(6, 2);
        int res7 = mainObject.primeCount(-10, 6);
        if (res1 == 6 && res2 == 6 && res3 == 0 && res4 == 0 && res5 == 1 && res6 == 0 && res7 == 3) {
            System.out.println("primeCountTEST passed");
        } else {
            System.out.println("primeCountTEST failed");
            System.out.println(res1 + " " + res2 + " " + res3 + " " + res4 + " " + res5 + " " + res6 + " " + res7);
        }
    }

    void isMadhavIntTEST() {
        int res1 = mainObject.isMadhavInt(new int[] { 2, 1, 1 });
        int res2 = mainObject.isMadhavInt(new int[] { 2, 1, 1, 4, -1, -1 });
        int res3 = mainObject.isMadhavInt(new int[] { 6, 2, 4, 2, 2, 2, 1, 5, 0, 0 });
        int res4 = mainObject.isMadhavInt(new int[] { 18, 9, 10, 6, 6, 6 });
        int res5 = mainObject.isMadhavInt(new int[] { -6, -3, -3, 8, -5, -4 });
        int res6 = mainObject.isMadhavInt(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1 });
        int res7 = mainObject.isMadhavInt(new int[] { 3, 1, 2, 3, 0 });
        if (res1 == 1 && res2 == 1 && res3 == 1 && res4 == 0 && res5 == 0 && res6 == 1 && res7 == 0) {
            System.out.println("primeCountTEST passed");
        } else {
            System.out.println("primeCountTEST failed");
            System.out.println(res1 + " " + res2 + " " + res3 + " " + res4 + " " + res5 + " " + res6 + " " + res7);
        }
    }

    void isInertialTEST() {
        int res1 = mainObject.isInertial(new int[]{1});
        int res2 = mainObject.isInertial(new int[]{2});
        int res3 = mainObject.isInertial(new int[]{1, 2, 3, 4});
        int res4 = mainObject.isInertial(new int[]{1, 1, 1, 1, 1, 1, 2});
        int res5 = mainObject.isInertial(new int[]{2, 12, 4, 6, 8, 11});
        int res6 = mainObject.isInertial(new int[]{2, 12, 12, 4, 6, 8, 11});
        int res7 = mainObject.isInertial(new int[]{-2, -4, -6, -8, -11});
        int res8 = mainObject.isInertial(new int[]{2, 3, 5, 7});
        int res9 = mainObject.isInertial(new int[]{2, 4, 6, 8, 10});
        if (res1 == 0 && res2 == 0 && res3 == 0 && res4 == 1 && res5 == 1 && res6 == 1 && res7 == 0 && res8 == 0 && res9 == 0) {
            System.out.println("isInertialTEST passed");
        } else {
            System.out.println("isInertialTEST failed");
            System.out.println(res1 + " " + res2 + " " + res3 + " " + res4 + " " + res5 + " " + res6 + " " + res7 + " " + res8 + " " + res9);
        }
    }

    void countSquarePairsTest() {
        int res1 = mainObject.countSquarePairs(new int[] { 9 });
        int res2 = mainObject.countSquarePairs(new int[] { 9, 0, 2, -5, 7 });

        if (res1 == 0 && res2 == 2)
            System.out.println("countSquarePairsTest passed");
        else
            System.out.println("countSquarePairsTest failed");
    }

    void porcupineNumberTest() {
        int res1 = mainObject.porcupineNumber(5);
        int res2 = mainObject.porcupineNumber(13);
        int res3 = mainObject.porcupineNumber(300);
        int res4 = mainObject.porcupineNumber(900);
        int res5 = mainObject.porcupineNumber(-5);
        if (res1 == 139 && res2 == 139 && res3 == 1 && res4 == 0 && res5 == 139)
            System.out.println("PorcupineNumberTest passed");
        else
            System.out.println("PorcupineNumberTest failed");
    }

}
