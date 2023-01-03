package PracticeLesson6;

public class CreditCard
{
    public int cardNum;
    public float curCardSum;

    public CreditCard(int cardNum, float curCardSum)
    {
        this.cardNum = cardNum;
        this.curCardSum = curCardSum;
    }

    public float deposit(float a, float b)
    {
        return a + b;
    }
    public float withdraw (float a, float b)
    {
        return a - b;
    }
    @Override
    public String toString()
    {
        return "Номер карты: " + cardNum + ", Баланс карты: " + curCardSum + ".";
    }
}
