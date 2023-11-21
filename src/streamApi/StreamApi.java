package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        Integer arr[] = {2 , 40 , 33 , 1 , 0 , 99 , -1};
        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(arr));
        System.out.println(list);
//
//        List<Integer> evenList = new ArrayList();
//        for(Integer num : list) {
//            if(num % 2 == 0) {
//                evenList.add(num);
//            }
//        }
//
//        System.out.println(evenList);
//        Arrays.stream(arr).peek(i-> System.out.println(i));
//        with stream we can achieve this operation.
            List<Integer> evenList = list.stream().map((i)->i%2).collect(Collectors.toList());
            System.out.println(evenList);
    }
}
