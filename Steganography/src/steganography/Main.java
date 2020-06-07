package steganography;

public class Main 
{
    public static void main(String[] args) 
    {
        try
        {
            String fname = "d:/one.png";
            String q  = HeaderManager.getHeader(fname);
            System.out.println(q);
            long l = HeaderManager.getFileSize(q);
            String s = HeaderManager.getFileName(q);
            System.out.println("*** "+ l);
            System.out.println("*** "+ s);
        }
        catch(Exception ex)
        {
            System.out.println(ex); 
        }
    }
}
