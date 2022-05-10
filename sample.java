class sample
{ 
    public void test(int count)
    {
        if(count==0)
        System.out.println(" ");
        else
        {
            System.out.println("bye"+count);
            test(--count);
            System.out.println(" "+count);
        }
    }
}