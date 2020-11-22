package ru.geekbrains.courses.java_3.HomeWork1;

import java.util.ArrayList;
import java.util.Arrays;

public class  Main {

    public static void main(String[] args) {
        Box<Fruit> box = new Box<>();
        Box<Apple> boxa = new Box<>();
        boxa.addFruit(new Apple());
        boxa.transfer(box);
    }

    public static void swap (Object[] arr, int x1, int x2) {
        Object temp = arr[x1];
        arr[x1] = arr[x2];
        arr[x2] = temp;

    }


    public static <T> ArrayList<T> convert (T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }

    static class Box<T extends Fruit> {
        private ArrayList<T> list;


        public Box(T... arr)  {
            list = new ArrayList<T>(Arrays.asList(arr));
        }


        public float getWeight() {
            if (list.size() == 0) return 0.0f;
            return list.get(0).getWeight() * list.size();
        }

        private void addFruit(T fruit) {
            list.add(fruit);
        }

        public void addFruit(T... fruit) {
            for (int i = 0; i < fruit.length; i++) {
                list.add(fruit[i]);
            }
        }

        public boolean compare(Box another) {
            return Math.abs(this.getWeight() - another.getWeight()) < 0.000001;
        }

        public void transfer(Box<? super T> another) {
            another.list.addAll(this.list);
            this.list.clear();
        }


    }


//    abstract class Fruit {
//        protected float weight;
//
//        public abstract Fruit newInstance();
//
//        public float getWeight() { return weight; }
//
//        public Fruit (float weight) { this.weight = weight;}
//
//    }
//
//    class Orange extends Fruit {
//        public Orange() { super(1.5f);}
//
//        @Override
//        public Fruit newInstance() { return new Orange(); }
//    }
//
//    class Apple extends Fruit {
//        public Apple() {
//            super(1.0f);
//        }
//
//        @Override
//        public Fruit newInstance () { return new Apple(); }
//    }


}
