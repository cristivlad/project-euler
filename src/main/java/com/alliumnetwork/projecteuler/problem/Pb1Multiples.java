package com.alliumnetwork.projecteuler.problem;

import java.util.stream.IntStream;

public class Pb1Multiples {

  private static long sumMultiples(int n) {
    return IntStream.range(0, n).filter(i -> i % 3 == 0 || i % 5 == 0).asLongStream().sum();
  }

  public static void main(String[] args) {
    System.out.println(sumMultiples(10));
    System.out.println(sumMultiples(1000));
  }

}
