package com.xor.sorted.sorts;

import com.xor.sorted.sorts.Sort;
import java.util.ArrayList;
import java.util.Random;

import com.xor.sorted.Sorter;

public class Bubble extends Sort {

  public Bubble(Sorter sorter, int delay){
    super(sorter, delay);
  }

  public Bubble(Sorter sorter){
    super(sorter);
  }

  public void sortImpl(){
    int i = 0;
    int n = list.size();
    int j = 1;
    Random rand = new Random();
    while (compareVal(n, i)) {
      j = 1;
      while(compareVal(n-i, j)) {
        if(compare(j-1, j)){
          swap(j-1, j);
          if(shouldKill()) return;
        } else {
          list.add(rand.nextInt(801));
          n = list.size();
        }
        j++;
      }
      i++;
    }

  }

}

