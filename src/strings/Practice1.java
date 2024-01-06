package strings;


public class Practice1 {
	 
    // Function to find if given number is
    // equal to length or not
    static boolean isequal(String str)
    {
        int n = str.length();
 
        // Traverse string from end and find the number
        // stored at the end.
        // x is used to store power of 10.
        int num = 0, x = 1, i = n - 1;
        for (i = n - 1; i >= 0; i--)
        {
            if ('0' <= str.charAt(i) &&
                str.charAt(i) <= '9')
            {
                num = (str.charAt(i) - '0') * x + num;
                x = x * 10;
                if(num>=n)
                    return false;
            }
            else
                break;
        }
 
        // Check if number is equal to string
        // length except that number's digits
        return num == i + 1;
    }

	public static void main(String[] args) {
		String str = "";
        if (isequal(str))
            System.out.println("Yes");
        else
            System.out.println("No");	
	}
	
}
