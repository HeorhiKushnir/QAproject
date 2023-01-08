package PracticeLesson7.HW2;

public class Worker implements People
{
    private String post;

    public Worker()
    {

    }

    public Worker(String post)
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
