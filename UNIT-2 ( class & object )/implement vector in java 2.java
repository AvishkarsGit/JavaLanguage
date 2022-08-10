import java.util.Vector;
class vectordemo {
    public static void main(String args[]){
        Vector v1 = new Vector();
        for(int i = 0;i<args.length;i++){
            v1.addElement(args[i]);
        }
        System.out.println("Size of vector ="+v1.size());
        System.out.println("Your ELments are :");
        for(int i = 0;i<v1.size();i++){
            System.out.println(v1.elementAt(i));
        }
    }

}