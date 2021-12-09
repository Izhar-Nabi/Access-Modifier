package Access;
import Access.SubClass;

public class Modifier {
    protected void Fun(){
        System.out.println("Public Function");
    }
    public static void main(String []args){
        Modifier Mod= new Modifier();
        SubClass Sub = new SubClass();
        Mod.Fun();
        Sub.Fun();


    }

}
