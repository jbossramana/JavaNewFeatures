package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class FluentListProcessor {
    private List<Integer> numbers;

    private FluentListProcessor(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static FluentListProcessor fromList(List<Integer> numbers) {
        return new FluentListProcessor(new ArrayList<>(numbers));
    }

    public FluentListProcessor filter(Predicate<Integer> predicate) {
        numbers.removeIf(value -> !predicate.test(value));
        return this;
    }

    public FluentListProcessor map(Function<Integer, Integer> mapper) {
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, mapper.apply(numbers.get(i)));
        }
        return this;
    }

    public FluentListProcessor forEach(Consumer<Integer> consumer) {
        numbers.forEach(consumer);
        return this;
    }

    public List<Integer> getResult() {
        return new ArrayList<>(numbers);
    }
}


