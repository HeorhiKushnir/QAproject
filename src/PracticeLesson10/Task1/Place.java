package PracticeLesson10.Task1;


public class Place extends Student
{

    private Hostel hostel;
    private int room;

    public Place(String name)
    {
        super(name);
    }

    public Place(String name, Hostel hostel)
    {
        super(name);
        this.hostel = hostel;
    }

    public Place(Hostel hostel, int room) {
        this.hostel = hostel;
        this.room = room;
    }

    public Hostel getHostel()
    {
        return hostel;
    }

    public void setHostel(Hostel hostel)
    {
        this.hostel = hostel;
    }

    public int getRoom()
    {
        return room;
    }

    public void setRoom(int room)
    {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Place{" + "hostel=" + hostel + ", room=" + room + '}';
    }
}
