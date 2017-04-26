/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author jaime
 */
public class league <T extends Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public league(String name) {
        this.name = name;
        
    }

    public boolean add(T Team) {
        if(league.contains(Team)){
            return false;
        } else { 
            league.add(Team);
            return true;
        }
    }
    
    public void showLeagueTable () {
      Collections.sort(league);
    for (T t:league) {
        System.out.println(t.getName()+ " : " + t.ranking());
        }
    }

}
