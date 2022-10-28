/*
    @author Aakanksha Jain
 */
import java.io.*;
import java.util.*;

public class urinals
{
    public static void main(String[] args)
    {
        List<String> f = new ArrayList<>();
        try
        {
            f = fileRead();
        }
        catch (IOException e)
        {
            System.out.println("File was not found");
        }
        String[] arr = f.toArray(new String[0]);
        for(String s : arr)
        {
            int a = CountUrinal(s);
            try
            {
                fileWrite(a);
            }
            catch (IOException e)
            {
            }
        }

    }

    public static List<String> fileRead() throws IOException
    {
        List<String> Inp = new ArrayList<>();

        BufferedReader b = new BufferedReader(new FileReader("C:/Users//AAKANKSHA/urinal.dat"));

        String l = b.readLine();

        while (l != null)
        {
            Inp.add(l);
            l = b.readLine();
        }
        b.close();
        return Inp;
    }

    static int CountUrinal(String s)
    {
        int size = s.length();
        int temp[] = new int[size];
        int res = 0;
        int x;
        String[] a = s.split("\r\n ");
        for(int i =0;i< a.length; i++)
        {
            char[] b = a[i].toCharArray();
            for (int j = 0; j < b.length-1; j++)
            {
                if ((b[j] == '1') && (b[j + 1] == '1'))
                {

                    x = -1;
                }

            }
            x = 0;
            if (x == -1)
            {
                res =-1;
            }
            else if (x == 0)
            {
                for (int k = 0; k < b.length ; k++)
                {
                    if (k == 0)
                    {
                        if (b[k] == '0' && b[k+1]=='0')
                        {
                            b[k] = '1';
                            res = res + 1;

                        }
                    }
                    else if (k == b.length - 1)
                    {
                        if (b[k] == '0' && b[k-1]=='0')
                        {
                            b[k] = '1';
                            res = res+1;
                        }
                    }
                    else
                    {
                        if ((b[k - 1] == '0' && b[k] == '0' && b[k + 1] == '0') )
                        {
                            b[k]='1';
                            res = res+1;

                        }
                    }
                }
            }

        }
        return res;
    }
    public static void fileWrite(int r) throws IOException
    {
        FileWriter fs = new FileWriter("rule.txt");
        String ans = String.valueOf(r);
        fs.write(ans);
        fs.write("\n");
        System.out.println(ans);
        fs.close();
    }

}




