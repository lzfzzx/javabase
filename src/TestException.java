/**
 * Created by Lzf on 2018/9/7.
 */
//异常处理机制：
    /*
    try catch嵌套
    经测试，只要第一次捕获异常并处理了之后，外层的try catch 就只执行finally，除非catch处理完后还有异常，再交由它外一层的
    try catch处理
    * */
public class TestException
{
    public TestException()
    {
    }
    boolean testEx()
    {
        boolean ret = true;
        try
        {
            ret =testEx1();
        }
        catch (Exception e)
        {
            System.out.println("testEx,catch exception");
            ret =false;
            throw e;
        }
        finally
        {
            System.out.println("testEx,finally; return value=" + ret);
            return ret;
        }
    }
    boolean testEx1()
    {
        boolean ret = true;
        try
        {
            ret =testEx2();//false
            if(!ret)
            {
                return false;
            }
            System.out.println("testEx1,at the end of try");
            return ret;
        }
        catch (Exception e)
        {
            System.out.println("testEx1,catch exception");
            ret =false;
            throw e;
        }
        finally
        {
            System.out.println("testEx1,finally; return value=" + ret);
            return ret;
        }
    }
    boolean testEx2() throws Exception
    {
        boolean ret = true;
        try
        {
            int b =12;
            int c;
            for(int i = 2; i >= -2; i--)
            {
                c= b / i;
                System.out.println("i="+ i);
            }
            return true;
        }
        catch (Exception e)
        {
            System.out.println("testEx2,catch exception");
           // System.out.println(2/0);
            ret =false;


            throw e;
        }
        finally
        {
            System.out.println("testEx2,finally; return value=" + ret);
            return ret;
        }
    }
    public static void main(String[] args)
    {
        TestException testException1 =new TestException();
        try
        {
            testException1.testEx();
        }
        catch (Exception e)
        {
            e.printStackTrace();
           // System.out.println(e);
        }
    }
}
