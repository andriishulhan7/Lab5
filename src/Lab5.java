
public class Lab5 {
    private static void fill_an_array(int[] array)
    {

        for (int i = 0; i<array.length; i++)
            array[i] = array.length - 1 - i;
        System.out.printf("array = { ");
        for (int item : array)
            System.out.printf("%d ",item);
        System.out.printf("}\n");
    }

    private static int find_min(int[] array)
    {
        int min  = array[0];
        for (int i = 1;i<array.length;i++)
            if(array[i] < min) min = array[i];
        return min;
    }
    private static int find_max(int[] array)
    {
        int max  = array[0];
        for (int i = 1;i<array.length;i++)
            if(array[i] > max) max = array[i];
        return max;
    }
    private static int run_task3()
    {
        int sum = 0;
        int[][] matrix = new int[10][10];
        for (int i = 0;i<matrix.length;i++) {
            matrix[i][i] = i;
            sum += matrix[i][i];
        }
        for (int i = 0;i<matrix.length;i++) {
            for (int item : matrix[i])
                System.out.printf("%d ",item);
            System.out.printf("\n");
        }
        return sum;
    }
    private static String concat(String s1,String s2)
    {
        return s1+s2;
    }
    private static boolean isPalindrom(String s)
    {
        int charactersSimilar = 0;
        for (int i = 0;i<s.length();i++)
            if(s.charAt(i) == s.charAt(s.length() - i - 1))
                charactersSimilar++;
        return charactersSimilar == s.length();
    }
    public static void main(String[] args)
    {
        // Task 1
        int[] array = new int[10];
        fill_an_array(array);
        // Task 2
        System.out.printf("minimum value in array is %d\n",find_min(array));
        System.out.printf("maximum value in array is %d\n\n",find_max(array));
        // Task 3
        int result = run_task3();
        System.out.printf("\nThe sum of the elements on the diagonal is %d\n",result);
        // Task 4
        System.out.println(concat("Ja","va"));
        // Task 5
        System.out.println(isPalindrom("civic"));
    }
}
