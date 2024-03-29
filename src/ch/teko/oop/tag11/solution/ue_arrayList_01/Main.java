package ch.teko.oop.tag11.solution.ue_arrayList_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    // Implementieren Sie!
    public static boolean areSameNumberOfCooksAndMusicians(List<CrewMember> crewMembers) {
        ArrayList<CrewMember> cooks = new ArrayList<>();
        ArrayList<CrewMember> musicians = new ArrayList<>();

        Iterator<CrewMember> iterator= crewMembers.iterator();
        while (iterator.hasNext()) {
            CrewMember member = iterator.next();
            if (member.getProfession().equals(Profession.COOK)) {
                cooks.add(member);
            }
            else if (member.getProfession().equals(Profession.MUSICIAN)) {
                musicians.add(member);
            }
        }
        boolean result = false;

        if (cooks.size()==musicians.size()) {
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {
        CrewMember captain   = new CrewMember( "CiaoCiao", Profession.CAPTAIN );
        CrewMember cook1     = new CrewMember( "Remy", Profession.COOK );
        CrewMember cook2     = new CrewMember( "The Witch Cook", Profession.COOK );
        CrewMember musician1 = new CrewMember( "Mahna Mahna", Profession.MUSICIAN );
        CrewMember musician2 = new CrewMember( "Rowlf", Profession.MUSICIAN );

        List<CrewMember> crew1 = List.of( cook1, musician1 );
        System.out.println( areSameNumberOfCooksAndMusicians( crew1 ) ); // true

        List<CrewMember> crew2 = List.of( cook1, musician1, musician2, captain );
        System.out.println( areSameNumberOfCooksAndMusicians( crew2 ) ); // false

        List<CrewMember> crew3 = List.of( cook1, musician1, musician2, captain, cook2  );
        System.out.println( areSameNumberOfCooksAndMusicians( crew3 ) ); // true
    }
}
