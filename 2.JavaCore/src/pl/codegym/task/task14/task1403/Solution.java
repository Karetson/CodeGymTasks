package pl.codegym.task.task14.task1403;

/* 
Budynek i szkoła
*/

public class Solution {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        //tutaj wpisz swój kod
        Building school = new School();
        return school;
    }

    public static Building getBuilding() {
        //tutaj wpisz swój kod
        Building building = new Building();
        return building;
    }

    static class School extends Building {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
