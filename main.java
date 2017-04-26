/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2;

/**
 *
 * @author jaime
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        league<Team<BasketballPlayer>> basketballleague = new league <>("NBA");
        Team<BasketballPlayer> Borregos = new Team<>("Borregos");
        Team<BasketballPlayer> Jaguares = new Team<>("Jaguares");
        Team<BasketballPlayer> Rino = new Team<>("Rino");
        Team<SoccerPlayer> Manchester = new Team<>("Manchester");
        Borregos.matchResult(Jaguares, 1, 0);
        Borregos.matchResult(Rino, 0, 2);
        
        basketballleague.add(Manchester); 
        basketballleague.add(Jaguares);
        basketballleague.add(Rino);
        basketballleague.add(Borregos);
        
    }
}

