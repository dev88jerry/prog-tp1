/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 * Class pour faire des tests sur la class Assurance
 *
 * @author Jerry
 */
public class TP1 {

    /**
     * main pour faire des tests sur la class Assurance
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Assurance a = new Assurance();

        Boolean[] test = new Boolean[6];

        for (int i = 0; i < 6; i++) {
            test[i] = i % 2 == 0;
        }

        a.setDriverSit(test);

        Boolean[] test1 = a.getDriverSit();

        for (int i = 0; i < 6; i++) {
            System.out.println(test1[i]);
        }

    }

}
