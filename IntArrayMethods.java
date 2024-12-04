public class IntArrayMethods{

    public static int arraySum(int[] a){
        int sum = 0;
        for(int num:a){
            sum+=num;
        }
        return sum;
    }
    public static double arrayMean(int[] a){
        return (double)(arraySum(a))/a.length;
    }
    public static int arrayMin(int[] a){
        int least = a[0];
        for(int num:a){
            if(least>num){
                least = num;
            }
        }
        return least;
    }
    public static int arrayMax(int[] a){
        int max = a[0];
        for(int num:a){
            if(max<num){
                max = num;
            }
        }
        return max;
    }
    public static boolean[] arrayLocalMin(int[] a){
        boolean[] b = new boolean[a.length];
        if(a[0]<a[1]){
            b[0] = true;
        }else{
            b[0] = false;
        }
        if(a[a.length-1]<a[a.length-2]){
            b[b.length-1] = true;
        }else{
            b[b.length-1] = false;
        }
        for(int i=1; i<a.length-1; i++){
            if(a[i]<a[i-1] && a[i]<a[i+1]){
                b[i] = true;
            }else{
                b[i] = false;
            }
        }
        return b;
    }
    public static boolean[] arrayLocalMax(int[] a){
        boolean[] b = new boolean[a.length];
        if(a[0]>a[1]){
            b[0] = true;
        }else{
            b[0] = false;
        }
        if(a[a.length-1]>a[a.length-2]){
            b[b.length-1] = true;
        }else{
            b[b.length-1] = false;
        }
        for(int i=1; i<a.length-1; i++){
            if(a[i]>a[i-1] && a[i]>a[i+1]){
                b[i] = true;
            }else{
                b[i] = false;
            }
        }
        return b;
    }
    public static int arrayMode(int[] a){
       int mode = 0;
       int best = arrayCount(a, a[0]);
       for(int i=0; i<a.length;i++){
        if(arrayCount(a,a[i])>best){
            best = arrayCount(a, a[i]);
            mode = a[i];
        }
       }
       if(a.length == 1){
        mode = a[0];
       }
        return mode;
    }
    public static int arrayCount(int[] a, int b){
        int count = 0;
        for(int num:a){
            if(num == b){
                count++;
            }
        }
        return count;
    }
    public static boolean arrayContainsDuplicates(int[] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[i] == a[j] && i != j){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean arrayAllEqual(int[] a){
        int count = arrayCount(a, a[0]);
        if(count == a.length){
            return true;
        }else{
            return false;
        }
    }
    public static double[] arrayRollingAverage(int[] a, int b){
        double[] c = new double[a.length];
        for(int i=0; i<a.length; i++){
            if(i-b+1<0){
                for(int j=i; j>=0; j--){
                    c[i]+=a[j];
                }
                c[i]/=i+1;
            }else{
            for(int j = i; j>i-b; j--){
                c[i] += a[j];
            }
            c[i] /= b;
            }
        }
        return c;
    }
    public static int[] arrayShift(int[] a, int b){
        int[] c = new int[a.length];
        for(int i=0; i<a.length; i++){
            if(i-b<0){
                c[i] = a[a.length-b+i];
            }else{
                c[i] = a[i-b];
            }
        }
        return c;
    }
    public static int[] arrayReverse(int[] a){
        int[] c = new int[a.length];
        for(int i=0; i<a.length; i++){
            c[i] = a[a.length - (i+1)];
        }
        return c;
    }
}