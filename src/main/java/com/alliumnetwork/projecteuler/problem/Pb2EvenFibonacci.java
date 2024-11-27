package com.alliumnetwork.projecteuler.problem;

import java.util.ArrayList;
import java.util.List;

public class Pb2EvenFibonacci {

  private static long sumEvenFibonacci(int limit) {
    List<Integer> fibonacciNumbers = generateFibonacci(limit);
    return fibonacciNumbers.stream().filter(i -> i % 2 == 0).mapToLong(i -> i).sum();
  }

  private static List<Integer> generateFibonacci(int limit) {
    int a = 1;
    int b = 2;
    List<Integer> fibonacciNumbers = new ArrayList<>();
    fibonacciNumbers.add(a);
    fibonacciNumbers.add(b);
    for (int i = 2; i < limit; i++) {
      int c = a + b;
      if (c > limit) {
        break;
      }
      a = b;
      b = c;
      fibonacciNumbers.add(c);
    }
    return fibonacciNumbers;
  }

  public static void main(String[] args) {
    System.out.println(sumEvenFibonacci(4_000_000));
  }

}
