package Access;
import DifPack.DifClass;

class SubClass {
    protected void Fun(){
        System.out.println("Private Function");
    }
    public static void main(String []args){
        SubClass Sub = new SubClass();
        DifClass Diff = new DifClass();
        Sub.Fun();
    }
}
