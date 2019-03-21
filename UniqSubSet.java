import java.util.*;
public class  UniqSubSet{
 
  public List<List<Integer>> findSubSet(int[] num) {
   List<List<Integer>> unique_subset = new ArrayList<>();
   List<Integer> list = new ArrayList<>();
   Arrays.sort(num);
   subsetHelper(unique_subset, list, num, 0);

   return unique_subset;
  
  
  }




  private void subsetHelper(List<List<Integer>> result, List<Integer> list, 
                            int[] num, int pos){
    result.add(new ArrayList<Integer>(list));
    System.out.println(result);


    for (int i = pos; i < num.length; ++i) {
      if (i != pos && num[i] == num[i-1]) {
        continue;
      }
      list.add(num[i]);
      subsetHelper(result,list,num,i+1);
      list.remove(list.size()-1);
    }
  }

}
