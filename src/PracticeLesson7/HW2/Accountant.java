package PracticeLesson7.HW2;

public class Accountant implements People
{
    private String post;

    public Accountant()
    {

    }

    public Accountant(String post)
    {
        this.post = post;
    }

    public void print()
    {
        System.out.println(post);
    }

    public String getPost()
    {
        return post;
    }
}
