import java.util.*;
public class colorselector {
    public static void main(String[] args){
        String[] d=new String[5];
        d[0]="red";
        d[1]="green";
        d[2]="blue";
        d[3]="yellow";
        d[4]="orange";

        for (int i=0;i<d.length;i++){
            if(d[i].equals("red")){
                System.out.println("car number " +i+" is red");
            }
            else{
                System.out.println("car number "+i+" is not red");
            }
        }
    }
}
