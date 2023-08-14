class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fizzbuzz = new ArrayList<>(n);

        for(int i= 1; i<= n; i++){
            boolean divisibleBy3 = i%3 ==0;
            boolean divisibleBy5 = i%5 ==0;
            if(divisibleBy3 && divisibleBy5){
                fizzbuzz.add("FizzBuzz");
            }
            else if(divisibleBy3){
                fizzbuzz.add("Fizz");
            }
            else if(divisibleBy5){
                fizzbuzz.add("Buzz");
            }
            else{
                fizzbuzz.add(String.valueOf(i));
            }
        }
        return fizzbuzz;
    }
}
