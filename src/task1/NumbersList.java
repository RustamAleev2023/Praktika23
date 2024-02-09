package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class NumbersList {
    private List<Integer> numbers;

    public NumbersList() {
        this.numbers = new ArrayList<>();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void add(int element){
        numbers.add(element);
    }

    public boolean delete(int element) {
        boolean result;
        if (numbers.contains(element)) {
            int index = numbers.indexOf(element);
            numbers.remove(index);
            result = true;
        } else {
            System.out.println("Такого элемента нет");
            result = false;
        }
        return  result;
    }

    public void print() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < numbers.size(); i++) {
            joiner.add(String.valueOf(numbers.get(i)));
        }
        System.out.println(joiner.toString());
    }

    public boolean isContains(int element){
        String result = numbers.contains(element) ? "Содержит" : "Не содержит";
        System.out.println(result);
        return numbers.contains(element);
    }

    public boolean update(int oldElement, int newElement){
        boolean result = false;
        if(numbers.contains(oldElement)){
            int index = numbers.indexOf(oldElement);
            numbers.remove(index);
            numbers.add(index, newElement);
            result = true;
        } else {
            System.out.println("Такого элемента нет");
        }
        return result;
    }
}
