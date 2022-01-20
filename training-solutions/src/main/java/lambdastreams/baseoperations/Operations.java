package lambdastreams.baseoperations;

import java.util.*;

public class Operations {

    private List<Integer> numbers;

    public Operations(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Optional<Integer> min() {
        if (numbers.isEmpty()) {
            return Optional.empty();
        }

        return numbers.stream().min(Comparator.naturalOrder());
    }

    public Integer sum() {
        if (numbers.isEmpty()) {
            return 0;
        }
        return numbers.stream().reduce(Integer::sum).orElse(0);
    }

    public boolean isAllPositive() {
        return numbers.stream().allMatch(integer -> integer > 0);
    }

    public Set<Integer> getDistinctElements() {
        Set<Integer> result = new HashSet<>();
        numbers.stream().distinct().forEach(result::add);
        return result;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
