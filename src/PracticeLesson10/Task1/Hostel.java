package PracticeLesson10.Task1;

public class Hostel
{
    private String title;
    private String address;

    public Hostel()
    {

    }

    public Hostel(String title, String address)
    {
        this.title = title;
        this.address = address;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Hostel{" + "title='" + title + '\'' + ", address='" + address + '\'' + '}';
    }
}
