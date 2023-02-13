/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicestudentlist;

/**
 *
 * @author trees
 */
public class Practicestudentlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        studnet[] list= new studnet[3];
        studnet s2=new studnet();
        s2.setAge(2);
        s2.setName("Trafd");
          studnet s3=new studnet();
        s3.setAge(2);
        s3.setName("Trafd");
        list[0]=s2;
        list[1]=s3;
        for(int i=0;i<list.length;i++){
            System.out.println(list[i].getName()+list[i].getAge()); 
                
        }
        
        
    }
    
}
