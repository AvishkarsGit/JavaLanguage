import java.util.Vector;
class vectordemo 
{
    public static void main(String args[])
	{
        Vector v1 = new Vector();
        v1.addElement(new Integer(100));
        v1.addElement(new Integer(200));
        v1.addElement(new Integer(300));
        v1.addElement(new Integer(400));
        v1.addElement(new Integer(500));
        v1.addElement(new Integer(600));
        System.out.println("Initial size of a vector ="+v1.size());
        v1.removeElementAt(3);
        v1.removeElementAt(4);
        v1.insertElementAt(100,4);
        System.out.println("Final size of a vector ="+v1.size());

    }
}
