package darkcoderrises;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        solution(3,"1A 1K 2E 3D 3E 1F");
    }

    private static void solution(int N, String s) {
        List<String> l = Arrays.asList(new String[]{"ABC","DEFG","HJK"});
        int totalSeats=0;
        String[] arr = s.split(" ");
        Map<String,String> map = new HashMap<>();
        Arrays.sort(arr);
        for(String str: arr){
            int i = Integer.parseInt(str.substring(0,1));
            String c = str.substring(1,2);
            if(l.get(0).contains(c) ){
                map.put(l.get(0),map.get(l.get(0))+i);
                continue;

            }else if( l.get(2).contains(c)){
                map.put(l.get(2),map.get(l.get(2))+i);
                continue;

            } if(!(l.get(1).startsWith(c) || l.get(1).endsWith(c))) {
                map.put(l.get(1), map.get(l.get(1)) + i);
                continue;

            }

        }

        for(int r =1; r<=N;r++){
            if(!map.get(l.get(0)).contains(""+r)){
                totalSeats+=1;
            }
            if(!map.get(l.get(1)).contains(""+r)){
                totalSeats+=1;
            }
            if(!map.get(l.get(2)).contains(""+r)){
                totalSeats+=1;
            }
        }

      System.out.println(totalSeats);

    }
}
