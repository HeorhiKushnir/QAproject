package PracticeLesson10.Task3;

import java.util.Stack;

public class Queue
{
    private Stack<Integer> stackIn = new Stack<>();
    private Stack<Integer> stackOut = new Stack<>();

    public void enqueue(int num)
    {
            if (!stackOut.isEmpty())
            {
                stackIn.push(stackOut.pop());
            }

            stackIn.push(num);
            System.out.println(stackIn);
    }

    public void dequeue()
    {
        if(stackOut.isEmpty())
            while(!stackIn.isEmpty())
                stackOut.push(stackIn.pop());
        stackOut.pop();
        if (stackIn.isEmpty())
        {
            while (!stackOut.isEmpty())
            {
                stackIn.push(stackOut.pop());
            }
        }
        System.out.println(stackIn);
    }

        @Override
        public String toString() {return stackIn + "";
        }
}
