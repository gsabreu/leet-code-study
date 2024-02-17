package problems;

import java.util.List;

public class JumpingOnClouds {

    //thunderheads or cumulus
    //Jumping in cumulus -> = to currentCloud + 1 or 2
    //avoid  thunderheads
    //min number of jumps from begginish to the last cloud
    // 0 safe , 1 avoided

    public static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;
        int cumulus = 0;

        for(int i = 0; i < c.size()-1; i++){
            if(i<c.size()-2 && c.get(i+2)==cumulus){
                i++;
                jumps++;
            } else if(c.get(i+1)==cumulus){
                jumps++;
            }
        }
        return jumps;
    }
}
