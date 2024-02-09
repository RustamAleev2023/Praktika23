package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class NumbersList {
    private List<Integer> numbers;

    public NumbersList() {
        this.numbers = new ArrayList<>();
    }

    public void add(int element){
        numbers.add(element);
    }

    public void delete(int element) {
        if (numbers.contains(element)) {
            int index = numbers.indexOf(element);
            numbers.remove(index);
        } else {
            System.out.println("Такого элемента нет");
        }
    }

    public void print() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < numbers.size(); i++) {
            joiner.add(String.valueOf(numbers.get(i)));
        }
        System.out.println(joiner);
    }

    public void isContains(int element){
        String result = numbers.contains(element) ? "Содержит" : "Не содержит";
        System.out.println(result);
    }

    public void update(int oldElement, int newElement){
        if(numbers.contains(oldElement)){
            int index = numbers.indexOf(oldElement);
            numbers.remove(index);
            numbers.add(index, newElement);
        } else {
            System.out.println("Такого элемента нет");
        }
    }
}
