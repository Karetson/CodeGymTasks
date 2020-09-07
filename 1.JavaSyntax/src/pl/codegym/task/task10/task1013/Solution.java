package pl.codegym.task.task10.task1013;

/* 
Konstruktory klasy Ludzie
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Ludzie {
        // Wprowadź tu swoje zmienne i konstruktory
        private String name;
        private String surname;
        private int age;
        private int height;
        private String weight;
        private double salary;

        public Ludzie() {
        }

        public Ludzie(String name) {
            this.name = name;
        }

        public Ludzie(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Ludzie(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Ludzie(String name, String surname, int age, int height) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.height = height;
        }

        public Ludzie(String name, String surname, int age, int height, String weight) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Ludzie(String name, String surname, int age, int height, String weight, double salary) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.salary = salary;
        }

        public Ludzie(String name, String surname, double salary) {
            this.name = name;
            this.surname = surname;
            this.salary = salary;
        }

        public Ludzie(String name, String surname, int height, String weight) {
            this.name = name;
            this.surname = surname;
            this.height = height;
            this.weight = weight;
        }

        public Ludzie(String name, String surname, int age, double salary) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.salary = salary;
        }
    }
}
