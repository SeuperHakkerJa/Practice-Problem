// A program that finds all the subset of a given set through a DFS approach.
// The given set does not need to be sorted. This program does NOT avoid redundency.
//
// Author: Xiaochen Li

import java.util.*;
public class Subset{
 
  // change the return type to have the result list returned.
  // It only provides correct algorithm
  public void findSubSet(int[] num) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    subsetHelper(result,list,num,0);

  
  
  }
  private void subsetHelper(List<List<Integer>> result, List<Integer> list, 
                            int[] num, int pos){
    result.add(new ArrayList<Integer>(list));
    System.out.println(result);


    for (int i = pos; i < num.length; ++i) {
      list.add(num[i]);
      subsetHelper(result,list,num,i+1);
      list.remove(list.size()-1);
    }
  }


}
