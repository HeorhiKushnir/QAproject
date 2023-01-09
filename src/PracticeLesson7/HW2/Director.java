package PracticeLesson7.HW2;

public class Director implements People
{
    private String post;

    public Director()
    {

    }

    public Director(String post)
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
