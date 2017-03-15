package Strategy;

/**
 * Created by SHYRIK on 16.02.2017.
 */
public class StrategyMain {
    public static  void main(String[]args){
           int[] a = {11,4,55,33,111,99,55,33,1};
           Context context = new Context();
           context.setSort(new AaverageSort());
           context.show(a);

    }
}
interface Sort{
    void show(int[] array);
}
class Context {
    Sort sort;
    public void setSort(Sort sort) {this.sort = sort;}
    public void show(int [] array){
        sort.show(array);
    }
}




class MaxSort implements  Sort {
    @Override
    public void show(int[] array) {
         int maxValue = array[0];
         for(int i = 0; i < array.length;i++){
            if(maxValue < array[i]){
                maxValue = array[i];
            }
        }
        System.out.println("max value is :"+maxValue);
    }
}
class MinSort implements Sort {
    @Override
    public void show(int[] array) {
        int maxValue = array[0];
        for(int i = 0; i < array.length;i++){
            if(maxValue > array[i]){
                maxValue = array[i];
            }
        }
        System.out.println("min value is  : "+maxValue);
    }
}
class AaverageSort implements Sort {
    @Override
    public void show(int[] array) {
         int value = 0;
        for(int i = 0; i < array.length;i++){
            value = value + array[i];
            value = value / 2;
        }
        System.out.println("middle value is  : "+value);
    }
}
