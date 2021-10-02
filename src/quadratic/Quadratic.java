/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;

/**
 *
 * @author Abdul Moiz Chishti
 */
import java.lang.Math;
public class Quadratic {

    public static void main(String[] args) {
        int a=1,b=5,c=1;
        double posroot=0;
        double negroot=0;
        posroot= (-b + Math.sqrt((b*b)- (4*a*c)))/2*a;
        negroot   = (-b - Math.sqrt((b*b)- (4*a*c)))/2*a;
        System.out.println("The roots are "+posroot+ " and the other root is "+ negroot);   
    } 
}
