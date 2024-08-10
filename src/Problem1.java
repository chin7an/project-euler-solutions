/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of
 * these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

void main() {
    final int upto = 1000;
    //final int upto = 2000;

    System.out.println("naive: " + naiveFizzBuzz(upto));

    int optimal = multipleOfSumUpTo(3, upto) + multipleOfSumUpTo(5, upto) - multipleOfSumUpTo(15, upto);
    System.out.println("optimal: " + optimal);
}

int naiveFizzBuzz(int upto) {
    int sum = 0;
    for (int num = 1; num < upto; num++) {
        if (num % 3 == 0 || num % 5 == 0) {
            sum += num;
        }
    }
    return sum;
}

int multipleOfSumUpTo(final int multiplier, final int upto) {
    // use the summation formula, where 'n', or 'num' here is the largest integer, whose product with 'multiplier' does
    // not exceed 'upto'.
    var num = (upto - 1) / multiplier;
    return multiplier * ((num * (num + 1)) / 2);
}