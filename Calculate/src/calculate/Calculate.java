/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate;
import  java.lang.*;
/**
 *
 * @author traig
 */
public class Calculate {
    
    float a,b,c;
    float x1,x2;
    public Calculate(){
        a = 0F;
        b=0.F;
        c =0F;
    }
    
    public  Calculate(float a,float b,float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void calulate(){
        System.out.println(a +"\n" + b);
        if(a >= 0){
            float delta = b*b - 4*a*c;
            if(delta < 0){
                System.out.println("PHUONG TRINH VO NGHIEM!");
            }
            else if(delta == 0){
                System.out.println("PHUONG TRINH CO NGHIEM KEP!");
                x1 = x2 = b/(2*a);
            }
            else{
                double temp1 ;
                double temp2;
                System.out.println("PHUONG TRINH CO NGHIEM PHUC!");
                temp1 = -Math.sqrt(delta)/(2*a); 
                temp2 = (Math.sqrt(delta))/(2*a); 
                x1 = (float)temp1;
                x2 = (float)temp2;
            }
        }
        
    }
    public float getX1(){
        return x1;
    }
    public  float getX2(){
        return x2;
    }
    public float getDelta(){
        return  b*b - 4*a*c;
    }
}
